package com.itsol.ex07.database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import com.itsol.ex07.entity.*;
//import com.oracle.wls.shaded.org.apache.regexp.recompile;

//import oracle.jdbc.proxy.annotation.Pre;

public class GetData {
	public static List<Car> getListCar(Connection conn) throws SQLException{
		String sql = "select * from car";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Car> listCar= new ArrayList<Car>();
		while (rs.next()) {
			String id = rs.getString(1);
			String numberPlate = rs.getString(3);
            int yearOfManufacture = rs.getInt(4);
            String brand = rs.getString(5);
            boolean haveInsurance = rs.getBoolean(6);
            Car car = new Car(id, numberPlate, yearOfManufacture, brand, haveInsurance);
            listCar.add(car);

        }
        return listCar;
	}
	public static List<Insurance> getListInsurance(Connection conn) throws SQLException{
		String sql = "select * from insurance";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Insurance> listInsurance = new ArrayList<Insurance>();
		while(rs.next()) {
			String id = rs.getString(1);
			String packetType = rs.getString(2);
			Insurance ins = new Insurance(id, packetType);
			listInsurance.add(ins);
		}
		return listInsurance;
	}
	
	public static List<Car> getListCarHaveNotInsurance(Connection conn) throws SQLException{
		String sql = "select * from car where have_insurance = 0";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List <Car> listCar = new ArrayList<Car>();
		while (rs.next()) {
			String id = rs.getString(1);
			String numberPlate = rs.getString(3);
            int yearOfManufacture = rs.getInt(4);
            String brand = rs.getString(5);
            boolean haveInsurance = rs.getBoolean(6);
            Car car = new Car(id, numberPlate, yearOfManufacture, brand, haveInsurance);
            listCar.add(car);

        }
        return listCar;
	}
	public static void buyInsurance(Connection conn, String carId) throws SQLException {
		String sql = "select type from car where id = ?";
		PreparedStatement pstm = null;
		pstm = conn.prepareStatement(sql);
		pstm.setString(1, carId);
		ResultSet rs = null;
		rs = pstm.executeQuery();
		String carType = null;
		if(rs.next())
			carType = rs.getString(1);
		String insuranceType = null;
		String insuranceId = null;
		if(carType == "Modern") insuranceType = "A";
		else if(carType == "Medium") insuranceType = "B";
		else insuranceType = "C";
		//lay danh sach bao hiem chua su dung
		Statement stmt = conn.createStatement();
		rs = stmt.executeQuery("select *  from insurance where not exists (select insurance_package.INSURANCE_ID from insurance_package where insurance.id = insurance_package.insurance_id)");
		List<Insurance> listInsurance = new ArrayList<Insurance>();
		while(rs.next()) {
			String id = rs.getString(1);
			String packetType = rs.getString(2);
			Insurance ins = new Insurance(id, packetType);
			listInsurance.add(ins);
		}
		int check = 0;
		for(int i=0; i<listInsurance.size(); i++) {
			if(insuranceType.equals(listInsurance.get(i).getPackageType())) {
				insuranceId = listInsurance.get(i).getId();
				//sua thuoc tinh table car: haveInsurance -> true
				pstm = conn.prepareStatement("update car set have_insurance = '1' where id = ?");
				pstm.setString(1, carId);
				pstm.executeQuery();
				//chen 1 cot vao bang insurance_package
				pstm = conn.prepareStatement("insert into INSURANCE_PACKAGE (car_id, insurance_id) values(?,?)");
				pstm.setString(1, carId);
				pstm.setString(2, insuranceId);
				pstm.executeQuery();
				System.out.println("Mua bao hiem thanh cong");
				break;
			}
			check ++;
		}
		if(check == listInsurance.size()) 
			System.out.println("Het goi bao hiem phu hop");

	}

}
	

