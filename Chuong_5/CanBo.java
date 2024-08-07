package Chuong_5;
import java.util.Arrays;
import java.util.Scanner;

class CanBo {
    private String ma;
    private String hoTen;
    private int tuoi;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String ma, String hoTen, int tuoi, String diaChi) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
    }

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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã: ");
        ma = sc.nextLine();
        System.out.print("Nhập họ tên: ");
        hoTen = sc.nextLine();
        System.out.print("Nhập tuổi: ");
        tuoi = sc.nextInt();
        sc.nextLine();
        System.out.print("Nhập địa chỉ: ");
        diaChi = sc.nextLine();
    }

    public void xuat() {
        System.out.println("Mã: " + ma);
        System.out.println("Họ tên: " + hoTen);
        System.out.println("Tuổi: " + tuoi);
        System.out.println("Địa chỉ: " + diaChi);
    }
}

class CongNhan extends CanBo {
    private int bac;

    public CongNhan() {
    }

    public CongNhan(String ma, String hoTen, int tuoi, String diaChi, int bac) {
        super(ma, hoTen, tuoi, diaChi);
        this.bac = bac;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập bậc (1-10): ");
        bac = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Bậc: " + bac);
    }
}

class KySu extends CanBo {
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String ma, String hoTen, int tuoi, String diaChi, String nganhDaoTao) {
        super(ma, hoTen, tuoi, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập ngành đào tạo: ");
        nganhDaoTao = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Ngành đào tạo: " + nganhDaoTao);
    }
}

class NhanVien extends CanBo {
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String ma, String hoTen, int tuoi, String diaChi, String congViec) {
        super(ma, hoTen, tuoi, diaChi);
        this.congViec = congViec;
    }

    @Override
    public void nhap() {
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập công việc: ");
        congViec = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Công việc: " + congViec);
    }
}

class DSCB {
	CanBo[] dscb;
    int n;
    public DSCB() {
    	n=0;
    	dscb = new CanBo[0];
    }
    public DSCB(int n, CanBo[] dscb) {
    	this.n=n;
    	dscb=Arrays.copyOf(dscb, n);
    }
    public void themMoiCanBo() {
    	dscb = Arrays.copyOf(dscb, n+1);
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập lựa chọn của bạn: ");
    	int sel = sc.nextInt();
    	sc.nextLine();
    	switch (sel) {
    	case 1:
    		dscb[n] = new CongNhan();
    		break;
    	case 2:
    		dscb[n] = new KySu();
    		break;
    	case 3:
    		dscb[n] = new NhanVien();
    		break;
    	}
    	dscb[n].nhap();
    	n++;
    	}
    public void Sua(String ma) {
    	for (int i=0;i<n;i++) {
    		if(dscb[i].getMa().equals(ma)) {
    			dscb[i].nhap();
    		}
    	}
    }
    public void Sua() {
    	String ma;
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Nhập mã cán bộ: ");
    	ma = sc.nextLine();
    	Sua(ma);
    }
    public void Xoa(String ma) {
    	for(int i=0;i<n;i++) {
    		if(dscb[i].getMa().equals(ma)) {
    			for(int j=i; j < n-1;j++) {
    				dscb[j]=dscb[j+1];
    			}
    		}
    	}
    	dscb = Arrays.copyOf(dscb, n-1);
    	n--;
    }
    public CanBo TimKiem(String ten) {
    	for(int i=0;i<n;i++) {
    		if(dscb[i].getHoTen().equals(ten)) {
    			return dscb[i];
    		}
    	}
    	System.out.println("Không tìm thấy cán bộ!");
    	return null;
    }
    public void XuatDS() {
    	for(int i=0;i<n;i++) {
    		dscb[i].xuat();
    	}
    }
}