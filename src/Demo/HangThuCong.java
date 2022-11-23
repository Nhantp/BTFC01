package Demo;

import java.time.LocalDate;

public class HangThuCong extends HangHoa{
    private String nhaSanXuat;

    public HangThuCong() {
    }

    public HangThuCong(String maHang, LocalDate ngayNhap, int donGia, int soLuong, String nhaSanXuat) {
        super(maHang, ngayNhap, donGia, soLuong);
        this.nhaSanXuat = nhaSanXuat;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    @Override
    public double tinhThanhTien() {
        return this.soLuong*donGia;
    }
    public void inputHangThuCong(){
        input();
        this.nhaSanXuat=scanner.nextLine();
    }

    @Override
    public String toString() {
        return "HangThuCong{" +
                "nhaSanXuat='" + nhaSanXuat + '\'' +
                ", maHang=" + maHang +
                ", ngayNhap='" + ngayNhap + '\'' +
                ", donGia=" + donGia +
                ", soLuong=" + soLuong +
                " ,Thanh tien: "+tinhThanhTien()+
                '}';
    }
}
