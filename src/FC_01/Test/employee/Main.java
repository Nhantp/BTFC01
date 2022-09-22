package FC_01.Test.employee;

import java.util.Scanner;

public class Main {
    public void input(Employee[] employees) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < employees.length; i++) {
            System.out.println("Nhap vao ten: ");
            String name = scanner.nextLine();
            System.out.println("Nhap vao tuoi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Nhap vao dia chi: ");
            String address = scanner.nextLine();
            System.out.println("Nhap vao luong: ");
            double salary = Double.parseDouble(scanner.nextLine());
            employees[i] = new Employee(name, age, address, salary);
        }
    }

    public void display(Employee[] employees) {
        for (Employee employee1 : employees) {
            System.out.println(employee1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Nhap vao so nhan vien: ");
        Scanner scanner = new Scanner(System.in);
        int sizes = Integer.parseInt(scanner.nextLine());
        Employee[] employees = new Employee[sizes];
        Main main = new Main();
        main.input(employees);
        main.display(employees);
    }
}
