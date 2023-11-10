import java.util.ArrayList;
import java.util.Scanner;

public class Guest{
    Scanner sc = new Scanner(System.in);
    public Guest(){
        System.out.println("----------------------Tài khoản Khách----------------------");
        System.out.println("| 1. Tìm kiếm sách.                                       |");
        System.out.println("| 2. Xem danh sách sách đang có.                          |");
        System.out.println("| 3. Thoát tài khoản khách.                               |");
        System.out.println("-----------------------------------------------------------");
    }
    public void timKiemSach(ArrayList<Sach> books){
        System.out.print("Nhập từ bạn muốn tìm kiếm: ");
        String tuTimKiem = sc.nextLine();
        System.out.println("Các kết quả tương đồng: ");
        boolean kiemTraTacGia = false, kiemTraTieuDe = false, kiemTraTheLoai = false, kiemTraNgayXuatBan = false;
        for(int i=0;i< books.size();i++){
            if(tuTimKiem.equals(books.get(i).getTacGia())){
                System.out.println((i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");
                kiemTraTacGia = true;
            }
        }
        if(kiemTraTacGia) return;
        for(int i=0;i< books.size();i++){
            if(tuTimKiem.equals(books.get(i).getTieuDe())){
                System.out.println((i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");
                kiemTraTieuDe = true;
            }
        }
        if(kiemTraTieuDe) return;
        for(int i=0;i< books.size();i++){
            if(tuTimKiem.equals(books.get(i).getTheLoai())){
                System.out.println((i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");
                kiemTraTheLoai = true;
            }
        }
        if(kiemTraTheLoai) return;
        for(int i=0;i< books.size();i++){
            if(tuTimKiem.equals(books.get(i).getNgayXuatBan())){
                System.out.println((i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");
                kiemTraNgayXuatBan = true;
            }
        }
        if(kiemTraNgayXuatBan) return;
        System.out.println("Xin lỗi bạn. Không có kết quả đồng nhất nào.");
    }
    public void danhSach(ArrayList<Sach> books){
        System.out.println("Hiện tại đây là danh sách sách của cửa hàng: ");
        for(int i=0;i< books.size();i++){
            System.out.println((i+1) + ". " + books.get(i).getTieuDe() + " - " + books.get(i).getTacGia() + " - " + books.get(i).getTheLoai() + " - " + books.get(i).getNgayXuatBan() + ".");

        }
    }
}
