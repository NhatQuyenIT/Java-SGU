package Chuong_1;

import java.util.Scanner;

public class BT_1 {

	public static void main(String[] args) {
		// Viết chương trình nhập 2 số nguyên, xuất tổng, hiệu, tích, thương.
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen thu 1:");
		int so_1= in.nextInt();
		System.out.println("Nhap vao so nguyen thu 2:");
		int so_2= in.nextInt();
		int tong = so_1 + so_2;
		int hieu = so_1 - so_2;
		int tich = so_1 * so_2;
		float thuong_TH1 = so_1/so_2;
		float thuong_TH2 = so_1%so_2;
		System.out.println("Tong = "+tong);
		System.out.println("Hieu = "+hieu);
		System.out.println("Tich = "+tich);
		System.out.println("Thuong 1 = "+thuong_TH1);
		System.out.println("Thuong 2 = "+thuong_TH2);
		in.close();
	}
}
