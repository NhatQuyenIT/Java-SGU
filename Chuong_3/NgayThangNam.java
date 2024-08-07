package Chuong_3;

//import java.util.Scanner;

	public class NgayThangNam {
		
		private int day;
		private int month;
		private int year;
		
	public NgayThangNam(){
		day = 1;
		month = 1;
		year = 2024; // có thể để trống
	}
	public NgayThangNam(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public void nhap(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	//public void nhap() {
	//	Scanner in = new Scanner(System.in);
	//	System.out.println("Nhập ngày: ");
	//	day = in.nextInt();
	//	System.out.println("Nhập tháng: ");
	//	month = in.nextInt();
	//	System.out.println("Nhập năm: ");
	//	year = in.nextInt();
	//	in.close();
	//}
	public void xuat() {
		System.out.println("Ngày/Tháng/Năm: "+day+"/"+month+"/"+year);
	}
}