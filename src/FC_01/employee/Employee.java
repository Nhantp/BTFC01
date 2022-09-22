package FC_01.employee;

import java.util.Collections;
import java.util.Scanner;

public class Employee implements Comparable<Employee>  {
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
                ", salary=" + salary;
    }
    @Override
    public int compareTo(Employee o) {
        return this.name.compareTo(o.name);


    }

}
