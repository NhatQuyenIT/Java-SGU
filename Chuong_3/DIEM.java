package Chuong_3;

import java.util.Scanner;

public class DIEM {
		// Thiết kế lớp DIEM bao gồm các thuộc tính tọa độ x,y
		
		    // Khai báo các thuộc tính
		    private double x; // Tọa độ x
		    private double y; // Tọa độ y

		    // Phương thức khởi tạo không tham số
		    public DIEM() {
		        this.x = 0;
		        this.y = 0;
		    }

		    // Phương thức khởi tạo có tham số
		    public DIEM(double x, double y) {
		        this.x = x;
		        this.y = y;
		    }

		    // Phương thức nhập tọa độ điểm từ bàn phím
		    public void nhap() {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Nhập tọa độ x: ");
		        this.x = in.nextDouble();
		        System.out.print("Nhập tọa độ y: ");
		        this.y = in.nextDouble();
		        in.close();
		    }

		    // Phương thức xuất tọa độ điểm ra màn hình
		    public void xuat() {
		        System.out.println("Tọa độ điểm: (" + this.x + ", " + this.y + ")");
		    }

		    // Phương thức di chuyển điểm có 2 tham số x’ và y’, x = x + x’ và y = y + y’
		    public void diChuyen(double x, double y) {
		        this.x += x;
		        this.y += y;  
		}
		    public static void main(String[] args) {
		    	// Tạo một đối tượng của lớp DIEM 
		    	DIEM A = new DIEM();
		    	// Xuất tọa độ của d1 
		    	A.xuat(); 
		    	// Di chuyển d1 theo vector (2, -1) 
		    	A.diChuyen(2, -1); // khi di chuyển thì x=3+2 ; y=4+(-1)
		    	// Xuất tọa độ của d1 sau khi di chuyển 
		    	A.xuat(); 
			}	    	
}
