package FC_01.bt7;

import java.util.Scanner;

public class Rectangle extends Shape{
    private double x;
    private double y;
    private Scanner scanner=new Scanner(System.in);
    public Rectangle() {
    }

    public Rectangle(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void input(){
        System.out.println("Nhap vao chieu dai: ");
        this.x=scanner.nextDouble();
        System.out.println("Nhap vao chieu rong: ");
        this.y=scanner.nextDouble();
    }

    @Override
    public double cv() {
        return (x+y)*2;
    }

    @Override
    public double area() {
        return x*y;
    }

}
