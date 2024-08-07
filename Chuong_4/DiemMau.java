package Chuong_4;

class DiemMau extends Diem {
    protected int mau;

    public DiemMau(int x, int y, int mau) {
        super(x, y);
        this.mau = mau;
    }

    public void nhap() {
        // Gọi phương thức nhập của lớp cha để nhập x và y
        super.nhap();
        // Hàm nhập giá trị cho mau (int)
        // Code để nhập giá trị mau từ người dùng
    }

    public void xuat() {
        // Gọi phương thức xuất của lớp cha để xuất x và y
        super.xuat();
        // Hàm xuất giá trị của mau
        System.out.println("Giá trị của màu: " + mau);
    }
}

