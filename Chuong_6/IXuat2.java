package Chuong_6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

interface IXuat2 {
    void xuat();
}

class TaiLieu implements IXuat2 {
    private String ten;

    public TaiLieu(String ten) {
        this.ten = ten;
    }
    public void nhap() {
    	Scanner scanner = new Scanner(System.in);
    	System.out.println("Nhập tên tài liệu: ");
    	ten = scanner.nextLine();
    }
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public void sua() {
    	
    }
    @Override
    public void xuat() {
        System.out.println("Tên: " + ten);
    }
}

class Sach extends TaiLieu {
    private String tacGia;
    private int soTrang;

    public Sach() {
        super("");
        this.tacGia = "";
        this.soTrang = 0;
    }
    public Sach(String ten, String tacGia, int soTrang) {
        super(ten);
        this.tacGia = tacGia;
        this.soTrang = soTrang;
    }
    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }
    @Override
    public void nhap() {
    	Scanner scanner = new Scanner(System.in);
    	super.nhap();
    	System.out.println("Nhập tên tác giả: ");
    	tacGia = scanner.nextLine();
    	System.out.println("Nhập số trang: ");
    	soTrang = scanner.nextInt();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Tác giả: " + tacGia);
        System.out.println("Số trang: " + soTrang);
    }
    @Override
    public void sua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tên tác giả mới: ");
        this.setTacGia(scanner.nextLine());
        System.out.println("Nhập số trang mới: ");
        this.setSoTrang(scanner.nextInt());
    }
}

class Dia extends TaiLieu {
    private int dungLuong;

    public Dia() {
        super("");
        this.dungLuong = 0;
    }
    public Dia(String ten, int dungLuong) {
        super(ten);
        this.dungLuong = dungLuong;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }
    @Override
    public void nhap() {
    	Scanner scanner = new Scanner(System.in);
    	super.nhap();
    	System.out.println("Nhập dung lượng đĩa: ");
    	dungLuong = scanner.nextInt();
    }
    @Override
    public void xuat() {
        super.xuat();
        System.out.println("Dung lượng: " + dungLuong);
    }
    @Override
    public void sua() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập dung lượng đĩa mới: ");
        this.setDungLuong(scanner.nextInt());
    }
}
class DSTaiLieu{
	private TaiLieu[] ds;
	private int maxSize = 100; // Đặt kích thước tối đa cho mảng
	private int count = 0; // Số lượng phần tử hiện tại trong mảng
	Scanner scanner = new Scanner(System.in);
	public DSTaiLieu() {
	    ds = new TaiLieu[maxSize];
	}
	public void them() {
	    System.out.println("Chọn loại tài liệu (1.Sách, 2.Đĩa): ");
	    int choice = scanner.nextInt();
	    scanner.nextLine();
	    TaiLieu c = null;
	    switch(choice){
	        case 1:
	            c = new Sach();
	            break;
	        case 2:
	            c = new Dia();
	            break;
	    }
	    if (c != null) {
	        c.nhap();
	        themTaiLieu(c);
	    } else {
	        System.out.println("Lựa chọn không hợp lệ.");
	    }
	}

	private void themTaiLieu(TaiLieu taiLieu) {
	    for (int i = 0; i < ds.length; i++) {
	        if (ds[i] == null) {
	            ds[i] = taiLieu;
	            count++;
	            break;
	        }
	    }
	}

	public void sua() {
        System.out.println("Nhập tên tài liệu cần sửa: ");
        String tenCanSua = scanner.nextLine();
        for (TaiLieu tl : ds) {
            if (tl.getTen().equals(tenCanSua)) {
                // Gọi phương thức sua() của đối tượng tài liệu tương ứng
                tl.sua();
                System.out.println("Đã sửa thông tin của tài liệu!");
                return; // Kết thúc sau khi sửa
            }
        }
        System.out.println("Không tìm thấy tài liệu cần sửa!");
    }

	public void xoa() {
	    System.out.println("Nhập tên tài liệu cần xóa: ");
	    String tenCanXoa = scanner.nextLine();
	    for (int i = 0; i < ds.length; i++) {
	        if (ds[i] != null && ds[i].getTen().equals(tenCanXoa)) {
	            ds[i] = null;
	            count--;
	            System.out.println("Đã xóa tài liệu!");
	            return; // Kết thúc sau khi xóa
	        }
	    }
	    System.out.println("Không tìm thấy tài liệu cần xóa!");
	}
	
