package FC_01.hinh;

public class HinhChuNhat extends HinhHoc{

    @Override
    public void info() {
        System.out.println("Nhap vao id: ");
        setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap vao chieu dai: ");
        setChieuDai(Double.parseDouble(scanner.nextLine()));
        System.out.println("Nhap vao chieu rong: ");
        setChieuRong(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public void display() {
        getChuVi();
        getDienTich();
    }

    @Override
    public void getChuVi() {
        System.out.println("Chu vi hinh chu nhat la: "+(getChieuDai()+getChieuRong())*2);
    }

    @Override
    public void getDienTich() {
        System.out.println("Dien tich hinh chu nhat la: "+(getChieuDai()*getChieuRong()));

    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "id=" + id +
                ", chieuDai=" + chieuDai +
                ", chieuRong=" + chieuRong +
                '}';
    }
}
