package BTDTU.FC_01.employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerService managerService=new ManagerService();
        Scanner scanner=new Scanner(System.in);
        EmployeeService employeeService=new EmployeeService();
        do {
            System.out.println("1.Employee");
            System.out.println("2.Manager");
            System.out.println("3.exit");
            System.out.println("Nhap vao lua chon:");
            int check = Integer.parseInt(scanner.nextLine());
            switch (check) {
                case 1:
                    employeeService.MenuEmployee();
                    break;
                case 2:
                    managerService.MenuManager();
                case 3:
                    System.exit(0);
            }
        }while (true);
    }
}
