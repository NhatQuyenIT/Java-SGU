package Chuong_4;

public class Test {
    protected int x;
    protected int y;

public Test(int x, int y) {
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

class Diem_Mau extends Test {
    protected int mau;

    public Diem_Mau(int x, int y, int mau) {
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

class Doan_Thang {
    private DiemMau diemMau1;
    private DiemMau diemMau2;

    public Doan_Thang(DiemMau diem1, DiemMau diem2) {
        this.diemMau1 = diem1;
        this.diemMau2 = diem2;
    }

    public void nhap() {
        // Gọi phương thức nhập của điểm màu 1 và điểm màu 2
        diemMau1.nhap();
        diemMau2.nhap();
    }

    public void xuat() {
        // Gọi phương thức xuất của điểm màu 1 và điểm màu 2
        diemMau1.xuat();
        diemMau2.xuat();
    }

    public double tinhKhoangCach() {
        int x1 = diemMau1.x;
        int y1 = diemMau1.y;
        int x2 = diemMau2.x;
        int y2 = diemMau2.y;

        // Hàm tính khoảng cách giữa 2 điểm
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return distance;
    }

    public void kiemTraCungMau() {
        if (diemMau1.mau == diemMau2.mau) {
            System.out.println("Hai điểm của đoạn thẳng có cùng màu.");
        } else {
            System.out.println("Hai điểm của đoạn thẳng không có cùng màu.");
        }
    }
}
class Run {
    public static void main(String[] args) {
        // Tạo đối tượng đoạn thẳng và kiểm tra các phương thức của nó
        DiemMau diem1 = new DiemMau(1, 2, 3);
        DiemMau diem2 = new DiemMau(4, 5, 6);
        DoanThang doanThang = new DoanThang(diem1, diem2);

        doanThang.nhap();
        doanThang.xuat();

        double khoangCach = doanThang.tinhKhoangCach();
        System.out.println("Khoảng cách giữa hai điểm: " + khoangCach);

        doanThang.kiemTraCungMau();
    }
}