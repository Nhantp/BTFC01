package FC_01.NV;

import java.util.*;

public class EmployeeService {
    private  static Employee employee=new Employee();
    Scanner scanner=new Scanner(System.in);
    public static List<Employee> employeeList=new ArrayList<>();
    static {
        employeeList.add(new Employee("nh",2));
        employeeList.add(new Employee("nhan",3));
        employeeList.add(new Employee("has",5));
        employeeList.add(new Employee("ak",8));
        employeeList.add(new Employee("nja",67));
    }
    public void add(){
        employee.input();
        employeeList.add(employee);
    }
    public void display(){
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }
    public static void sortName(){
        Collections.sort(employeeList);
        for (Employee employee:employeeList){
            System.out.println(employee);
        }
    }

    public static void sortSalary(){
//        Collections.sort(employeeList,Comparator.comparing(Employee::getSalary));
        Collections.sort(employeeList, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int)(o2.salary-o1.salary);
            }
        });
        for (Employee employee1:employeeList){
            System.out.println(employee1);
        }
    }

    public void MenuEmployee(){
        do {
            System.out.println("1.Nhap:");
            System.out.println("2.Hien thi");
            System.out.println("3.Sap xep ten:");
            System.out.println("4.Sap xep luong.");
            System.out.println("5.Quay lai");
            System.out.println("Nhap vao lua chon.");
            int check=Integer.parseInt(scanner.nextLine());
            switch (check){
                case 1:add();
                    break;
                case 2: display();
                    break;
                case 3: sortName();
                    break;
                case 4:sortSalary();
                    break;
                case 5:
                    return;
            }
        }while (true);
    }
}
