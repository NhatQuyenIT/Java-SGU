package Chuong_1;

import java.util.Scanner;

public class BT_9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi s từ người dùng
        System.out.print("Nhập chuỗi s: ");
        String s = scanner.nextLine();

        // a. Độ dài của s
        int length = s.length();
        System.out.println("Độ dài của chuỗi s: " + length);

        // b. Xoá bỏ khoảng trắng thừa của s
        String trimmedString = s.trim();
        System.out.println("Chuỗi s sau khi xoá bỏ khoảng trắng thừa: " + trimmedString);

        // c. Đếm số từ của s và xuất từng từ trên một dòng
        String[] words = trimmedString.split("\\s+");
        int wordCount = words.length;
        System.out.println("Số từ của chuỗi s: " + wordCount);
        
        System.out.println("Các từ của chuỗi s: ");
        for (String word : words) {
            System.out.println(word);
        }

        // d. Nhập số tự nhiên k, xuất k ký tự bên trái của s và k ký tự bên phải của s
        System.out.print("Nhập số tự nhiên k: ");
        int k = scanner.nextInt();

        // Đảm bảo k không vượt quá độ dài của chuỗi s
        if (k > length) { // length xem o cau a!
            k = length;
        }

        String leftSubstring = s.substring(0, k);
        String rightSubstring = s.substring(length - k, length);

        System.out.println("K ký tự bên trái của chuỗi s: " + leftSubstring);
        System.out.println("K ký tự bên phải của chuỗi s: " + rightSubstring);

        // e. Nhập số tự nhien k, n, xuất n kí tự của s kể từ vị trí k
        System.out.print("Nhập số tự nhiên k: ");
        int startPosition = scanner.nextInt();
        
        System.out.print("Nhập số tự nhiên n: ");
        int n = scanner.nextInt();
        
        // Đảm bảo vị trí k không vượt quá độ dài của chuỗi s
        if (startPosition > length) {
            startPosition = length;
        }
        
        String substring = s.substring(startPosition, startPosition + n);
        System.out.println("N kí tự của chuỗi s kể từ vị trí k: " + substring);
        scanner.close();
    }
}
