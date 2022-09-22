package FC_01.Test.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    List<Employee> employeeList=new ArrayList<>();
    Employee employee=new Employee();
    Scanner scanner=new Scanner(System.in);
    public Employee input(){
        System.out.println("Nhap vao ten: ");
        String name=scanner.nextLine();
        System.out.println("Nhap vao tuoi: ");
        int age=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao dia chi: ");
        String address= scanner.nextLine();
        System.out.println("Nhap vao luong: ");
        double salary = Double.parseDouble(scanner.nextLine());
        return new Employee(name,age,address,salary);
    }
    public void add(){
        System.out.println("Nhap vao so luong: ");
        int sizes=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<sizes; i++) {

            Employee employee = this.input();
            employeeList.add(employee);
        }
    }
    public void display(){
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    public static void main(String[] args) {
        Controller controller=new Controller();
        controller.add();
        controller.display();
    }

}
