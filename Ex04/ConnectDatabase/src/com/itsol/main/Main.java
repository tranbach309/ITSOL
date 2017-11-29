package com.itsol.jdbc;

import java.util.Scanner;
//acc: bachct

public class Main {
	static final String acc = "bachct";
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GiaoVu gv = Login.getAcc();
		if(gv.getAcc().equals(acc)) {
			boolean toBeContinune;
			do {
				Login.menu();
				System.out.println("Nhap true de tiep tuc, false de thoat: ");
				toBeContinune = sc.nextBoolean();
			}
			while (toBeContinune);
		}
		else
			System.out.println("Wrong acc!");
		sc.close();
	}
}
