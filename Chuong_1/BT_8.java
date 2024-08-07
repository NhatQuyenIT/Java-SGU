package Chuong_1;

import java.util.Arrays;
import java.util.Scanner;

public class BT_8 {

	//cau a
    private static int sumOfArray(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }
        return sum;
    }
    //cau b
    private static int[] cacphantu_chan(int[] array) {
        int[] phantu_chan = new int[array.length]; // khuc nay se import java.util.Arrays;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
            	phantu_chan[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOf(phantu_chan, count);
    }
    //cau c
    private static int[] cacphantu_le(int[] array) {
        int[] phantu_le = new int[array.length]; // khuc nay se import java.util.Arrays;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
            	phantu_le[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOf(phantu_le, count);
    }
    //cau d
    private static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int[] cacphantu_songuyento(int[] array) {
        int[] phantu_songuyento = new int[array.length];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (isPrime(array[i])) {
            	phantu_songuyento[count] = array[i];
                count++;
            }
        }
        return Arrays.copyOf(phantu_songuyento, count);
    }
    // cau e: Thêm 1 phần tử mới vào mảng
    private static int[] themphantu(int[] array, int phantumoi) {
        int[] mangmoi = Arrays.copyOf(array, array.length + 1);
        mangmoi[mangmoi.length - 1] = phantumoi;
        return mangmoi;
    }

    // cau f: Xoá phần tử thứ k của mảng a
    private static int[] xoaphantuk(int[] array, int k) {
        if (k < 0 || k >= array.length) {
            return array;
        }
        int[] newArray = new int[array.length - 1];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (i != k) {
                newArray[count] = array[i];
                count++;
            }
        }
        return newArray;
    }

    // cau g: Nhap mot so x, kiem tra x co trong mang a khong va tra ve vi tri cua x trong mang a
    private static int timphantu(int[] array, int x) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                return i;
            }
        }
        return -1;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Nhap so tu nhien N: ");
		int N = in.nextInt();
		int[] a = new int[N];
		System.out.println("Nhap cac phan tu cua mang a:");
		for(int i=0;i<N;i++) {
			System.out.print("a["+i+"] = ");
			a[i]=in.nextInt();
		}
		// cau a: Các phần tử của mảng a và tổng của chúng
		System.out.println("Cac phan tu cua mang a:");
		for(int i=0;i<N;i++) {
			System.out.print(a[i]+ " ");
		}
		 System.out.println();
	        System.out.println("Tong cua cac phan tu: " + sumOfArray(a));

	    // cau b: In ra cac phan tu chan cua mang a va tong cua chung
	        System.out.println("Cac phan tu chan cua mang a:");
	        int[] phantu_chan = cacphantu_chan(a);
	        for (int i = 0; i < phantu_chan.length; i++) {
	            System.out.print(phantu_chan[i] + " ");
	        }
	        System.out.println();
	        System.out.println("Tong cua cac phan tu chan: " + sumOfArray(phantu_chan));

	    // cau c: In ra cac phan tu le cua mang a va tong cua chung
	        System.out.println("Cac phan tu le cua mang a:");
	        int[] phantu_le = cacphantu_le(a);
	        for (int i = 0; i < phantu_le.length; i++) {
	            System.out.print(phantu_le[i] + " ");
	        }
	        System.out.println();
	        System.out.println("Tong cua cac phan tu le: " + sumOfArray(phantu_le));

	   // cau d: In ra cac phan tu la so nguyen to cua mang a va tong cua chung
	        System.out.println("Cac phan tu la so nguyen to cua mang a:");
	        int[] phantu_songuyento = cacphantu_songuyento(a);
	        for (int i = 0; i < phantu_songuyento.length; i++) {
	            System.out.print(phantu_songuyento[i] + " ");
	        }
	        System.out.println();
	        System.out.println("Tong cua cac phan tu la so nguyen to: " + sumOfArray(phantu_songuyento));
    
	        // cau e: Them 1 phan tu moi vao mang
	        System.out.print("Nhap phan tu moi can them vao mang: ");
	        int phantumoi = in.nextInt();
	        a = themphantu(a, phantumoi);
	        System.out.println("Mang sau khi them phan tu moi:");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();

	        // cau f: Xoa phan tu thu k cua mang
	        System.out.print("Nhap vi tri phan tu can xoa: ");
	        int k = in.nextInt();
	        a = xoaphantuk(a, k);
	        System.out.println("Mang sau khi xoa phan tu tai vi tri " + k + ":");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i] + " ");
	        }
	        System.out.println();

	        // cau g: Nhap mot so x, kiem tra x co trong mang a khong va tra ve vi tri cua x trong mang a
	        System.out.print("Nhap so x: ");
	        int x = in.nextInt();
	        int position = timphantu(a, x);
	        if (position != -1) {
	            System.out.println("Phan tu " + x + " co ton tai trong mang a tai vi tri " + position);
	        } else {
	            System.out.println("Phan tu " + x + " khong ton tai trong mang a");
	        }

	        in.close();
	   }
}
