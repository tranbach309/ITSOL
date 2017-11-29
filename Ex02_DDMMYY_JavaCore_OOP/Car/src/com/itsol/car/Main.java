package com.itsol.car;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void new10Car() {
		Random r = new Random();
		int rand;
		ArrayList<String> listBrand = new ArrayList<String>();
		listBrand.add("TOYOTA");
		listBrand.add("BMW");
		listBrand.add("HUYNDAI");
		String info;
		try {
			FileOutputStream fos = null;
			for(int i = 0; i < 10; i++) {
				//random new Car
				rand = r.nextInt(3);
				Car c = null;
				switch(rand) {
					case 0: 
						c = new ModernCar(r.nextInt(99999), r.nextInt(2012-2005)+2005, listBrand.get(r.nextInt(listBrand.size())), r.nextBoolean(), r.nextBoolean());
						fos = new FileOutputStream(c.getPath(), true);
						info = c.getNumberPlate()+ " " + c.getYearOfManufactury() + " " + c.getBrand() + " " +c.getHaveInsurance() + "\r\n";
						fos.write(info.getBytes());
						break;
					case 1: 
						c = new MediumCar(r.nextInt(99999), r.nextInt(2004-1996)+1996, listBrand.get(r.nextInt(listBrand.size())), r.nextBoolean(), r.nextBoolean());
						fos = new FileOutputStream(c.getPath(), true);
						info = c.getNumberPlate()+ " " + c.getYearOfManufactury() + " " + c.getBrand() + " " +c.getHaveInsurance() + "\r\n";
						fos.write(info.getBytes());
						break;
					case 2: 
						c = new OldCar(r.nextInt(99999), r.nextInt(1995-1980)+1980, listBrand.get(r.nextInt(listBrand.size())), r.nextBoolean(), r.nextInt(10));
						fos = new FileOutputStream(c.getPath(), true);
						info = c.getNumberPlate()+ " " + c.getYearOfManufactury() + " " + c.getBrand() + " " +c.getHaveInsurance() + "\r\n";
						fos.write(info.getBytes());
						break;
				}
			}
			fos.close();
		}
		catch(IOException e) {
			System.out.println("Error" + e);
		}
	}
	public static void new10Insurance() {
		Random r = new Random();
		int rand;
		ArrayList<String> listType = new ArrayList<String>();
		listType.add("A");
		listType.add("B");
		listType.add("C");
		String info = null;
		try {
			FileOutputStream fos = null;
			for(int i = 0; i < 10; i++) {
				//random new insurance
				rand = r.nextInt(3);
				Insurance ins = null;
				switch(rand) {
					case 0:
						ins = new Insurance(listType.get(r.nextInt(listType.size())));
						fos = new FileOutputStream(ins.getPath(), true);
						info = ins.getType() + "\r\n";
						fos.write(info.getBytes());
						break;
					case 1:
						ins = new Insurance(listType.get(r.nextInt(listType.size())));
						fos = new FileOutputStream(ins.getPath(), true);
						info = ins.getType() + "\r\n";
						fos.write(info.getBytes());
						break;	
					case 2:
						ins = new Insurance(listType.get(r.nextInt(listType.size())));
						fos = new FileOutputStream(ins.getPath(), true);
						info = ins.getType() + "\r\n";
						fos.write(info.getBytes());
						break;
				}
			}
			fos.close();
		}
		catch(IOException e) {
			System.out.println("Error" + e);
		}
	}
	public static void display() throws IOException {
		int check;
		Car c = null;
		System.out.println("Bam 1 de hien thi danh sach Modern Car: ");
		System.out.println("Bam 2 de hien thi danh sach Medium Car: ");
		System.out.println("Bam 3 de hien thi danh sach Old Car: ");
		Scanner sc = new Scanner(System.in);
		FileInputStream fis = null;
		Scanner scanner = null;
		check = sc.nextInt();
		switch(check) {
			case 1: 
				c = new ModernCar();
				fis = new FileInputStream(c.getPath());
				scanner = new Scanner(fis);
				while(scanner.hasNextLine()) {
					c.setNumberPlate(Integer.parseInt(scanner.next()));
					c.setYearOfManufactury(Integer.parseInt(scanner.next()));
					c.setBrand(scanner.next());
					c.setHaveInsurance(Boolean.parseBoolean(scanner.next()));
					if(!scanner.hasNext()) break;
					System.out.println(c.showInfoCar());
				}
				break;
			case 2:
				c = new MediumCar();
				fis = new FileInputStream(c.getPath());
				scanner = new Scanner(fis);
				while(scanner.hasNextLine()) {
					c.setNumberPlate(Integer.parseInt(scanner.next()));
					c.setYearOfManufactury(Integer.parseInt(scanner.next()));
					c.setBrand(scanner.next());
					c.setHaveInsurance(Boolean.parseBoolean(scanner.next()));
					if(!scanner.hasNext()) break;
					System.out.println(c.showInfoCar());
				}
				break;
			case 3: 
				c = new MediumCar();
				fis = new FileInputStream(c.getPath());
				scanner = new Scanner(fis);
				while(scanner.hasNextLine()) {
					c.setNumberPlate(Integer.parseInt(scanner.next()));
					c.setYearOfManufactury(Integer.parseInt(scanner.next()));
					c.setBrand(scanner.next());
					c.setHaveInsurance(Boolean.parseBoolean(scanner.next()));
					if(!scanner.hasNext()) break;
					System.out.println(c.showInfoCar());
				}
				break;
		}
		scanner.close();
		sc.close();
		
	}
	public static void main(String[] args) throws IOException {
		System.out.println("Nhap 1 de mua tao 10 xe: ");
		System.out.println("Nhap 2 de mua tao 10 bao hiem ");
		System.out.println("Nhap 3 de hien thi thong tin xe ");
		Scanner sc = new Scanner(System.in);
		int check = sc.nextInt();
		switch(check) {
			case 1: 
				new10Car();
				break;
			case 2: 
				new10Insurance();
				break;
			case 3:
				display();
				break;
		}

		
		
		
		
	}

}
