package Test;

import java.util.Scanner;

public class PTBac2 extends PTBacNhat {
    Scanner scanner = new Scanner(System.in);
    private int c;

    public PTBac2() {
    }

    public PTBac2(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void input() {
        System.out.println("Nhap vao ax^2:");
        this.c = scanner.nextInt();
        super.input();
    }

    public void giai() {
        if (this.c != 0) {
            System.out.println("PT bac 2: "+this.c+"x^2 +"+getA()+"x + "+getB()+" = 0");
            double delta = Math.pow(getB(), 2) - 4 * this.c * getA();
            if (delta < 0) {
                System.out.println("Pt vo nghiem");
            } else if (delta == 0) {
                System.out.println("Pt co 1 nghiem kep: x= " + (double) (-getB()) / 2 * this.c);
            } else {
                System.out.println("Pt co 2 nghiem: ");
                System.out.println("x1= " + (-getB() + Math.sqrt(delta) / this.c));
                System.out.println("x2=" + (-getB() - Math.sqrt(delta) / this.c));
            }
        } else {
            System.out.println("Pt bac 1: " + getA() + "x +" + getB() + " = 0");
            super.giai();
        }
    }

    public static void main(String[] args) {
        PTBac2 ptBac2 = new PTBac2();
        ptBac2.input();
        ptBac2.giai();
    }
}
