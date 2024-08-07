package Chuong_1;

import java.util.Scanner;

public class BT_7 {

	// Hàm kiểm tra số nguyên tố
    public static boolean isPrime(int ktsnt) {
        if (ktsnt <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(ktsnt); i++) {
            if (ktsnt % i == 0) {
                return false;
            }
        }
        return true;
    }
    
	public static void main(String[] args) {
		// Viết chương trình nhập số tự nhiên N, xuất kết quả:
//				a. Các số tự nhiên <=N và tổng của chúng
//				b. Các số tự nhiên chẵn <=N và tổng của chúng
//				c. Các số tự nhiên lẻ <=N và tổng của chúng
//				d. Các số tự nhiên là số nguyên tố <=N và tổng của chúng
//				e. N số nguyên tố đầu tiên
		Scanner in = new Scanner(System.in);
		System.out.println("Nhập số tự nhiên N: ");
		int N = in.nextInt();
		// Xuất các số tự nhiên <=N và tổng của chúng
		System.out.println("Các số tự nhiên <=N là: ");
		int sum = 0;
		for(int i=1;i<=N;i++) {
			System.out.println(i+" ");
			sum+=i;
		}
		System.out.println("\nTổng các số tự nhiên <=N là: " + sum);
		
		// Xuất các số tự nhiên chẵn <=N và tổng của chúng
        System.out.print("Các số tự nhiên chẵn <=N là: ");
        sum = 0;
        for (int i = 2; i <= N; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nTổng các số tự nhiên chẵn <=N là: " + sum);
        
        // Xuất các số tự nhiên lẻ <=N và tổng của chúng
        System.out.print("Các số tự nhiên lẻ <=N là: ");
        sum = 0;
        for (int i = 1; i <= N; i += 2) {
            System.out.print(i + " ");
            sum += i;
        }
        System.out.println("\nTổng các số tự nhiên lẻ <=N là: " + sum);
        
        // Xuất các số tự nhiên là số nguyên tố <=N và tổng của chúng
        System.out.print("Các số tự nhiên là số nguyên tố <=N là: ");
        sum = 0;
        for (int i = 2; i <= N; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        System.out.println("\nTổng các số tự nhiên là số nguyên tố <=N là: " + sum);
        
        // Xuất N số nguyên tố đầu tiên
        System.out.print("N số nguyên tố đầu tiên là: ");
        int count = 0;
        int sntbandau = 2;
        while (count < N) {
            if (isPrime(sntbandau)) {
                System.out.print(sntbandau + " ");
                count++;
            }
            sntbandau++;
        }
        in.close();
    }
}
		
