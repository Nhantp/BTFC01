//package FC_01.NV2;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class Service {
//    Employee employee=new Employee();
//    Manager manager=new Manager();
//    List<Service>serviceList=new ArrayList<>();
//    public void addEmployee(){
//        employee.input();
//        employee.setSalary(employee.getSalary()*1500+employee.getAllowance());
//        serviceList.add(employee);
//    }
//    public void displayEmployee(){
//        for (Service employee:serviceList){
//            System.out.println(employee);
//        }
//    }
//    public void sortName(){
//        Collections.sort(serviceList, Comparator.comparing(Employee::getName));
//        System.out.println(serviceList);
//    }
//    public void sortSalary(){
//        Collections.sort(employeeList,Comparator.comparing(Employee::getSalary));
//    }
//    public void addManager(){
//        employee.input();
//        employee.setSalary(employee.getSalary()*1500+employee.getAllowance());
//        serviceList.add(employee);
//    }
//    public void displayManager(){
//        for (Employee employee:employeeList){
//            System.out.println(employee);
//        }
//    }
//    public void sortNameManager(){
//        Collections.sort(employeeList, Comparator.comparing(Employee::getName));
//        System.out.println(employeeList);
//    }
//    public void sortSalaryManager(){
//        Collections.sort(employeeList, new Comparator<Manager>() {
//            @Override
//            public int compare(Manager o1, Manager o2) {
//                return 0;
//            }
//        });
//    }
//}
