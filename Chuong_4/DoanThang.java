package Chuong_4;

class DoanThang {
    private DiemMau diemMau1;
    private DiemMau diemMau2;

    public DoanThang() {
    	diemMau1 = new DiemMau(0, 0, 0);
    	diemMau2 = new DiemMau(0, 0, 0);
    }
    public DoanThang(DiemMau diem1, DiemMau diem2) {
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