package Chuong_6;

import java.util.Scanner;

public class VanPhongPham {
	private int ma;
	private String ten;
	private int SL;
	private int gia;
	public VanPhongPham() {

	}
	public VanPhongPham(int ma, String ten, int sL, int gia) {
		this.ma = ma;
		this.ten = ten;
		SL = sL;
		this.gia = gia;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public int getSL() {
		return SL;
	}
	public void setSL(int sL) {
		SL = sL;
	}
	public int getGia() {
		return gia;
	}
	public void setGia(int gia) {
		this.gia = gia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		ma = sc.nextInt();
		ten = sc.next();
		SL = sc.nextInt();
		gia = sc.nextInt();
	}
	public void xuat() {
		System.out.println("Mã: "+ma);
		System.out.println("Tên: "+ten);
		System.out.println("Số lượng: "+SL);
		System.out.println("Giá bán: "+gia);
	}
}
class Tap extends VanPhongPham{
	private int soTrang;

	public Tap() {
		
	}

	public Tap(int ma, String ten, int sL, int gia, int soTrang) {
		super(ma, ten, sL, gia);
		this.soTrang = soTrang;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}
	@Override
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		soTrang = sc.nextInt();
	}
	@Override
	public void xuat() {
		super.xuat();
		System.out.println("Số trang: "+soTrang);
	}
}
class Viet extends VanPhongPham{
	private String mauMuc;

	public Viet() {

	}

	public Viet(int ma, String ten, int sL, int gia, String mauMuc) {
		super(ma, ten, sL, gia);
		this.mauMuc = mauMuc;
	}

	public String getMauMuc() {
		return mauMuc;
	}

	public void setMauMuc(String mauMuc) {
		this.mauMuc = mauMuc;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		mauMuc = sc.next();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Màu mực: "+mauMuc);
	}
}
class DanhSachVanPhongPham {
    private static final int MAX_SIZE = 100;
    private VanPhongPham[] danhSach;
    private int size;

    public DanhSachVanPhongPham() {
        danhSach = new VanPhongPham[MAX_SIZE];
        size = 0;
    }

    public void themVanPhongPham() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chọn loại văn phòng phẩm (1. Tập, 2. Bút): ");
        int choice = scanner.nextInt();
        scanner.nextLine(); // Đọc dòng trống sau khi đọc số

        VanPhongPham vanPhongPham = null;

        switch (choice) {
            case 1:
                vanPhongPham = new Tap();
                break;
            case 2:
                vanPhongPham = new Viet();
                break;
            default:
                System.out.println("Lựa chọn không hợp lệ.");
                return;
        }

        if (vanPhongPham != null && size < MAX_SIZE) {
            vanPhongPham.nhap();
            danhSach[size++] = vanPhongPham;
        } else if (size >= MAX_SIZE) {
            System.out.println("Danh sách đã đầy, không thể thêm mới.");
        }else {
            System.out.println("Lựa chọn không hợp lệ.");
            scanner.nextLine(); // Đọc bỏ dòng không hợp lệ
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < size; i++) {
            danhSach[i].xuat();
            System.out.println("------------------------------");
        }
    }
}
