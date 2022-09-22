package FC_01.Test;

import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao bx:");
        int a = input.nextInt();
        System.out.println("Nhap vao c:");
        int b = input.nextInt();

        if (a != 0) {
            System.out.println("PT co nghiem: x= " + (-b / a));
        } else {
            if (a == b) {
                System.out.println("Pt vo so nghiem.");
            } else {
                System.out.println("Pt vo nghiem.");
            }
        }
    }
}
