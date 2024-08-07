package Chuong_1;

import java.util.Scanner;

public class Cau_1 {

	public static void main(String[] args) {
		// Nhap vao 2 so m,n. Tim max trong 2 so.
		Scanner scanner=new Scanner(System.in);
		System.out.println("Nhap so m:");
		int m=scanner.nextInt();
		System.out.println("Nhap so n:");
		int n=scanner.nextInt();
		
	//  Cach 1:
//		int max=m;
//		if(n>max) max=n;

		
	//	Cach 2:
		int max=(m>n)?m:n;
		System.out.println("Max="+max);
		scanner.close();
	}

}
