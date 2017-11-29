package com.itsol.jdbc;

import java.util.Scanner;

public class Login {
	static Scanner sc = new Scanner(System.in);
	public static int getID() {
		System.out.print("Nhap ID: ");
		int id = 0;
		try {
			id = Integer.parseInt(sc.nextLine());
		}
		catch(NumberFormatException e) {
			System.out.println(e);
		}
		return id;
	}
	public static String getLop() {
		System.out.print("Nhap ten lop: ");
		String lop = sc.nextLine();
		return lop;
	}	
	public static String getHoTen() {
		System.out.print("Nhap ho ten: ");
		String hoTen = sc.nextLine();
		return hoTen;
	}
	public static String getEmail() {
		System.out.print("Nhap email: ");
		String email = sc.nextLine();
		return email;
	}
	public static String getSDT() {
		System.out.print("Nhap SDT: ");
		String sdt = sc.nextLine();
		return sdt;
	}
	
	public static GiaoVu getAcc() {
		System.out.println("Nhap account: ");
		String acc = sc.nextLine();
		System.out.println("Nhap first name: ");
		String firstName = sc.nextLine();
		System.out.println("Nhap last name: ");
		String lastName = sc.nextLine();
		System.out.println("Nhap email: " );
		String email = sc.nextLine();
		GiaoVu gv = new GiaoVu(acc, firstName, lastName, email);
		return gv;
	}
	public static void menu() {
		OracleConnect.showData(OracleConnect.accessDatabase());
		System.out.println();
		System.out.println("Nhap 1 de loc hoc vien theo lop: ");
		System.out.println("Nhap 2 de tim kiem hoc vien: ");
		System.out.println("Nhap 3 de them/sua/xoa hoc vien: ");
		System.out.println();
		int check;
		check = Integer.parseInt(sc.nextLine());
		switch (check) {
			case 1: 
				OracleConnect.locTheoLop(OracleConnect.accessDatabase());
				break;
			case 2: 
				System.out.println("Nhap 1 de tim kiem theo ho ten: ");
				System.out.println("Nhap 2 de tim kiem theo email: ");
				System.out.println("Nhap 3 de tim kiem theo SDT: ");
				check = Integer.parseInt(sc.nextLine());
				switch(check) {
					case 1: 
						OracleConnect.timKiemTheoHoTen(OracleConnect.accessDatabase(), getHoTen());
						break;
					case 2:
						OracleConnect.timKiemTheoEmail(OracleConnect.accessDatabase(), getEmail());
						break;
					case 3:
						OracleConnect.timKiemTheoSDT(OracleConnect.accessDatabase(), getSDT());
						break;
				}
				break;			
			case 3: 
				System.out.println("Nhap 1 de them hoc vien: ");
				System.out.println("Nhap 2 de sua thong tin hoc vien: ");
				System.out.println("Nhap 3 de xoa hoc vien: ");
				check = Integer.parseInt(sc.nextLine());
				switch(check) {
					case 1:
						OracleConnect.themHocVien(OracleConnect.accessDatabase(), getID(), getHoTen(), getEmail(), getSDT(), getLop());
						break;
					case 2:
						System.out.println("Nhap ID hoc vien can sua thong tin: ");
						int oldID = Integer.parseInt(sc.nextLine());
						OracleConnect.suaThongTin(OracleConnect.accessDatabase(), oldID, getID(), getHoTen(), getEmail(), getSDT(), getLop());
						break;
					case 3: 
						OracleConnect.xoaHocVien(OracleConnect.accessDatabase(), getID());
						break;
						
				}
				break;
		}
	}
}
