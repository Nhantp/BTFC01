package Demo;

import java.time.LocalDate;
import java.util.Scanner;

public class HangDienMay extends HangHoa{
    Scanner scanner=new Scanner(System.in);
    private String noiSanXuat;

    public HangDienMay() {
    }

    public HangDienMay(String maHang, LocalDate ngayNhap, int donGia, int soLuong, String noiSanXuat) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.noiSanXuat = noiSanXuat;
    }

    public String getNoiSanXuat() {
        return noiSanXuat;
    }

    public void setNoiSanXuat(String noiSanXuat) {
        this.noiSanXuat = noiSanXuat;
    }
    public void inputHangDienMay(){
        input();
        System.out.println("Nap vao noi san xuat: ");
        this.noiSanXuat=scanner.nextLine();

    }
    @Override
    public double tinhThanhTien() {
        double thanhTien = 0;
        if (this.noiSanXuat.equals("TN")){
            thanhTien=this.soLuong*this.donGia;
        }else if(this.noiSanXuat.equals("NK")){
            thanhTien=this.soLuong*this.donGia*1.2;
        }
        else {
            System.out.println("null");
        }
        return thanhTien;
    }

    @Override
    public String toString() {
        return "HangDienMay{" +
                "noiSanXuat='" + noiSanXuat + '\'' +
                ", maHang=" + maHang +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                ", Thanh tien: "+tinhThanhTien()+
                '}';
    }
}
