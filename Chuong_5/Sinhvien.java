package Chuong_5;
import java.util.Arrays;
import java.util.Scanner;

class SinhVien {
    private String ma;
    private String hoTen;
    private String sdt;

    public SinhVien() {
        ma = "";
        hoTen = "";
        sdt = "";
    }

    public SinhVien(String ma, String hoTen, String sdt) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.sdt = sdt;
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        ma = scanner.nextLine();
        System.out.print("Nhap ho ten sinh vien: ");
        hoTen = scanner.nextLine();
        System.out.print("Nhap so dien thoai sinh vien: ");
        sdt = scanner.nextLine();
    }

    public void xuat() {
        System.out.println("Ma sinh vien: " + ma);
        System.out.println("Ho ten sinh vien: " + hoTen);
        System.out.println("So dien thoai sinh vien: " + sdt);
    }

    // Getter and Setter methods
    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }
}

class DSSV {
    private SinhVien[] dssv; /****/
    private int n;

    public DSSV() {
        n = 0;
        dssv = new SinhVien[0];
    }

    public DSSV(int n, SinhVien[] ds) {
        this.n = n;
        dssv = Arrays.copyOf(ds, n);
    }

    public void nhap() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so sinh vien: ");
        n = scanner.nextInt();
        scanner.nextLine(); // Consume newline left-over

        dssv = new SinhVien[n];
        for (int i = 0; i < n; i++) {
            dssv[i] = new SinhVien();
            dssv[i].nhap();
        }
    }

    public void xuat() {
        for (int i = 0; i < n; i++) {
            dssv[i].xuat();
            System.out.println();
        }
    }
/****/
    public void them() {
        dssv = Arrays.copyOf(dssv, n + 1);
        dssv[n] = new SinhVien();
        dssv[n].nhap();
        n++;
    }

    public void them(SinhVien x) {
        dssv = Arrays.copyOf(dssv, n + 1);
        dssv[n] = new SinhVien(x.getMa(), x.getHoTen(), x.getSdt());
        n++;
    }
/****/
    public void xoa() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien can xoa: ");
        String ma = scanner.nextLine();
        xoa(ma);
    }

    public void xoa(String ma) {
        for (int i = 0; i < n; i++) {
            if (dssv[i].getMa().equals(ma)) {
                for (int j = i; j < n - 1; j++) {
                    dssv[j] = dssv[j + 1];
                }
                dssv = Arrays.copyOf(dssv, n - 1);
                n--;
                break;
            }
        }
    }
/****/
    public SinhVien timkiem(String ma) {
        for (int i = 0; i < n; i++) {
            if (dssv[i].getMa().equals(ma)) {
                return dssv[i];
            }
        }
        return null;
    }

    public void sua() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien can sua: ");
        String ma = scanner.nextLine();
        sua(ma);
    }

    public void sua(String ma) {
        SinhVien sv = timkiem(ma);
        if (sv != null) {
            sv.nhap();
        } else {
            System.out.println("Khong tim thay sinh vien co ma " + ma);
        }
    }
}

class QuanLyDSSV {
    private DSSV dssv;

    public QuanLyDSSV() {
        dssv = new DSSV();
    }

    public void menu() {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("**** Quan Ly Sinh Vien ****");
            System.out.println("1. Xem danh sach sinh vien");
            System.out.println("2. Them sinh vien");
            System.out.println("3. Xoa sinh vien");
            System.out.println("4. Sua thong tin sinh vien");
            System.out.println("5. Tim kiem sinh vien");
            System.out.println("6. Thoat");

            System.out.print("Nhap lua chon cua ban: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline left-over

            switch (choice) {
                case 1:
                    dssv.xuat();
                    break;
                case 2:
                    dssv.them();
                    break;
                case 3:
                    dssv.xoa();
                    break;
                case 4:
                    dssv.sua();
                    break;
                case 5:
                    System.out.print("Nhap ma sinh vien can tim: ");
                    String ma = scanner.nextLine();
                    SinhVien sv = dssv.timkiem(ma);
                    if (sv != null) {
                        System.out.println("Sinh vien can tim:");
                        sv.xuat();
                    } else {
                        System.out.println("Khong tim thay sinh vien ma " + ma);
                    }
                    break;
                case 6:
                    System.out.println("Cam on ban da su dung chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le. Vui long chon lai!");
            }
        } while (choice != 6);
    }
}