package Chuong_1;

import java.util.Scanner;

public class Cau_2 {
	// Viết chương trình Java nhập số tự nhiên N, sau đó nhập N phần tử của mảng A (lưu vào mảng)
	//tìm phần tử lớn nhất và nhỏ nhất trong mảng.
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Nhập số phần tử của mảng: ");
	        int n = scanner.nextInt();

	        int[] arr = new int[n];

	        System.out.println("Nhập các phần tử của mảng:");
	        for (int i = 0; i < n; i++) {
	            System.out.print("Phần tử thứ " + (i+1) + ": ");
	            arr[i] = scanner.nextInt();
	        }

	        // Tìm giá trị lớn nhất và nhỏ nhất trong mảng
	        int max = arr[0];
	        int min = arr[0];

	        for (int i = 1; i < n; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }

	            if (arr[i] < min) {
	                min = arr[i];
	            }
	        }
	        System.out.println("Giá trị lớn nhất: " + max);
	        System.out.println("Giá trị nhỏ nhất: " + min);
	        scanner.close();
	    }
	}
