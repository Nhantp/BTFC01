package FC_01.animal;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public abstract class Animal implements Serializable {
    private String gender;
    private String food;
    private double weight;

    public Animal(String gender, String food, double weight) {
        this.gender = gender;
        this.food = food;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract void intro();
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao giong:");
        this.gender=scanner.nextLine();
        System.out.println("Nhap vao thuc an:");
        this.food=scanner.nextLine();
        System.out.println("Nhap vao can nang:");
        this.weight=Integer.parseInt(scanner.nextLine());

    }

    @Override
    public String toString() {
        return "gender='" + gender + '\'' +
                ", food='" + food + '\'' +
                ", weight=" + weight;
    }

}
