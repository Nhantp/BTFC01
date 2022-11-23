package Demo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DanhSachHangHoa {
    Scanner scanner = new Scanner(System.in);
    static List<HangHoa> hangHoaList = new ArrayList<>();

    static {
        hangHoaList.add(new HangDienMay("001", LocalDate.of(2020,12,12), 100, 200, "TN"));
        hangHoaList.add(new HangDienMay("002", LocalDate.of(2020,12,10), 150, 130, "NK"));
        hangHoaList.add(new HangThuCong("003", LocalDate.of(2020,10,11), 110, 210, "Nam Son"));
        hangHoaList.add(new HangDienMay("004", LocalDate.of(2020,10,21), 110, 210, "TN"));
        hangHoaList.add(new HangDienMay("005", LocalDate.of(2020,12,12), 100, 200, "TN"));
        hangHoaList.add(new HangThuCong("006", LocalDate.of(2020,10,11), 110, 210, "Dien Luc"));
        hangHoaList.add(new HangDienMay("007", LocalDate.of(2020,12,11), 100, 200, "TN"));
        hangHoaList.add(new HangDienMay("008", LocalDate.of(2020,12,25), 110, 510, "TN"));
        hangHoaList.add(new HangThuCong("009", LocalDate.of(2020,10,21), 110, 210, "Duy Tan"));
    }


    public void add() {
        System.out.println("Nhap vao so luong can them:");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.println("Hang dien may (M), Hang thu cong (C), Exit (e):");
            System.out.println("Nhap vao lua chon: ");
            String choice = scanner.nextLine();
            if (choice.equals("M")) {
                HangDienMay hangDienMay = new HangDienMay();
                hangDienMay.inputHangDienMay();
                hangHoaList.add(hangDienMay);
            } else if (choice.equals("C")) {
                HangThuCong hangThuCong = new HangThuCong();
                hangThuCong.inputHangThuCong();
                hangHoaList.add(hangThuCong);
            } else {
                break;
            }
        }
    }

    public void display() {
        for (HangHoa hangHoa : hangHoaList) {
            System.out.println(hangHoa);
        }
    }

    public void displayNK() {
        HangDienMay hangDienMay;
        for (HangHoa hangHoa : hangHoaList) {
            if (hangHoa instanceof HangDienMay) {
                hangDienMay = (HangDienMay) hangHoa;
                if (hangDienMay.getNoiSanXuat().equals("NK"))
                    System.out.println(hangDienMay);
            }
        }
    }

    public void displayTN() {
        HangDienMay hangDienMay;
        for (HangHoa hangHoa : hangHoaList) {
            if (hangHoa instanceof HangDienMay) {
                hangDienMay = (HangDienMay) hangHoa;
                if (hangDienMay.getNoiSanXuat().equals("TN"))
                    System.out.println(hangDienMay);
            }
        }
    }

    public void displayTC() {
        HangThuCong hangThuCong;
        for (HangHoa hangHoa : hangHoaList) {
            if (hangHoa instanceof HangThuCong) {
                System.out.println(hangHoa);
            }
        }
    }

    public void sumNK() {
        HangDienMay hangDienMay;
        for (HangHoa hangHoa : hangHoaList) {
            if (hangHoa instanceof HangDienMay) {
                hangDienMay = (HangDienMay) hangHoa;
                if (hangDienMay.getNoiSanXuat().equals("NK")) {
                    System.out.println(hangDienMay);
                    System.out.println("Thanh Tien:" + hangDienMay.tinhThanhTien());
                }
            }
        }
    }

    public void sumTN() {
        HangDienMay hangDienMay;
        for (HangHoa hangHoa : hangHoaList) {
            if (hangHoa instanceof HangDienMay) {
                hangDienMay = (HangDienMay) hangHoa;
                if (hangDienMay.getNoiSanXuat().equals("TN")) {
                    System.out.println(hangDienMay);
                    System.out.println("Thanh Tien:" + hangDienMay.tinhThanhTien());
                }
            }
        }
    }

    public void sumTC() {
        HangThuCong hangThuCong;
        for (HangHoa hangHoa : hangHoaList) {
            if (hangHoa instanceof HangThuCong) {
                hangThuCong = (HangThuCong) hangHoa;
                System.out.println(hangThuCong);
                System.out.println("Thanh Tien: " + hangThuCong.tinhThanhTien());
            }
        }
    }
    public void remove(){
        HangHoa hangHoaObj = null;
        System.out.println("Nhap vao id can xoa: ");
        String id=scanner.nextLine();
        for (HangHoa hangHoa:hangHoaList){
            if(hangHoa.getMaHang().equals(id)) {
                hangHoaObj = hangHoa;
            }
        }
        if(hangHoaObj!=null){
            hangHoaList.remove(hangHoaObj);
            System.out.println("Success delete");
        }
        else {
            System.out.println("Not found");
        }
    }
    public void max(){
        HangHoa hangHoatmp = null;
        for (HangHoa hangHoa:hangHoaList){
            hangHoatmp=hangHoa;
            break;
        }
        for (HangHoa hangHoa:hangHoaList) {
            if (hangHoa.tinhThanhTien() > hangHoatmp.tinhThanhTien()) {
                hangHoatmp = hangHoa;
            }
        }
        System.out.println(hangHoatmp);

    }
    public void sumDay(){
        double sum=0;
        for (HangHoa hangHoa:hangHoaList){
            if(hangHoa.getNgayNhap().getDayOfMonth()==11){
                sum+=hangHoa.tinhThanhTien();
            }
        }
        System.out.println("Tong tien theo ngay 11"+sum);
    }
    public void sumMonth(){
        double sum=0;
        for (HangHoa hangHoa:hangHoaList){
            if(hangHoa.getNgayNhap().getMonthValue()==12){
                sum+=hangHoa.tinhThanhTien();
            }
        }
        System.out.println("Tong tien theo thang 12"+sum);
    }

}

