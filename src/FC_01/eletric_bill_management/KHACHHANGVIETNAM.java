package FC_01.eletric_bill_management;

import java.time.LocalDate;
import java.util.Scanner;

public class KHACHHANGVIETNAM extends KHACHHANG{
    private String objectCustomer;
    private int quota;

    public KHACHHANGVIETNAM() {
    }

    public KHACHHANGVIETNAM(int idCode, String name, LocalDate datePrintBill, int amount, double unitPrice, String objectCustomer, int quota) {
        super(idCode, name, datePrintBill, amount, unitPrice);
        this.objectCustomer = objectCustomer;
        this.quota = quota;
    }

    @Override
    public double tinhThanhTien() {
        double intoMoney;
        if(getAmount()<=this.quota){
            intoMoney=getAmount()*getUnitPrice();
        }
        else {
            intoMoney=getAmount()*getUnitPrice()*this.quota+(getAmount()-this.quota)*getUnitPrice()*2.5;
        }
        return intoMoney;
    }
    public void infoKHVN(){
        Scanner scanner=new Scanner(System.in);
        super.info();
        System.out.println("Nhap vao doi tuong khach hang: ");
        this.objectCustomer=scanner.nextLine();
        System.out.println("Nhap vao dinh muc: ");
        this.quota=Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "KHACHHANGVIETNAM{" +
                "idCode=" + idCode +
                ", name='" + name + '\'' +
                ", datePrintBill=" + datePrintBill +
                ", amount=" + amount +
                ", unitPrice=" + unitPrice +
                "objectCustomer='" + objectCustomer + '\'' +
                ", quota=" + quota +
                ", thanh toan: "+ tinhThanhTien()+
                '}';
    }
}
