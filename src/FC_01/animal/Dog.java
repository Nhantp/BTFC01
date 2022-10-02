package FC_01.animal;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Dog extends Animal {
    private String loai;
    private double weight;

    public Dog(String gender, String food, double weight, String loai, double weight1) {
        super(gender, food, weight);
        this.loai = loai;
        this.weight = weight1;
    }

    public Dog() {
    }
    @Override
    public void intro() {
        System.out.println("Toi la cho loai: " + this.loai);
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        super.input();
        System.out.println("nhap vao loai:");
        this.loai= scanner.nextLine();
        System.out.println("Nhap vao can nang:");
        this.weight=Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString()+"loai='" + loai + '\'' +
                ", weight=" + weight ;
    }
}
