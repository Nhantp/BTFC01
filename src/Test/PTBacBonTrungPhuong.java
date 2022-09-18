package Test;

import java.util.Scanner;

public class PTBacBonTrungPhuong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ax^4:");
        double a = scanner.nextDouble();
        System.out.println("Nhap vao bx^2:");
        double b = scanner.nextDouble();
        System.out.println("Nhap vao c:");
        double c = scanner.nextDouble();

        double x1, x2, x3, x4, t1, t2;

        if (a != 0) {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("Pt vo nghiem.");

            } else if (delta == 0) {
                t1 = -b / 2 * a;
                if (t1 < 0) {
                    System.out.println("Pt vo nghiem");
                } else {
                    if (t1 >= 0) {
                        x1 = Math.sqrt(t1);
                        x2 = -x1;
                        System.out.println("x1= " + x1);
                        System.out.println("x2= " + x2);
                    }
                }
            } else {
                t1 = -b - Math.sqrt(delta) / (2 * a);
                t2 = -b + Math.sqrt(delta) / (2 * a);
                if (t1 < 0 && t2 < 0) {
                    System.out.print("phuong trinh vo nghiem");
                } else {
                    if (t1 >= 0) {
                        x1 = Math.sqrt(t1);
                        x2 = -x1;
                        System.out.println("x1 = " + x1);
                        System.out.println("x2 = " + x2);
                    }
                    if (t2 >= 0) {
                        x3 = Math.sqrt(t2);
                        x4 = -x3;
                        System.out.println("x3 = " + x3);
                        System.out.println("x4 = " + x4);
                    }

                }
            }
        } else {
            if (b == 0 && c == 0) {
                System.out.println("Pt co vo so nghiem.");
            } else if (b == 0) {
                System.out.println("Pt vo nghiem.");
            }
        }
    }
}


