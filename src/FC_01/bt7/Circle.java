package FC_01.bt7;

import java.util.Scanner;

public class Circle extends Shape{
    private double r;
    private Scanner scanner=new Scanner(System.in);
    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    private static final float PI = 3.14f;
    public void input(){
        System.out.println("Nhap vao ban kinh: ");
       this.r=scanner.nextDouble();
    }
    @Override
    public double cv() {
        return 2*r*PI;
    }

    @Override
    public double area() {
        return Math.pow(r,2)*PI;
    }

}
