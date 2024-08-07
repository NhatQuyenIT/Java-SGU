package Chuong_3;

public class NgayThangNam_Main {

	public static void main(String[] args) {
		
		// Sử dụng constructor không tham số
		NgayThangNam date1 = new NgayThangNam();
        date1.xuat();
        
        // Sử dụng constructor có tham số
        NgayThangNam date2 = new NgayThangNam(10, 10, 2023);
        date2.xuat();
        
        // Sử dụng phương thức nhập dữ liệu
        NgayThangNam date3 = new NgayThangNam();
        date3.nhap(4, 10, 2022);
        date3.xuat();;
	}

}
