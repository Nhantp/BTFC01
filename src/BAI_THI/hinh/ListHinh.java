package BAI_THI.hinh;

import java.util.ArrayList;
import java.util.Scanner;

public class ListHinh {
    ArrayList<HinhHoc> hinhHocArrays = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Nhap vao so luong hinh: ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {

            System.out.println("Hinh chu nhat(CN), Hinh tron (T) Exit (E): ");
            System.out.println("Nhap vao lua chon: ");
            String check = scanner.nextLine();

            if (check.equals("CN")) {
                HinhHoc hinhHoc = new HinhChuNhat();
                hinhHoc.info();
                hinhHocArrays.add(hinhHoc);
            } else if (check.equals("T")) {
                HinhHoc hinhHoc = new HinhTron();
                hinhHoc.info();
                hinhHocArrays.add(hinhHoc);
            } else {
                break;
            }
        }
    }

    public void display() {
        for (HinhHoc hinhHoc : hinhHocArrays) {
            System.out.println(hinhHoc);
            hinhHoc.display();
            System.out.println("");
        }
    }

    public void remove() {
        System.out.println("Nhap vao id can xoa: ");
        int id = Integer.parseInt(scanner.nextLine());
        HinhHoc hinhHocObj = null;
        for (HinhHoc hinhHoc : hinhHocArrays) {
            if (hinhHoc.id == id) {
                hinhHocObj = hinhHoc;
            }
        }
        if (hinhHocObj != null) {
            hinhHocArrays.remove(hinhHocObj);
        } else {
            System.out.println("not found");
        }
    }

    public void search() {
        System.out.println("Nhap vao id can tim: ");
        int id = Integer.parseInt(scanner.nextLine());
        HinhHoc hinhHocObj = null;
        for (HinhHoc hinhHoc : hinhHocArrays) {
            if (hinhHoc.id == id) {
                hinhHocObj = hinhHoc;
            }
        }
        if (hinhHocObj != null) {
            System.out.println(hinhHocObj);
        } else {
            System.out.println("not found");
        }
    }
}
