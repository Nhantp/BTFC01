package FC_01.hinh;

import java.util.Scanner;

public class HinhTron extends HinhHoc{

    @Override
    public void info() {
        System.out.println("Nhap vao id: ");
        setId(Integer.parseInt(scanner.nextLine()));
        System.out.println("Nhap vao radian: ");
        setRadian(Double.parseDouble(scanner.nextLine()));
    }

    @Override
    public void display() {
        getChuVi();
        getDienTich();
    }

    @Override
    public void getChuVi() {
        System.out.println("Chu vi hinh tron la: "+(2*PI*getRadian()));
    }

    @Override
    public void getDienTich() {
        System.out.println("Dien tich hinh tron la: "+(PI*Math.pow(getRadian(),2)));
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "id=" + id +
                ", radian=" + radian +
                '}';
    }
}
