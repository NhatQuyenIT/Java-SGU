package Chuong_3;

public class PhanSo_Main {
	public static void main(String[] args) {
		PhanSo ps1 = new PhanSo(1, 2);
        ps1.xuat(); // Xuất: 1/2
        
        ps1.nghichDao();
        ps1.xuat(); // Xuất: 2/1
        
        PhanSo ps2 = new PhanSo(3, 4);
        PhanSo ps3 = ps1.tong(ps2);
        ps3.xuat(); // Xuất: 11/4
	}
}
