package BTDTU.FC_01.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeService {
    Employee employee=new Employee();
    Scanner scanner=new Scanner(System.in);
    List<Employee> employeeList=new ArrayList<>();
    public void add(){
        employee.input();
        employeeList.add(employee);
    }
    public void display(){
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }
    public void MenuEmployee(){
        do {
            System.out.println("1.Nhap:");
            System.out.println("2.Hien thi");
            System.out.println("3.Quay lai.");
            System.out.println("Nhap vao lua chon.");
            int check=Integer.parseInt(scanner.nextLine());
            switch (check){
                case 1:add();
                break;
                case 2: display();
                break;
                case 3: return;
            }
        }while (true);
    }
}
