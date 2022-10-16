package FC_01.eletric_bill_management;
import java.time.LocalDate;
import java.util.Scanner;

public abstract class KHACHHANG implements ITIENDIEN {
    protected int idCode;
    protected String name;
    protected LocalDate datePrintBill;
    protected int amount;
    protected double unitPrice;

    public KHACHHANG() {
    }

    public KHACHHANG(int idCode, String name, LocalDate datePrintBill, int amount, double unitPrice) {
        this.idCode = idCode;
        this.name = name;
        this.datePrintBill = LocalDate.now();
        this.amount = amount;
        this.unitPrice = unitPrice;
    }

    public int getIdCode() {
        return idCode;
    }

    public void setIdCode(int idCode) {
        this.idCode = idCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getDatePrintBill() {
        return datePrintBill;
    }

    public void setDatePrintBill(int year, int month, int day) {
        this.datePrintBill=LocalDate.of(year, month, day);
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public void info(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ma khach hang: ");
        this.idCode=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten: ");
        this.name=scanner.nextLine();
        System.out.println("Nhap vao ngay in ra hoa don: ");
        this.datePrintBill=LocalDate.of(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap vao so luong: ");
        this.amount=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao don gia: ");
        this.unitPrice=Double.parseDouble(scanner.nextLine());
    }
    @Override
    public double tinhThanhTien() {
        return 0;
    }

    @Override
    public String toString() {
        return "DSKHACHHANG{" +
                "idCode=" + idCode +
                ", name='" + name + '\'' +
                ", datePrintBill=" + datePrintBill +
                ", amount=" + amount +
                ", unitPrice=" + unitPrice +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        KHACHHANG khachhang = (KHACHHANG) o;
        return idCode == khachhang.idCode;
    }
}
