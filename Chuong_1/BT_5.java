package Chuong_1;

import java.util.Scanner;

public class BT_5 {

	public static void main(String[] args) {
		// Viết chương trình nhập số nguyên N, kiểm tra và xuất kết quả N là số âm/zero/dương
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao so nguyen N: ");
		int N = in.nextInt();
		if (N==0) {
			System.out.println("La so zero!");
		}else if(N<0) {
			System.out.println("La so am!");
		}else {
			System.out.println("La so duong!");
		}
		in.close();
	}
}
