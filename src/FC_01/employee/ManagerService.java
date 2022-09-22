package FC_01.employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagerService {
    Manager manager = new Manager();
    List<Manager> managerList = new ArrayList<>();
    Scanner scanner=new Scanner(System.in);

    public void add() {
        manager.input();
        managerList.add(manager);
        manager.setSalary(manager.getSalary() * 1500 + manager.getAllowance());
    }

    public void display() {
        for (Manager manager : managerList) {
            System.out.println(manager);
        }
    }

    public void MenuManager() {
        do {
            System.out.println("1.Nhap:");
            System.out.println("2.Hien thi");
            System.out.println("3.Quay lai.");
            System.out.println("Nhap vao lua chon.");
            int check = Integer.parseInt(scanner.nextLine());
            switch (check) {
                case 1:
                    add();
                    break;
                case 2:
                    display();
                    break;
                case 3:
                    return;
            }
        } while (true);
    }
}