	public void timKiem(String tenCanTim) {
		System.out.println("Nhập tên tài liệu cần tìm kiếm: ");
		String find = scanner.nextLine();
		boolean found = true;
		for (TaiLieu tl : ds) {
			if (tl.getTen().contains(find)) {
				tl.xuat();
			}
			if (!found) {
				System.out.println("Không có tài liệu  tìm kiếm !");
			}
		}
	}
	public void xuatDanhSach() {
	    for (TaiLieu tl : ds) {
	        if (tl != null) {
	            tl.xuat();
	        }
	    }
	}

	public void taiDanhSachTuFile(String fileName) {
	    try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
	        String line;
	        while ((line = br.readLine()) != null) {
	            System.out.println("Dòng đọc từ file: " + line);
	            String[] parts = line.split(";");
	            if (parts.length > 0) {
	                String loaiTaiLieu = parts[0].trim();
	                switch (loaiTaiLieu) {
	                    case "Sach":
	                        if (parts.length == 4) {
	                            String tenSach = parts[1].trim();
	                            String tacGia = parts[2].trim();
	                            int soTrang = Integer.parseInt(parts[3].trim());
	                            Sach sach = new Sach(tenSach, tacGia, soTrang);
	                            themTaiLieu(sach); // Thêm sách vào mảng tĩnh
	                        }
	                        break;
	                    case "Dia":
	                        if (parts.length == 3) {
	                            String tenDia = parts[1].trim();
	                            int dungLuong = Integer.parseInt(parts[2].trim());
	                            Dia dia = new Dia(tenDia, dungLuong);
	                            themTaiLieu(dia); // Thêm đĩa vào mảng tĩnh
	                        }
	                        break;
	                    // Các loại tài liệu khác nếu có
	                }
	            }
	        }
	    } catch (IOException | NumberFormatException e) {
	        e.printStackTrace();
	    }
	}

	public void xuatDanhSachRaFile(String fileName) {
	    try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
	        for (TaiLieu tl : ds) {
	            if (tl instanceof Sach) {
	                Sach sach = (Sach) tl;
	                bw.write(String.format("Sach;%s;%s;%d", sach.getTen(), sach.getTacGia(), sach.getSoTrang()));
	            } else if (tl instanceof Dia) {
	                Dia dia = (Dia) tl;
	                bw.write(String.format("Dia;%s;%d", dia.getTen(), dia.getDungLuong()));
	            }
	            bw.newLine();
	        }
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
}

class QuanLyTL {
    private DSTaiLieu dstl;
    Scanner scanner = new Scanner(System.in);

    public QuanLyTL() {
        dstl = new DSTaiLieu();
    }

    public void menu() {
        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm tài liệu");
            System.out.println("2. Sửa tài liệu");
            System.out.println("3. Xóa tài liệu");
            System.out.println("4. Tìm kiếm tài liệu");
            System.out.println("5. Xuất thông tin trong danh sách tài liệu");
            System.out.println("6. Tải danh sách tài liệu từ file");
            System.out.println("7. Xuất danh sách tài liệu ra file");
            System.out.println("8. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc dòng trống sau khi đọc số

            switch (choice) {
            	case 1:
	                dstl.them();
	                break;
                case 2:
                    dstl.sua();
                    break;
                case 3:
                    dstl.xoa();
                    break;
                case 4:
                    System.out.print("Nhập tên tài liệu cần tìm: ");
                    String tenCanTim = scanner.nextLine();
                    dstl.timKiem(tenCanTim);
                    break;
                case 5:
                    dstl.xuatDanhSach();
                    break;
                case 6:
                    System.out.print("Nhập tên file để tải danh sách tài liệu: ");
                    String fileName = scanner.nextLine();
                    dstl.taiDanhSachTuFile(fileName);
                    break;
                case 7:
                    System.out.print("Nhập tên file để xuất danh sách tài liệu: ");
                    fileName = scanner.nextLine();
                    dstl.xuatDanhSachRaFile(fileName);
                    break;
                case 8:
                    System.out.println("Chương trình kết thúc.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (choice != 8);
    }
}
