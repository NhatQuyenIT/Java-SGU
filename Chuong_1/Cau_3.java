package Chuong_1;
import java.util.Scanner;
public class Cau_3 {

	public static void main(String[] args) {
		// Viết chương trình Java nhập số tự nhiên N, sau đó nhập N chuỗi lưu vào mảng A. Nhập chuỗi s.
		// Tìm các chuỗi trong mảng A có chứa chuỗi s và xuất ra vị trí bắt đầu của chuỗi s trong các chuỗi đó.
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Nhập số lượng chuỗi: ");
		        int n = scanner.nextInt();
		        
		        // Đọc dòng mới để xử lý nút Enter còn lại sau khi đọc số nguyên
		        scanner.nextLine();

		        String[] arr = new String[n];

		        System.out.println("Nhập các chuỗi:");
		        for (int i = 0; i < n; i++) {
		            System.out.print("Chuỗi thứ " + (i+1) + ": ");
		            arr[i] = scanner.nextLine();
		        }

		        System.out.print("Nhập chuỗi cần tìm: ");
		        String s = scanner.nextLine();

		        System.out.println("Các chuỗi trong mảng chứa chuỗi " + s + ":");
		        for (int i = 0; i < n; i++) {
		            if (arr[i].contains(s)) {
		                int index = arr[i].indexOf(s);
		                System.out.println("Chuỗi thứ " + (i+1) + " - Vị trí bắt đầu: " + index);
		                scanner.close();
		            }
		        }
	}
}
