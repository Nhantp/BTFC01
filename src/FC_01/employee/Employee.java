package BTDTU.FC_01.employee;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Scanner;

public class Employee {
    protected String name;
    protected double salary;
    protected Scanner scanner=new Scanner(System.in);

    public Employee() {
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public void input(){
        System.out.println("Nhap vao ten: ");
        this.name=scanner.nextLine();
        System.out.println("Nhap vao luong: ");
        this.salary=Double.parseDouble(scanner.nextLine());
    }



    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
