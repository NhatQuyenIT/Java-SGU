package Chuong_1;

import java.util.Scanner;

public class BT_6 {

	public static void main(String[] args) {
		// Viết chương trình nhập số tự nhiên N, kiểm tra và xuất kết quả N là số nguyên tố hay không.
		Scanner in = new Scanner(System.in);
		System.out.println("Nhap vao N: ");
		int N = in.nextInt();
		boolean soNT=true;
		if(N<2) soNT=false;
		for (int i=2; i<=Math.sqrt(N); i++) {
			if(N%i==0) {
				soNT=false;
				break;
			}
		}
		String kl = (soNT==true)?" Là số NT":" Không là số NT";
		System.out.println(N + kl);
		in.close();
	}

}
