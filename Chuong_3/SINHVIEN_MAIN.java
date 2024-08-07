package Chuong_3;

public class SINHVIEN_MAIN {
	public static void main(String[] args) {
		SINHVIEN sv = new SINHVIEN();
	      sv.nhap();
	      sv.xuat();
	      System.out.println("--------------------");
	      System.out.println("Điểm trung bình: " + sv.tinhDiemTB());
	      System.out.println("Xếp loại: " + sv.xepLoai());
	}
}
