import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    Scanner sc = new Scanner(System.in);
    public Admin(){
        System.out.println("----------------------Tài khoản Admin----------------------");
        System.out.println("| 1. Thêm sách mới.                                       |");
        System.out.println("| 2. Xóa sách.                                            |");
        System.out.println("| 3. Sửa sách.                                            |");
        System.out.println("| 4. Các chức năng của khách.                             |");
        System.out.println("| 5. Thoát tài khoản admin.                               |");
        System.out.println("-----------------------------------------------------------");
    }
    public void themSachMoi(ArrayList<Sach> books){
        String tieuDe, tacGia, theLoai, ngayXuatBan;
        System.out.print("Tiêu đề sách mới: ");
        tieuDe = sc.nextLine();
        System.out.print("Tác giả sách mới: ");
        tacGia = sc.nextLine();
        System.out.print("Thể loại sách mới: ");
        theLoai = sc.nextLine();
        System.out.print("Ngày xuất bản sách mới: ");
        ngayXuatBan = sc.nextLine();
        Sach sachMoi = new Sach(tieuDe,tacGia,theLoai,ngayXuatBan);
        books.add(sachMoi);
    }
    public void xoaSach(ArrayList<Sach> books){
        System.out.println("Hiện tại đây là danh sách sách của cửa hàng: ");
        for(int i=0;i< books.size();i++){
            System.out.println( (i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");

        }
        while(true){
            System.out.print("Nhập thứ tự sách bạn muốn xóa: ");
            int thuTu = sc.nextInt();
            if(thuTu > books.size()){
                System.out.println("Thứ tụ không hợp lệ !!!");
            }else{
                books.remove(thuTu-1);
                System.out.println("Đã xóa thành công sách !!!");
                System.out.println("Danh sách sách của cửa hàng sau khi xóa: ");
                for(int i=0;i< books.size();i++){
                    System.out.println((i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");
                }
                return;
            }
        }
    }
    public void suaSach(ArrayList<Sach> books){
        System.out.println("Hiện tại đây là danh sách sách của cửa hàng: ");
        for(int i=0;i< books.size();i++){
            System.out.println( (i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");

        }
        System.out.print("Nhập thứ tự sách bạn muốn sửa: ");
        int thuTu = sc.nextInt();
        sc.nextLine();
        String tieuDe, tacGia, theLoai, ngayXuatBan;
        System.out.print("Tiêu đề sách mới: ");
        tieuDe = sc.nextLine();
        System.out.print("Tác giả sách mới: ");
        tacGia = sc.nextLine();
        System.out.print("Thể loại sách mới: ");
        theLoai = sc.nextLine();
        System.out.print("Ngày xuất bản sách mới: ");
        ngayXuatBan = sc.nextLine();
        books.get(thuTu-1).setTieuDe(tieuDe);
        books.get(thuTu-1).setTacGia(tacGia);
        books.get(thuTu-1).setTheLoai(theLoai);
        books.get(thuTu-1).setNgayXuatBan(ngayXuatBan);
        System.out.println("Đã sửa sách thành công !!!");
        System.out.println("Đây là danh sách sách mới của cửa hàng: ");
        for(int i=0;i< books.size();i++){
            System.out.println((i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");
        }
    }

}
