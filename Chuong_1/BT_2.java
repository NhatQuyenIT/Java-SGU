package Chuong_1;

import java.util.Scanner;

public class BT_2 {

	public static void main(String[] args) {
		//  Viết chương trình nhập chiều dài, chiều rộng hình chữ nhật
		// 	xuất chu vi, diện tích của hình chữ nhật đó.
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		int chieudai = in.nextInt();
		System.out.println("Nhap chieu rong: ");
		int chieurong = in.nextInt();
		double chuvi = (chieudai + chieurong)*2;
		double dientich = chieudai*chieurong;
		System.out.println("Chu vi HCN: "+chuvi);
		System.out.println("Dien tich HCN: "+dientich);
		in.close();
	}

}
