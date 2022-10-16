package FC_01.eletric_bill_management;

import java.time.LocalDate;
import java.util.Scanner;

public class KHACHHANGNUOCNGOAI extends KHACHHANG{
    private String nationality;

    public KHACHHANGNUOCNGOAI() {
    }

    public KHACHHANGNUOCNGOAI(int idCode, String name, LocalDate datePrintBill, int amount, double unitPrice, String nationality) {
        super(idCode, name, datePrintBill, amount, unitPrice);
        this.nationality = nationality;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public void infoKHNN(){
        super.info();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao quoc tich: ");
        this.nationality=scanner.nextLine();
    }

    @Override
    public double tinhThanhTien() {
        return getAmount()*getUnitPrice();
    }

    @Override
    public String toString() {
        return "KHACHHANGNUOCNGOAI{" +
                "idCode=" + idCode +
                ", name='" + name + '\'' +
                ", datePrintBill=" + datePrintBill +
                ", amount=" + amount +
                ", unitPrice=" + unitPrice +
                "nationality='" + nationality + '\'' +
                ", thanh toan: "+ tinhThanhTien()+
                '}';
    }
}
