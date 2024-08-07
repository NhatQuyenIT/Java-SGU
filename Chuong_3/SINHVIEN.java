package Chuong_3;

import java.util.Scanner;

public class SINHVIEN {
//	Thiết kế lớp SINHVIEN bao gồm các thuộc tính: mã sinh viên, họ tên, lớp, điểm môn 1, điểm môn 2, điểm môn 3, 
//	các phương thức nhập, xuất, tính điểm trung bình, xếp loại
	private long maSV;
	private String hoTen;
	private String lop;
	private double diem1;
	private double diem2;
	private double diem3;
	
	public SINHVIEN() {
		maSV = 0;
		hoTen = "";
		lop = "";
		diem1=0;
		diem2=0;
		diem3=0;
	}
	public SINHVIEN(long maSV, String hoTen, String lop, double diem1, double diem2, double diem3) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.lop = lop;
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}
	public void nhap() {
	    Scanner in = new Scanner(System.in);
	    System.out.print("Nhập mã sinh viên: ");
	    maSV = in.nextLong(); 
	    in.nextLine();//đọc bỏ ký tự xuống dòng
	    System.out.print("Nhập họ tên: ");
	    hoTen = in.nextLine();
	    System.out.print("Nhập lớp: ");
	    lop = in.nextLine();
	    System.out.print("Nhập điểm môn 1: ");
	    diem1 = in.nextDouble();
	    System.out.print("Nhập điểm môn 2: ");
	    diem2 = in.nextDouble();
	    System.out.print("Nhập điểm môn 3: ");
	    diem3 = in.nextDouble();
	    in.close();
	}

	public void xuat() {
	    System.out.println("Mã sinh viên: " + maSV);
	    System.out.println("Họ tên: " + hoTen);
	    System.out.println("Lớp: " + lop);
	    System.out.println("Điểm môn 1: " + diem1);
	    System.out.println("Điểm môn 2: " + diem2);
	    System.out.println("Điểm môn 3: " + diem3);
	}
	public double tinhDiemTB() {
		   return (diem1 + diem2 + diem3) / 3;
		}

		public String xepLoai() {
		   double diemTB = tinhDiemTB();
		   if (diemTB >= 8) {
		      return "Giỏi";
		   } else if (diemTB >= 6.5) {
		      return "Khá";
		   } else if (diemTB >= 5) {
		      return "Trung bình";
		   } else {
		      return "Yếu";
		   }
		}
}
