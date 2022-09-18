package BTDTU.FC_01.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager extends Employee{
    private String office;
    private double allowance;
    private Scanner scanner=new Scanner(System.in);

    public Manager() {
    }

    public Manager(String name, double salary, String office, double allowance) {
        super(name, salary);
        this.office = office;
        this.allowance = allowance;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getAllowance() {
        return allowance;
    }

    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }
//    public Manager inputAll(){
//        System.out.println("Nhap vao ten: ");
//        String name=scanner.nextLine();
//        System.out.println("Nhap vap luong:");
//        double salary=Double.parseDouble(scanner.nextLine());
//        System.out.println("Nhap vao phong ban: ");
//        String office=scanner.nextLine();
//        System.out.println("Nhan vao phu cap");
//        double allowance=Double.parseDouble(scanner.nextLine());
//        setSalary(salary*1500000+allowance);
//        return new Manager(name,super.salary,office,allowance);
//    }
    public void input(){
        super.input();
        System.out.println("Nhap vao phong ban: ");
        this.office=scanner.nextLine();
        System.out.println("Nhap vao phu cap: ");
        this.allowance=Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString()+
                "office='" + office + '\'' +
                ", allowance=" + allowance +
                '}';
    }
}
