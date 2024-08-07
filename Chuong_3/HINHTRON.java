package Chuong_3;

import java.util.Scanner;

public class HINHTRON {
//	Thiết kế lớp HINHTRON bao gồm thuộc tính bán kính, các phương thức nhập/xuất/tính diện tích/tính chu vi hình tròn
	
	// Khai báo các thuộc tính
    private double banKinh;
    
    public HINHTRON() {
    	banKinh = 0;
    }
    public HINHTRON(double banKinh) {
    	this.banKinh = banKinh;
    }
    public void nhap() {
    	Scanner in = new Scanner(System.in);
    	System.out.println("Nhập bán kính: ");
    	banKinh = in.nextDouble();
    	in.close();
    }
    public void xuat() {
    	System.out.println("Bán kính: "+banKinh);
    }
    public double DienTich() {
    	return Math.PI * Math.pow(banKinh, 2);
    }
    public double ChuVi() {
    	return 2*Math.PI*banKinh;
    }
    public static void main(String[] args) {
		HINHTRON hinhtron = new HINHTRON();
		hinhtron.nhap();
		hinhtron.xuat();
		System.out.println("Diện tích: "+hinhtron.DienTich());
		System.out.println("Chu vi: "+hinhtron.ChuVi());
	}
}
