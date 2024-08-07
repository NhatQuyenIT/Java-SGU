package Chuong_3;

import java.util.Scanner;

public class HINHCHUNHAT {
	//Thiết kế lớp HINHCHUNHAT bao gồm các thuộc tính chiều dài, chiều rộng, các phương thức nhập/xuất/tính diện tích/tính chu vi hình chữ nhật

    // Khai báo các thuộc tính
    private double cd; 
    private double cr; 

    // Phương thức khởi tạo không tham số
    public HINHCHUNHAT() {
        cd = 0;
        cr = 0;
    }

    // Phương thức khởi tạo có tham số
    public HINHCHUNHAT(double cd, double cr) {
        this.cd = cd;
        this.cr = cr;
    }

    // Phương thức nhập chiều dài, chiều rộng từ bàn phím
    public void nhap() {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhập chiều dài: ");
        cd = in.nextDouble();
        System.out.print("Nhập chiều rộng: ");
        cr = in.nextDouble();
        in.close();
    }

    // Phương thức xuất tọa độ điểm ra màn hình
    public void xuat() {
        System.out.println("Chiều dài:"+cd);
        System.out.println("Chiều rộng:"+cr);
    }   
    public double DienTich() {
    	return cd*cr;
    }
    public double ChuVi() {
    	return (cd+cr)*2;
    }
    public static void main(String[] args) {
		HINHCHUNHAT hcn = new HINHCHUNHAT();
		hcn.nhap();
		hcn.xuat();
		System.out.println("Diện tích HCN:"+hcn.DienTich());
		System.out.println("Chu vi HCN:"+hcn.ChuVi());
	}
}
