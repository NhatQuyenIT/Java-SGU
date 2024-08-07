package Chuong_6;

import java.util.Scanner;

public class VPP_Main {

	    public static void main(String[] args) {
	        DanhSachVanPhongPham danhSachVP = new DanhSachVanPhongPham();
	        Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("1. Thêm văn phòng phẩm");
	            System.out.println("2. Hiển thị danh sách");
	            System.out.println("3. Thoát");
	            System.out.print("Chọn: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine(); // Đọc dòng trống sau khi đọc số

	            switch (choice) {
	                case 1:
	                    danhSachVP.themVanPhongPham();
	                    break;
	                case 2:
	                    danhSachVP.hienThiDanhSach();
	                    break;
	                case 3:
	                    System.out.println("Chương trình kết thúc.");
	                    System.exit(0);
	                default:
	                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
	            }
	       }
	 }
}
