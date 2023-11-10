import java.awt.print.Book;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.Math.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Sach> books = new ArrayList(100);
        LogIn login = new LogIn("QuangDat","QuangDat123");
        while(login.mode == 0){
            login.dangNhap();
        }
        if(login.mode == 1){
            // Admin;
            int choice;
            while(true){
                Admin admin = new Admin();
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        admin.themSachMoi(books);
                        break;
                    case 2:
                        admin.xoaSach(books);
                        break;
                    case 3:
                        admin.suaSach(books);
                        break;
                    case 4:
                        int luaChonCuaKhach;
                        while(true){
                            Guest guest = new Guest();
                            luaChonCuaKhach = sc.nextInt();
                            sc.nextLine();
                            switch(luaChonCuaKhach){
                                case 1:
                                    guest.timKiemSach(books);
                                    break;
                                case 2:
                                    guest.danhSach(books);
                                    break;
                                case 3:
                                    System.out.println("Đã thoát tài khoản Khách. Hẹn gặp lại bạn!");
                                    return;
                                default:
                                    break;
                            }

                        }
                    case 5:
                        System.out.println("Đã thoát tài khoản Admin. Hẹn gặp lại bạn !!");
                        return;
                    default:
                        break;

                }
            }
        }else{
            // Khach
            int choice;
            while(true){
                Guest guest = new Guest();
                choice = sc.nextInt();
                sc.nextLine();
                switch(choice){
                    case 1:
                        guest.timKiemSach(books);
                        break;
                    case 2:
                        guest.danhSach(books);
                        break;
                    case 3:
                        System.out.println("Đã thoát tài khoản Khách. Hẹn gặp lại bạn!");
                        return;
                    default:
                        break;
                }

            }
        }
    }
}