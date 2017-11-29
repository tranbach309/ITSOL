package com.itsol.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class OracleConnect {
	public final static String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";
	public final static String DB_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	public final static String USER = "bachct";
	public final static String PASS = "123456";
		
	public static Connection accessDatabase() {
		Connection con = null;
		try {
			Class.forName(JDBC_DRIVER);
			System.out.println("Connecting to database ...");
			System.out.println();
			con = DriverManager.getConnection(DB_URL,USER,PASS);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}
	public static void showData(Connection con) {
		System.out.println("Danh sach hoc vien: " + "\r\n");
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from HOCVIEN");
			printData(rs);
		}
		catch(SQLException e) {
			System.out.println(e);
		}
	}
	public static void printData(ResultSet rs) {
		//System.out.println("ID" + "\t" + "HoTen" + "\t" + "Email" + "\t" + "SDT" + "\t" + "Lop" + "\t" + "Ghi chu");
		try {
			while(rs.next())
				System.out.println(rs.getInt(1) + "\t" + rs.getString(2) + "\t" + rs.getString(3) + "\t" + rs.getString(4) + "\t" +rs.getString(5) + "\t" + rs.getString(6));
			}
		catch(SQLException e) {
			System.out.println("e");
		}
	}
	
	public static void locTheoLop(Connection con) {
		System.out.println("Loc hoc vien theo lop: " + "\r\n");
		try {
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from HOCVIEN order by lop");
			printData(rs);
		}
		catch(Exception e) {
			System.out.println(e);
		}

	}
	
	public static void timKiemTheoLop(Connection con, String lop) {
		try {
			String sql = "select * from HOCVIEN where lop = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, lop);
			ResultSet rs = stmt.executeQuery();
			printData(rs);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void timKiemTheoHoTen(Connection con, String hoTen) {
		try {
			String sql = "select * from HOCVIEN where hoten = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, hoTen);
			ResultSet rs = stmt.executeQuery();
			printData(rs);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}	
	public static void timKiemTheoEmail(Connection con, String email) {
		try {
			String sql = "select * from hocvien where email = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, email);
			ResultSet rs = stmt.executeQuery();
			printData(rs);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	public static void timKiemTheoSDT(Connection con, String sdt) {
		try {
			String sql = "select * from HOCVIEN where sdt = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, sdt);
			ResultSet rs = stmt.executeQuery();
			printData(rs);
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	
	public static void xoaHocVien(Connection con, int id) {
		try {
			String sql = "delete from HOCVIEN where id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.executeQuery();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void suaThongTin(Connection con, int oldID, int newID, String hoten, String email, String sdt, String lop) {
		try {
			System.out.println("Nhap thong tin hoc vien can sua: ");
			String sql = "update HOCVIEN set id = ?, hoten = ?, email = ?, sdt = ?, lop = ? where id = ?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, newID);
			stmt.setString(2, hoten);
			stmt.setString(3, email);
			stmt.setString(4, sdt);
			stmt.setString(5, lop);
			stmt.setInt(6, oldID);
			stmt.executeQuery();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
	public static void themHocVien(Connection con, int id, String hoten, String email, String sdt, String lop) {
		try {
			String sql = "insert into HOCVIEN (id, hoten, email, sdt, lop) values (?, ?, ?, ?, ?)";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, id);
			stmt.setString(2, hoten);
			stmt.setString(3, email);
			stmt.setString(4, sdt);
			stmt.setString(5, lop);
			stmt.executeQuery();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}	

}
