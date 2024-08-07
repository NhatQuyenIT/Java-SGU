package Chuong_5;

public class HinhHoc_Main {
    public static void main(String[] args) {
        HinhHoc[] hinhHocArray = new HinhHoc[3];
        hinhHocArray[0] = new HinhTron(5.0);
        hinhHocArray[1] = new HinhChuNhat(3.0,4.0);
        hinhHocArray[2] = new HinhChuNhat(8.0,9.0);
        // lớp hình học là lớp trừ tượng và không khởi tạo đối tượng mới dc nên hong có dụ a[2] = new HinhHoc();

        for (HinhHoc hinhHoc : hinhHocArray) {
            hinhHoc.nhap();
            hinhHoc.xuat();
            hinhHoc.tinhDienTich();
            hinhHoc.tinhChuVi();
            System.out.println("-----------------------");
        }
    }
}
