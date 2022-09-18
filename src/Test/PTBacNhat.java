package Test;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class PTBacNhat {
    private int a;
    private int b;

    public PTBacNhat() {
    }

    public PTBacNhat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap vao bx:");
        this.a = input.nextInt();
        System.out.println("Nhap vao c:");
        this.b = input.nextInt();
    }

    public void giai() {
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

    public static void main(String[] args) {
        PTBacNhat ptBacNhat = new PTBacNhat();
        ptBacNhat.input();
        ptBacNhat.giai();
    }
}
