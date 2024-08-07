package Chuong_5;

import java.util.Scanner;

abstract class HinhHoc {
    abstract void tinhDienTich();
    abstract void tinhChuVi();
    abstract void nhap();
    abstract void xuat();
}

class HinhTron extends HinhHoc {
    double banKinh;

    HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    @Override
    void tinhDienTich() {
        double dienTich = Math.PI * banKinh * banKinh;
        System.out.println("Diện tích hình tròn: " + dienTich);
    }

    @Override
    void tinhChuVi() {
        double chuVi = 2 * Math.PI * banKinh;
        System.out.println("Chu vi hình tròn: " + chuVi);
    }

    @Override
    void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập bán kính hình tròn: ");
        banKinh = scanner.nextDouble();
        
    }

    @Override
    void xuat() {
        System.out.println("Hình tròn - Bán kính: " + banKinh);
    }
}

class HinhChuNhat extends HinhHoc {
    double chieuDai;
    double chieuRong;

    HinhChuNhat(double chieuDai, double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    @Override
    void tinhDienTich() {
        double dienTich = chieuDai * chieuRong;
        System.out.println("Diện tích hình chữ nhật: " + dienTich);
    }

    @Override
    void tinhChuVi() {
        double chuVi = 2 * (chieuDai + chieuRong);
        System.out.println("Chu vi hình chữ nhật: " + chuVi);
    }

    @Override
    void nhap() { 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều dài hình chữ nhật: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Nhập chiều rộng hình chữ nhật: ");
        chieuRong = scanner.nextDouble();
        
    }

    @Override
    void xuat() {
        System.out.println("Hình chữ nhật - Chiều dài: " + chieuDai + ", Chiều rộng: " + chieuRong);
    }
}
