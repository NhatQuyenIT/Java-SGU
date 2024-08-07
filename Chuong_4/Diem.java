package Chuong_4;

class Diem {
    protected int x;
    protected int y;

    public Diem() {
    	x = 0;
    	y = 0;
    }
    public Diem(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void nhap() {
        // Hàm nhập giá trị cho x và y (int)
        // Code để nhập giá trị x và y từ người dùng
    }

    public void xuat() {
        // Hàm xuất giá trị của x và y
        System.out.println("Giá trị của x: " + x);
        System.out.println("Giá trị của y: " + y);
    }
}

