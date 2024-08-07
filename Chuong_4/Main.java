package Chuong_4;

public class Main {
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
