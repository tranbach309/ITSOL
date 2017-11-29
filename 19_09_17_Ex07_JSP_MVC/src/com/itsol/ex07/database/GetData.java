package com.itsol.ex07.database;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import com.itsol.ex07.entity.*;

public class GetData {
	public static List<Car> getListCar(Connection conn) throws SQLException{
		String sql = "select * from car";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Car> listCar= new ArrayList<Car>();
		while (rs.next()) {
            int numberPlate = rs.getInt(2);
            int yearOfManufacture = rs.getInt(3);
            String brand = rs.getString(4);
            boolean haveInsurance = rs.getBoolean(5);
            Car car = new Car(numberPlate, yearOfManufacture, brand, haveInsurance);
            listCar.add(car);

        }
        return listCar;
	}
	public static List<Insurance> getListInsurance(Connection conn) throws SQLException{
		String sql = "select * from insurance";
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		List<Insurance> listInsurace = new ArrayList<Insurance>();
		while(rs.next()) {
			int id = rs.getInt(1);
			String packetType = rs.getString(2);
			Insurance ins = new Insurance(id, packetType);
			listInsurace.add(ins);
		}
		return listInsurace;
	}
}
	

