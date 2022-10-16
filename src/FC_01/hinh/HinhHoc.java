package FC_01.hinh;

import java.util.Scanner;

public abstract class HinhHoc implements Hinh {
    protected int id;
    protected double chieuDai;
    protected double chieuRong;
    protected double radian;
    protected final double PI=3.14;
    protected Scanner scanner=new Scanner(System.in);

    public HinhHoc() {
    }

    public HinhHoc(int id, double chieuDai, double chieuRong) {
        this.id = id;
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }

    public HinhHoc(int id, double radian) {
        this.id = id;
        this.radian = radian;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(double chieuRong) {
        this.chieuRong = chieuRong;
    }

    public double getRadian() {
        return radian;
    }

    public void setRadian(double radian) {
        this.radian = radian;
    }

    public double getPI() {
        return PI;
    }

    public void display(){

    }
    public void info(){}

    @Override
    public abstract void getChuVi() ;

    @Override
    public abstract void getDienTich();
}
