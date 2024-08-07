package Ontap_CK;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class Xe {
	private String bienSoXe;
	private String mauXe;
	private String nhanHieu;
	public Xe() {
		bienSoXe = "";
		mauXe = "";
		nhanHieu = "";
	}
	public Xe(String bienSoXe, String mauXe, String nhanHieu) {
		this.bienSoXe = bienSoXe;
		this.mauXe = mauXe;
		this.nhanHieu = nhanHieu;
	}
	public String getBienSoXe() {
		return bienSoXe;
	}
	public void setBienSoXe(String bienSoXe) {
		this.bienSoXe = bienSoXe;
	}
	public String getMauXe() {
		return mauXe;
	}
	public void setMauXe(String mauXe) {
		this.mauXe = mauXe;
	}
	public String getNhanHieu() {
		return nhanHieu;
	}
	public void setNhanHieu(String nhanHieu) {
		this.nhanHieu = nhanHieu;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập biển số xe: ");
		bienSoXe = sc.nextLine();
		System.out.println("Nhập màu xe: ");
		mauXe = sc.nextLine();
		System.out.println("Nhập nhãn hiệu xe: ");
		nhanHieu = sc.nextLine();
	}
	public void xuat() {
		System.out.println("Biển số xe: " + bienSoXe);
		System.out.println("Màu xe: " + mauXe);
		System.out.println("Nhãn hiệu xe: " + nhanHieu);
	}
	
	public abstract double tinhSoTienQuaTram();
}

class XeBuyt extends Xe{
	private int soTuyen;
	private double doDaiLoTrinh;
	public XeBuyt() {
		super();
		soTuyen = 0;
		doDaiLoTrinh = 0.0;
	}
	public XeBuyt(String bienSoXe, String mauXe, String nhanHieu,int soTuyen, double doDaiLoTrinh) {
		super(bienSoXe,mauXe,nhanHieu);
		this.soTuyen = soTuyen;
		this.doDaiLoTrinh = doDaiLoTrinh;
	}
	
	public int getSoTuyen() {
		return soTuyen;
	}
	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}
	public double getDoDaiLoTrinh() {
		return doDaiLoTrinh;
	}
	public void setDoDaiLoTrinh(double doDaiLoTrinh) {
		this.doDaiLoTrinh = doDaiLoTrinh;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số tuyến: ");
		soTuyen = sc.nextInt();
		System.out.println("Nhập độ dài lộ trình: ");
		doDaiLoTrinh = sc.nextDouble();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số tuyến xe: " + soTuyen);
		System.out.println("Độ dài lộ trình xe: " + doDaiLoTrinh + "(km)");
	}
	@Override
	public double tinhSoTienQuaTram() {
		if (doDaiLoTrinh > 20) {
			return 10000;
		} else {
			return 5000;
		}
	}
}

class XeTai extends Xe{
	private double trongTai;

	public XeTai() {
		super();
		trongTai = 0.0;
	}

	public XeTai(String bienSoXe, String mauXe, String nhanHieu, double trongTai) {
		super(bienSoXe, mauXe, nhanHieu);
		this.trongTai = trongTai;
	}

	public double getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}
	public void nhap() {
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập số trọng tải(tấn): ");
		trongTai = sc.nextDouble();
	}
	public void xuat() {
		super.xuat();
		System.out.println("Số trọng tải xe: " + trongTai + "(tấn)");
	}
	@Override
	public double tinhSoTienQuaTram() {
		if (trongTai < 3) {
			return 15000;
		} else {
			return 30000;
		}
	}
}

class DSXe{
	private ArrayList<Xe> mangXe;
	private int soLuongXe;
	static Scanner sc = new Scanner(System.in);
	public DSXe() {
		mangXe = new ArrayList<Xe>();
		soLuongXe = 0;
	}
	public DSXe(ArrayList<Xe> mangXe, int soLuongXe) {
		this.mangXe = mangXe;
		this.soLuongXe = soLuongXe;
	}
	public void them() {
		System.out.println("Chọn loại xe (1.Xe buýt,2. Xe tải): ");
		int choice = sc.nextInt();
		sc.nextLine();
		Xe xe = null;
		switch(choice){
		case 1:
			xe = new XeBuyt();
			break;
		case 2:
			xe = new XeTai();
			break;
		}
		if (xe != null) {
	        xe.nhap(); // Bây giờ không còn lỗi vì c được khai báo ở phạm vi rộng hơn
	        mangXe.add(xe);
	    } else {
	        System.out.println("Lựa chọn không hợp lệ.");
	    }
	}
	
	public void tinhTongSoTienQuaTram() {
		double tongSoTien = 0;
		for (Xe xe : mangXe) {
			tongSoTien += xe.tinhSoTienQuaTram();
		}
		System.out.println("Tổng số tiền qua trạm của tất cả các xe: " +tongSoTien);
	}
}
