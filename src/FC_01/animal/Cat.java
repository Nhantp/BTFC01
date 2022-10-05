package FC_01.animal;


import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cat extends Animal {
    private String name;
    private int age;

    public Cat(String gender, String food, double weight, String name, int age) {
        super(gender, food, weight);
        this.name = name;
        this.age = age;
    }


    public Cat() {
    }

    @Override
    public void intro() {
        System.out.println("Meo meo");
    }


    public void inputCat() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ten: ");
        this.name=scanner.nextLine();
        System.out.println("Nhap vao tuoi:");
        this.age=Integer.parseInt(scanner.nextLine());
        super.input();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return super.toString() +
                "name='" + name + '\'' +
                ", age=" + age ;
    }

}
