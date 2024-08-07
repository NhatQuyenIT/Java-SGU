package Chuong_3;

import java.util.Scanner;

public class ThueBaoDT {
/*Thiết kế lớp ThueBaoDT:
		-	Gồm 3 biến thuộc tính private là: số điện thoại (string), họ tên chủ thuê bao (string), số phút gọi trong tháng (int).
		-	Xây dựng thuộc tính get/set cho 3 biến thuộc tính này.
		-	Xây dựng 2 hàm thiết lập:
		+ có 2 tham số là số điện thoại và họ tên, số phút gọi được khởi tạo là 0.
		+ có 3 tham số ứng với 3 thuộc tính.
		-	Xây dựng các hàm thành viên sau:
		+ nhap(): nhập thông tin số ĐT, họ tên, số phút từ màn hình.
		+ xuat(): xuất ra màn hình tất cả các thông tin về thuê bao, bao gồm cước.
		+ int tinhcuoc(): tính cước điện thoại của thuê bao trong tháng, cước thuê bao là 20.000đ/tháng, cước gọi là 200đ/ phút. */
	private String SDT;
	private String HoTen;
	private int SoPhut;
	
	public String getSDT() {
		return SDT;
	}
	public void setSDT(String SDT) {
		this.SDT = SDT;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String HoTen) {
		this.HoTen = HoTen;
	}
	public int getSoPhut() {
		return SoPhut;
	}
	public void setSoPhut(int SoPhut) {
		this.SoPhut = SoPhut;
	}
	public ThueBaoDT(String SDT, String HoTen) {
		this.SDT = SDT;
		this.HoTen = HoTen;
		this.SoPhut = 0;
	}
	public ThueBaoDT(String SDT, String HoTen, int SoPhut) {
		this.SDT = SDT;
		this.HoTen = HoTen;
		this.SoPhut = SoPhut;
	}
	public void nhap() {
		Scanner in = new Scanner(System.in);
		System.out.print("Nhập Số Điện Thoại: ");
		SDT = in.nextLine();
		System.out.print("Nhập Họ Tên: ");
		HoTen = in.nextLine();
		System.out.print("Nhập Số phút gọi: ");
		SoPhut = in.nextInt();
		in.close();
	}
	public void xuat() {
		System.out.println(getSDT()+" "+getHoTen()+" "+getSoPhut()+" "+tinhcuoc());
	}
	public int tinhcuoc() {
		return (getSoPhut()*200)+20000;
	}
}