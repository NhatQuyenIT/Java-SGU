package Chuong_3;

public class PhanSo {
	 private int tu;
	    private int mau;
	    
	    // Constructor với tham số
	    public PhanSo(int tu, int mau) {
	        this.tu = tu;
	        this.mau = mau;
	    }
	    
	    // Phương thức getter cho tử số
	    public int getTu() {
	        return tu;
	    }
	    
	    // Phương thức setter cho tử số
	    public void setTu(int tu) {
	        this.tu = tu;
	    }
	    
	    // Phương thức getter cho mẫu số
	    public int getMau() {
	        return mau;
	    }
	    
	    // Phương thức setter cho mẫu số
	    public void setMau(int mau) {
	        this.mau = mau;
	    }
	    
	    // Phương thức xuất phân số
	    public void xuat() {
	        System.out.println(tu + "/" + mau);
	    }
	    
	    // Phương thức nghịch đảo phân số
	    public void nghichDao() {
	        int temp = tu;
	        tu = mau;
	        mau = temp;
	    }
	    
	    // Phương thức tính tổng 2 phân số
	    public PhanSo tong(PhanSo p) {
	        int tuTong = tu * p.getMau() + p.getTu() * mau;
	        int mauTong = mau * p.getMau();
	        return new PhanSo(tuTong, mauTong);
	    }
	}
//Trong phương thức tính tổng hai phân số, chúng ta sử dụng từ khóa `new` để tạo một đối tượng PhanSo mới để đại diện cho tổng của hai phân số.
//Lý do chúng ta sử dụng từ khóa `new` là để khởi tạo một đối tượng mới trong bộ nhớ và trả về đối tượng đó. Khi chúng ta trả về đối tượng mà không sử dụng từ khóa `new`, thì đối tượng sẽ không được khởi tạo và giá trị trả về sẽ không đúng.

//Ví dụ: Nếu chúng ta không sử dụng từ khóa `new` như sau:
//	public PhanSo tong(PhanSo p) {
//    int tuTong = tu * p.getMau() + p.getTu() * mau;
//    int mauTong = mau * p.getMau();
//    PhanSo ps = new PhanSo(tuTong, mauTong);
//    return ps; //thì khi gọi phương thức `tong`, nó sẽ trả về đối tượng này. 
//}

//Tuy nhiên, vì `ps` chỉ là một biến cục bộ trong phương thức, sau khi kết thúc phương thức, đối tượng tương ứng sẽ bị thu hồi bộ nhớ và không thể truy cập từ bên ngoài. 
//Do đó, chúng ta sử dụng từ khóa `new` để tạo đối tượng và để đảm bảo rằng đối tượng này được tạo và tồn tại sau khi phương thức kết thúc.
