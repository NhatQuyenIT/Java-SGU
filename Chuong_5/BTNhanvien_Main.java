package Chuong_5;

public class BTNhanvien_Main {

	public static void main(String[] args) {
		 DSNV dsNV = new DSNV();

	        System.out.println("------Nhập danh sách nhân viên------");
	        dsNV.nhap();

            System.out.println("--------------------------");
	        System.out.println("Xuất thông tin nhân viên:");
	        dsNV.xuat();

	        System.out.println("Xuất thông tin lương của nhân viên:");
	        dsNV.xuatluong();
	}

}
