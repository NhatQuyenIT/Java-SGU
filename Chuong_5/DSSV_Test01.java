package Chuong_5;

//Test 1
class DSSV_Test01{
public static void main(String [] args) 
{
DSSV ds1=new DSSV();
ds1.nhap();
ds1.xuat();
ds1.them();
ds1.xuat();
SinhVien sv1=new SinhVien("A001","Nguyen Van Teo","0912345678");
ds1.them(sv1);
ds1.xuat();
ds1.sua("A001");
ds1.xoa("A001");
//gọi các hàm đã viết trong DSSV … hoặc gọi thêm các hàm chức năng khác tương tự !
}
}
