package Chuong_5;

import java.util.ArrayList;
import java.util.Scanner;

abstract class BTNhanvien {
		protected int maNV;
		protected String hoTen;
		protected String diaChi;
		
		public BTNhanvien() { // PT không tham số
			// Thay vì là maNV=0; hoten = ""; diaChi = "";
		}
		
		public BTNhanvien(int maNV, String hoTen, String diaChi) { // PT có tham số
			this.maNV = maNV;
			this.hoTen = hoTen;
			this.diaChi = diaChi;
		}
		
		public void nhap() {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập mã NV:");
	        maNV = sc.nextInt();
	        sc.nextLine(); // Đọc bỏ dòng trống
	        System.out.println("Nhập họ tên:");
	        hoTen = sc.nextLine();
	        System.out.println("Nhập địa chỉ:");
	        diaChi = sc.nextLine();
	    }

	    public void xuat() {
	        System.out.println("Mã NV: " + maNV);
	        System.out.println("Họ tên: " + hoTen);
	        System.out.println("Địa chỉ: " + diaChi);
	    }

	    public abstract int tinhluong();
}

class NVSX extends BTNhanvien{
	private int soSanPham;
	
	public NVSX() {
    }

    public NVSX(int maNV, String hoTen, String diaChi, int soSanPham) {
        super(maNV, hoTen, diaChi);
        this.soSanPham = soSanPham;
    }
    
	public void nhap() {
		super.nhap(); // lấy thông tin đã nhập của nv đó!
		Scanner sc = new Scanner(System.in); // khởi tạo biến (thể hiện) mới
		System.out.println("Nhập số sản phẩm: ");
		soSanPham = sc.nextInt();
	}
	public void xuat() {
		super.xuat();// xuất ra thông tin của nv đó!
		System.out.println("Số sản phầm: "+soSanPham);
		System.out.println("Lương: "+tinhluong()+" đồng");
	}
	@Override
	public int tinhluong() {
        return soSanPham*20000;
    }
//	public void tinhluong() {
//		int luong = soSanPham * 20000;
//	    System.out.println("Lương: " + luong + " đồng");
//	}
}
class NVCN extends BTNhanvien{
	private int soNgayCong;
	
	 public NVCN() {
	    }

	 public NVCN(int maNV, String hoTen, String diaChi, int soNgayCong) {
	        super(maNV, hoTen, diaChi);
	        this.soNgayCong = soNgayCong;
	    }
	 
	public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số ngày công:");
        soNgayCong = sc.nextInt();
    }

    public void xuat() {
        super.xuat();
        System.out.println("Số ngày công: " + soNgayCong);
        System.out.println("Lương: "+tinhluong()+" đồng");
    }
    @Override
    public int tinhluong() {
    	return soNgayCong*50000;
    }
//    public void tinhluong() {
//        int luong = soNgayCong * 50000;
//        System.out.println("Lương: " + luong + " đồng");
//    }
}
class NVQL extends BTNhanvien{
	private float heSoLuong;
	private int luongCoBan;
	
	public NVQL() {
    }

    public NVQL(int maNV, String hoTen, String diaChi, float heSoLuong, int luongCoBan) {
        super(maNV, hoTen, diaChi);
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }
    
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập hệ số lương:");
        heSoLuong = sc.nextFloat();
        System.out.println("Nhập lương cơ bản:");
        luongCoBan = sc.nextInt();
    }
    public void xuat() {
        super.xuat();
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương cơ bản: " + luongCoBan);
        System.out.println("Lương: "+tinhluong()+" đồng");
    }
    public int tinhluong() {
    	return (int) (heSoLuong*luongCoBan);
    }
//    public void tinhluong() {
//        int luong = (int) (heSoLuong * luongCoBan);
//        System.out.println("Lương: " + luong + " đồng");
//    }
}
class DSNV{
	private int soLuongNV;
	
	private ArrayList<BTNhanvien> danhSachNV; /****/

    public DSNV() {
        danhSachNV = new ArrayList<BTNhanvien>(); /****/
    }

    public DSNV(int soLuongNV) {
        this.soLuongNV = soLuongNV;
        danhSachNV = new ArrayList<BTNhanvien>(soLuongNV); /****/
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số lượng nhân viên:");
        soLuongNV = sc.nextInt();
        sc.nextLine(); // Đọc bỏ dòng trống
        
        
        for (int i = 0; i < soLuongNV; i++) {
            System.out.println("Nhập thông tin nhân viên thứ " + (i + 1) + ":");
            System.out.println("Chọn loại nhân viên (1-NVSX, 2-NVCN, 3-NVQL):");
            int choice = sc.nextInt();
            sc.nextLine(); // Đọc bỏ dòng trống

            switch (choice) {
                case 1:
                    BTNhanvien nvSX = new NVSX();
                    nvSX.nhap();
                    danhSachNV.add(nvSX); /****/
                    break;
                case 2:
                    BTNhanvien nvCN = new NVCN();
                    nvCN.nhap();
                    danhSachNV.add(nvCN); /****/
                    break;
                case 3:
                    BTNhanvien nvQL = new NVQL();
                    nvQL.nhap();
                    danhSachNV.add(nvQL); /****/
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng nhập lại!");
                    i--;
            }
        }
    }

    public void xuat() {
        System.out.println("Danh sach nhan vien:");
        for (int i = 0; i < soLuongNV; i++) {
            danhSachNV.get(i).xuat();
            System.out.println("--------------------------");
        }
    }

    public void xuatluong() {
        System.out.println("Danh sach nhan vien:");
        for (int i = 0; i < soLuongNV; i++) {
        	System.out.print("Luong cua nhan vien "+ (i+1)+" :");
        	System.out.println(danhSachNV.get(i).tinhluong() + " VND");
            System.out.println("--------------------------");
        }
    }
}