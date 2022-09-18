package FC_01.bai8;

import java.util.Scanner;

public class PhanSo extends Number{
    private double x1;
    private double y1;
    private double x2;
    private double y2;
    private final Scanner scanner=new Scanner(System.in);

    public PhanSo() {
    }

    public PhanSo(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    public void input(){
        System.out.println("Nhap vao phan so thu nhat: ");
        System.out.println("Nhap vao x: ");
        this.x1=scanner.nextDouble();
        System.out.println("Nhap vao y: ");
        this.x2=scanner.nextDouble();
        System.out.println("Nhap vap phan so thu hai: ");
        System.out.println("Nhap vao x: ");
        this.x2=scanner.nextDouble();
        System.out.println("Nhap vao y: ");
        this.y2=scanner.nextDouble();
    }

    @Override
    public void add() {
        double x=x1+x2;
        double y=y1+y2;
        System.out.println(x+ "/"+ y);
    }

    @Override
    public void subtract() {
        double x=x1-x2;
        double y=y1-y2;
        System.out.println(x+ "/" + y);
    }

    @Override
    public void multifly() {
        double x=x1*x2;
        double y=y1*y2;
        System.out.println(x+ "/" +y);
    }

    @Override
    public void divide() {
        double x=x1+x2;
        double y=y1+y2;
        System.out.println(x+ "/" +y);
    }

    public static void main(String[] args) {
        PhanSo phanSo=new PhanSo();
        phanSo.input();
        phanSo.add();
        phanSo.subtract();
        phanSo.multifly();
        phanSo.divide();
    }
}
