package FC_01.employee;

import java.util.*;

public class ManagerService {
    Manager manager = new Manager();
    public static List<Manager> managerList = new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    static {
        managerList.add(new Manager("re",3,"fe",6));
        managerList.add(new Manager("fd",54,"fe",63));
        managerList.add(new Manager("htr",64,"fe",4));
        managerList.add(new Manager("dsvd",645,"fe",77));
        managerList.add(new Manager("hd",37,"fe",53));
        managerList.add(new Manager("fsw",98,"fe",65));
    }

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
    public static void sortName(){
       Collections.sort(managerList,Comparator.comparing(Manager::getName));
       for (Manager manager1:managerList){
           System.out.println(manager1);
       }
    }

    public static void sortSalary(){
        Collections.sort(managerList,Comparator.comparing(Manager::getSalary));
        for (Manager manager1:managerList){
            System.out.println(manager1);
        }
    }

    public void MenuManager() {
        do {
            System.out.println("1.Nhap:");
            System.out.println("2.Hien thi");
            System.out.println("3.Sap xep theo ten");
            System.out.println("4.Sap xep theo luong");
            System.out.println("5.Quay lai.");
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
                    sortName();
                    break;
                case 4:sortSalary();
                   break;
                case 5:
                    return;
            }
        } while (true);
    }
}
