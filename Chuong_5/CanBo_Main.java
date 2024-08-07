package Chuong_5;

import java.util.Scanner;

public class CanBo_Main {
    public static void main(String[] args) {
        DSCB danhSachCB = new DSCB();

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("----- MENU -----");
            System.out.println("1. Thêm mới cán bộ");
            System.out.println("2. Sửa cán bộ");
            System.out.println("3. Xóa cán bộ");
            System.out.println("4. Tìm kiếm theo họ tên");
            System.out.println("5. Hiển thị danh sách cán bộ");
            System.out.println("0. Thoát");
            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    System.out.println("----- THÊM MỚI CÁN BỘ -----");
                    System.out.println("1. Công nhân");
                    System.out.println("2. Kỹ sư");
                    System.out.println("3. Nhân viên");
                    System.out.print("Nhập loại cán bộ: ");
                    int type = scanner.nextInt();
                    scanner.nextLine(); // consume the newline character

                    CanBo canBo;
                    switch (type) {
                        case 1:
                            canBo = new CongNhan();
                            break;
                        case 2:
                            canBo = new KySu();
                            break;
                        case 3:
                            canBo = new NhanVien();
                            break;
                        default:
                            System.out.println("Lựa chọn không hợp lệ!");
                            continue;
                    }

                    canBo.nhap();
                    danhSachCB.themMoiCanBo();
                    break;

                case 2:
                    System.out.println("----- SỬA CÁN BỘ -----");
                    System.out.print("Nhập mã cán bộ cần sửa: ");
                    String maSua = scanner.nextLine();
                    danhSachCB.Sua(maSua);
                    break;

                case 3:
                    System.out.println("----- XÓA CÁN BỘ -----");
                    System.out.print("Nhập mã cán bộ cần xóa: ");
                    String maXoa = scanner.nextLine();
                    danhSachCB.Xoa(maXoa);
                    break;

                case 4:
                    System.out.println("----- TÌM KIẾM THEO HỌ TÊN -----");
                    System.out.print("Nhập họ tên cần tìm kiếm: ");
                    String hoTen = scanner.nextLine();
                    danhSachCB.TimKiem(hoTen);
                    break;

                case 5:
                    System.out.println("----- DANH SÁCH CÁN BỘ -----");
                    danhSachCB.XuatDS();
                    break;

                case 0:
                    System.out.println("----- KẾT THÚC CHƯƠNG TRÌNH -----");
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 0);

        scanner.close();
    }
}
