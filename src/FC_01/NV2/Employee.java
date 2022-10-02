package FC_01.NV2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Employee {
    private String name;
    private double salary;
    private double allowance;

    public Employee() {
    }

    public Employee(String name, double salary, double allowance) {
        this.name = name;
        this.salary = salary;
        this.allowance = allowance;
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

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ten: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap vao luong:");
        this.salary=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao phu cap:");
        this.allowance=Double.parseDouble(scanner.nextLine());

    }
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", allowance=" + allowance +
                '}';
    }
}

