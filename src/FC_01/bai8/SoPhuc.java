package FC_01.bai8;

import java.util.Scanner;

public class SoPhuc extends Number {
    private double a1;
    private double b1;
    private double a2;
    private double b2;
    private Scanner  scanner=new Scanner(System.in);

    public SoPhuc() {
    }
    public SoPhuc(double a1, double b1, double a2, double b2) {
        this.a1 = a1;
        this.b1 = b1;
        this.a2 = a2;
        this.b2 = b2;
    }

    public void input(){
        System.out.println("Nhap vao so phuc thu 1: ");
        System.out.println("Nhap vao a: ");
        this.a1=scanner.nextDouble();
        System.out.println("Nhap vao bi: ");
        this.b1= scanner.nextDouble();
        System.out.println("Nhap vao so phuc thu 2: ");
        System.out.println("Nhap vao a: ");
        this.a2=scanner.nextDouble();
        System.out.println("Nhap vao bi: ");
        this.b2= scanner.nextDouble();
    }

    @Override
    public void add() {
        double a=a1+a2;
        double b=b1+b2;
        System.out.println("Cong hai so phuc: "+a + b+"i");
    }

    @Override
    public void subtract() {
        double a=a1-a2;
        double b=b1-b2;
        System.out.println("Tru hai so phuc: "+a + b+"i");
    }

    @Override
    public void multifly() {
        double a=a1*a2;
        double b=b1*b2;
        System.out.println("Nhan hai so phuc: "+a + b+"i");
    }

    @Override
    public void divide() {
        double a=a1/a2;
        double b=b1/b2;
        System.out.println("Chia hai so phuc"+a + b+"i");
    }

    public static void main(String[] args) {
        SoPhuc soPhuc=new SoPhuc();
        soPhuc.input();
        soPhuc.add();
        soPhuc.subtract();
        soPhuc.multifly();
        soPhuc.divide();
    }
}
