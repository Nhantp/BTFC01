package Demo;

import java.time.LocalDate;
import java.util.Scanner;

public abstract class HangHoa {
    Scanner scanner=new Scanner(System.in);
    protected String  maHang;
    protected LocalDate ngayNhap;
    protected int donGia;
    protected int soLuong;

    public HangHoa() {
    }

    public HangHoa(String  maHang, LocalDate ngayNhap, int donGia, int soLuong) {
        this.maHang = maHang;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(int day, int month, int year) {
        this.ngayNhap = LocalDate.of(day, month, year);
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public abstract double tinhThanhTien();

    public void input(){
        System.out.println("Nhap vao ma hang: ");
        this.maHang= scanner.nextLine();
        System.out.println("Nhap vao ngay nhap: ");
        this.ngayNhap=LocalDate.of(Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()),Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap vao don gia: ");
        this.donGia=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao so luong: ");
        this.soLuong=Integer.parseInt(scanner.nextLine());
    }
    @Override
    public String toString() {
        return "HangHoa{" +
                "maHang=" + maHang +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                "Thanh Tien: "+tinhThanhTien()+
                '}';
    }
}
