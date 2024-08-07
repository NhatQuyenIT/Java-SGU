package Chuong_1;

import java.util.Scanner;

public class VD_Chuoi {

	public static void main(String[] args) {
		// 
		Scanner in = new Scanner(System.in);
		String s1 = "Good";
		String s2 = "Morning";
		String s3 = s1+" "+s2; 
		System.out.println(s3);// => Good Morning
		System.out.println(s3.length()); // => độ dài: 12
		System.out.println(s3.substring(0,2)); // => chữ: "Go"
		System.out.println(s3.indexOf("Morning")); // => vi tri tai 5
		System.out.println(s3.charAt(9)); // => chữ: "i"
		in.close();
	}
}
/*
 *  1.	`length` được sử dụng để trả về độ dài của một chuỗi. Độ dài của một chuỗi là số lượng ký tự trong chuỗi đó.
	2.	`charAt(index)`: Phương thức này trả về ký tự ở vị trí index trong chuỗi. Ví dụ, `"Hello".charAt(1)` sẽ trả về ký tự "e".
	3.	`indexOf(str)`: Phương thức này trả về vị trí đầu tiên của chuỗi con `str` trong chuỗi ban đầu. Nếu không tìm thấy, nó sẽ trả về -1. Ví dụ, `"Hello".indexOf("lo")` sẽ trả về 3.
	4.	`contains(str)`: Phương thức này xác định xem chuỗi con `str` có tồn tại trong chuỗi ban đầu hay không. Nó trả về `true` nếu có và `false` nếu không. Ví dụ, `"Hello".contains("lo")` sẽ trả về `true`.
	5.	`trim()`: Phương thức này loại bỏ các khoảng trắng ở đầu và cuối chuỗi. Ví dụ, `" Hello ".trim()` sẽ trả về "Hello".
	6.	`substring(startIndex, endIndex)`: Phương thức này trích xuất một phần của chuỗi từ vị trí startIndex đến endIndex (không bao gồm endIndex). Nếu không chỉ định endIndex, nó sẽ lấy từ startIndex đến cuối chuỗi. Ví dụ, `"Hello".substring(1, 3)` sẽ trả về "el".
	7.	`toUpperCase()`: Phương thức này chuyển đổi chuỗi thành dạng viết hoa. Ví dụ, `"Hello".toUpperCase()` sẽ trả về "HELLO".
	8.	`toLowerCase()`: Phương thức này chuyển đổi chuỗi thành dạng viết thường. Ví dụ, `"Hello".toLowerCase()` sẽ trả về "hello".
	9.	`replace(oldStr, newStr)`: Phương thức này thay thế tất cả các chuỗi con `oldStr` bằng chuỗi `newStr`. Ví dụ, `"Hello World".replace("World", "Universe")` sẽ trả về "Hello Universe".
	10.	`split(delimiter)`: Phương thức này chia chuỗi thành một mảng các phần tử, dựa trên định danh `delimiter`. Ví dụ, `"apple,banana,orange".split(",")` sẽ trả về một mảng ["apple", "banana", "orange"].
 */
