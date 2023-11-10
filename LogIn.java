import java.util.Scanner;
public class LogIn {
    Scanner sc = new Scanner(System.in);
    private String tenDangNhapAdmin,tenMatKhauAdmin;
    public int mode = 0;

    public LogIn(String tenDangNhapAdmin, String tenMatKhauAdmin) {
        this.tenDangNhapAdmin = tenDangNhapAdmin;
        this.tenMatKhauAdmin = tenMatKhauAdmin;
    }
    public void dangNhap(){
        System.out.print("Nhập tên tài khoản của bạn, nếu là khách vui lòng nhập \"khach\": ");

        String tenDangNhap = sc.nextLine();
        if(tenDangNhap.equals(this.tenDangNhapAdmin)){
            while(true){
                System.out.print("Nhập mật khẩu của bạn: ");
                String matKhau = sc.nextLine();
                if (matKhau.equals(this.tenMatKhauAdmin)) {
                    this.mode = 1;
                    return;
                } else {
                    System.out.println("Không đúng mật khẩu của Admin !");
                    System.out.println("1. Nhập lại mật khẩu.");
                    System.out.println("2. Nhập lại tài khoản.");
                    System.out.print("Lựa chọn của bạn là: ");
                    int choice = sc.nextInt();
                    sc.nextLine();
                    if (choice == 1){
                        continue;
                    } else if (choice == 2) {
                        return;
                    }
                }
            }
        }else if(tenDangNhap.equals("khach")){
            this.mode = 2;
            return;
        }else{
            System.out.println("Tài khoản bạn nhập sai rồi. Vui lòng nhập lại.");
            return;
        }
    }
}
