package Chuong_3;

import java.util.Scanner;

//Thiết kế lớp Ngày, Tháng, Năm
public class Date_01 {
 // Khai báo các thuộc tính
 private int day;
 private int month;
 private int year;

 // Phương thức khởi tạo không tham số
 public Date_01() {
     this.day = 1;
     this.month = 1;
     this.year = 2000;
 }

 // Phương thức khởi tạo có ba tham số
 public Date_01(int day, int month, int year) {
     this.day = day;
     this.month = month;
     this.year = year;
 }

 // Phương thức nhập ngày tháng năm từ bàn phím
 public void input() {
     Scanner sc = new Scanner(System.in);
     do {
         System.out.print("Nhập ngày: ");
         this.day = sc.nextInt();
         System.out.print("Nhập tháng: ");
         this.month = sc.nextInt();
         System.out.print("Nhập năm: ");
         this.year = sc.nextInt();
     } while (!validateDate()); // Lặp lại nếu ngày tháng năm không hợp lệ
     sc.close();
 }

 // Phương thức xuất ngày tháng năm theo định dạng dd-mm-yyyy
 public void output() {
     System.out.printf("%02d-%02d-%04d\n", this.day, this.month, this.year);
 }

 // Phương thức thiết lập giá trị cho ngày
 public void setDay(int day) {
     this.day = day;
 }

 // Phương thức thiết lập giá trị cho tháng
 public void setMonth(int month) {
     this.month = month;
 }

 // Phương thức thiết lập giá trị cho năm
 public void setYear(int year) {
     this.year = year;
 }

 // Phương thức truy xuất giá trị của ngày
 public int getDay() {
     return this.day;
 }

 // Phương thức truy xuất giá trị của tháng
 public int getMonth() {
     return this.month;
 }

 // Phương thức truy xuất giá trị của năm
 public int getYear() {
     return this.year;
 }

 // Phương thức kiểm tra tính hợp lệ của ngày tháng năm
 public boolean validateDate() {
     // Kiểm tra năm có phải là năm nhuận hay không
     boolean leapYear = (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0);

     // Kiểm tra tháng có nằm trong khoảng từ 1 đến 12 hay không
     if (this.month < 1 || this.month > 12) {
         return false;
     }

     // Kiểm tra ngày có nằm trong khoảng từ 1 đến số ngày tối đa của tháng hay không
     switch (this.month) {
         case 1, 3, 5, 7, 8, 10, 12: // Các tháng có 31 ngày
             if (this.day < 1 || this.day > 31) {
                 return false;
             }
             break;
         case 4, 6, 9, 11: // Các tháng có 30 ngày
             if (this.day < 1 || this.day > 30) {
                 return false;
             }
             break;
         case 2: // Tháng hai có thể có 28 hoặc 29 ngày tùy vào năm nhuận
             if (leapYear) { // Năm nhuận thì có 29 ngày
                 if (this.day < 1 || this.day > 29) {
                     return false;
                 }
             } else { // Năm không nhuận thì có 28 ngày
                 if (this.day < 1 || this.day > 28) {
                     return false;
                 }
             }
             break;
     }

     // Nếu không vi phạm các điều kiện trên thì ngày tháng năm hợp lệ
     return true;
 }

 // Phương thức tăng ngày lên một đơn vị
 public void nextDay() {
     // Tăng ngày lên một đơn vị
     this.day++;

     // Kiểm tra xem ngày đã vượt quá số ngày tối đa của tháng hay chưa
     switch (this.month) {
         case 1, 3, 5, 7, 8, 10: // Các tháng có số ngày tối đa là 31
             if (this.day > 31) { // Nếu ngày vượt quá số ngày tối đa của tháng
                 this.day = 1; // Đặt lại ngày bằng một
                 this.month++; // Tăng tháng lên một đơn vị
             }
             break;
         case 4, 6, 9, 11: // Các tháng có số ngày tối đa là 30
             if (this.day > 30) { // Nếu ngày vượt quá số ngày tối đa của tháng
                 this.day = 1; // Đặt lại ngày bằng một
                 this.month++; // Tăng tháng lên một đơn vị
             }
             break;
         case 2: // Tháng hai có số ngày tối đa là phụ thuộc vào năm nhuận
             boolean leapYear = (this.year % 4 == 0 && this.year %100 !=0) || (this.year %400 ==0); 
             if(leapYear){ // Nếu là năm nhuận 
                 if(this.day >29){ // Nếu ngày vượt quá số ngày tối đa của tháng 
                     this.day =1; // Đặt lại ngày bằng một 
                     this.month++; // Tăng tháng lên một đơn vị 
                 }
             }else{ // Nếu không phải là năm nhuận 
                 if(this.day >28){ // Nếu ngày vượt quá số ngày tối đa của tháng 
                	 this.day = 1; // Set the day to 1
                     this.month++; // Increase the month by one
                 }
             }
             break;
     }

     // Kiểm tra xem tháng có vượt quá 12 hay không
     if (this.month > 12) {
         this.month = 1; // Set the month to 1
         this.year++; // Increase the year by one
     }
    }
	//Phương thức giảm ngày đi một đơn vị
	public void previousDay() {
	//Giảm ngày đi một đơn vị
	this.day--;
	
	// Kiểm tra xem ngày có nhỏ hơn 1 không
	if (this.day < 1) {
	    // Kiểm tra xem tháng có là tháng 1 không
	    if (this.month == 1) {
	        this.day = 31; // Set the day to 31
	        this.month = 12; // Set the month to 12
	        this.year--; // Decrease the year by one
	    } else {
	        // Kiểm tra xem tháng có là các tháng có 30 ngày không
	        if (this.month == 4 || this.month == 6 || this.month == 9 || this.month == 11) {
	            this.day = 30; // Set the day to 30
	        } else if (this.month == 2) {
	            // Kiểm tra xem năm có phải là năm nhuận không
	            boolean leapYear = (this.year % 4 == 0 && this.year % 100 != 0) || (this.year % 400 == 0);
	            if (leapYear) {
	                this.day = 29; // Set the day to 29
	            } else {
	                this.day = 28; // Set the day to 28
	            }
	        } else {
	            this.day = 31; // Set the day to 31
	        }
	        this.month--; // Decrease the month by one
	    }
	}
 }
}