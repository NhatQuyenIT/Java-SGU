package Chuong_3;

import java.util.Scanner;

public class Date_02 {
//Thiết kế lớp Ngày, Tháng, Năm
 // Khai báo các thuộc tính
 private int day;
 private int month;
 private int year;

 // Phương thức khởi tạo không tham số
 public Date_02() {
     this.day = 1;
     this.month = 1;
     this.year = 2000;
 }

 // Phương thức khởi tạo có ba tham số
 public Date_02(int day, int month, int year) {
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
                     this.day =1; // Đặt lại ngày bằng một 
                     this.month++; // Tăng tháng lên một đơn vị 
                 }
             }
             break;
     }

     // Kiểm tra xem tháng đã vượt quá số tháng tối đa của năm hay chưa
     if (this.month > 12) { // Nếu tháng vượt quá số tháng tối đa của năm
         this.month = 1; // Đặt lại tháng bằng một
         this.year++; // Tăng năm lên một đơn vị
     }
 }
}
