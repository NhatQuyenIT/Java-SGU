package Chuong_1;

import java.util.Scanner;

public class BT_3 {

	public static void main(String[] args) {
		// Nhap ban kinh hinh tron. Tinh chu vi, dien tich hinh tron.
		Scanner input=new Scanner(System.in);
		System.out.println("Nhap ban kinh:");
		float banKinh=input.nextFloat();
		double chuVi=2*Math.PI*banKinh;
		double dienTich=Math.PI*Math.pow(banKinh, 2);
//		double dienTich=Math.PI*Math.pow(banKinh, 2);
		System.out.println("Chu vi="+String.format("%.2f",chuVi));
		System.out.println("Dien tich="+String.format("%.2f",dienTich));// dinh dang so thuc
		input.close();

	}

}
