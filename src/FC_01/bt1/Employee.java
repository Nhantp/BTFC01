package FC_01.bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Employee extends Person {
    Scanner scanner=new Scanner(System.in);
    private final List<Employee>employeeList=new ArrayList<>();
    private String office;
    private double salary;
    private String dateHired;

    public Employee() {
    }
    public Employee(String name, String address, int phoneNumber, String email, String office, double salary, String dateHired) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }



    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDateHired() {
        return dateHired;
    }

    public void setDateHired(String dateHired) {
        this.dateHired = dateHired;
    }
    public Employee input(){
        System.out.println("Nhap vao ten: ");
        String name=scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        String address=scanner.nextLine();
        System.out.println("Nhap vao so dien thoai: ");
        int phoneNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao email: ");
        String email=scanner.nextLine();
        System.out.println("Nhap vao ngay thue: ");
        String dateHired=scanner.nextLine();
        System.out.println("Nhap vao van phong: ");
        String office=scanner.nextLine();
        System.out.println("Nhap vao luong: ");
        double salary=Double.parseDouble(scanner.nextLine());
        return new Employee(name,address,phoneNumber,email,office,salary,dateHired);
    }
    public void add(){
        System.out.println("Nhap vao so luong giang vien: ");
        int sizes=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<sizes; i++){
            Employee employee = this.input();
            employeeList.add(employee);
        }
    }
    public void display(){
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return super.toString()+", office: " + office + ", salary: " + salary + ", dateHired: " + dateHired;
    }
}
