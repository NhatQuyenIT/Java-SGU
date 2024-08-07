package Chuong_1;

import java.util.Scanner;

public class BT_4 {

	public static void main(String[] args) {
		//Viết chương trình nhập số nguyên N, kiểm tra và xuất kết quả N là số chẵn/lẻ
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap so nguyen N: ");
		int N = in.nextInt();
		if (N%2==0) {
			System.out.println(N + " La so chan");
		} else {
			System.out.println(N + " La so le");
		}
		
		String kl = (N%2==0)? "La so chan" : "La so le";
		System.out.println(N + " " + kl);
		in.close();
	}

}
