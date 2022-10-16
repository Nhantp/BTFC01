package FC_01.eletric_bill_management;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        DSKHACHHANG dskhachhang=new DSKHACHHANG();
        dskhachhang.addKHVN();
        dskhachhang.addKHNN();
        dskhachhang.displayKH();
        System.out.println("Nhap vao id can tim kiem: ");
        int idCode=Integer.parseInt(scanner.nextLine());
        dskhachhang.search(idCode);
        System.out.println("Nhap vao id can sua: ");
        int id=Integer.parseInt(scanner.nextLine());
        dskhachhang.updateName(id);
        dskhachhang.displayKH();
        System.out.println("Nguoi co thanh toan cao nhat");
        dskhachhang.max();
    }
}
