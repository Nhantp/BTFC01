package FC_01.interf;

import java.util.ArrayList;
import java.util.List;

public class Employee implements Comparable<Employee> {
    private int age;

    public Employee() {
    }

    public Employee(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    @Override
    public int compareTo(Employee o) {
        return this.age=o.age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        List<Employee> employeeList=new ArrayList<>();
        Employee employee=new Employee(10);
        Employee employee1=new Employee(29);
        Employee employee2=new Employee(44);
        employeeList.add(employee);
        employeeList.add(employee1);
        employeeList.add(employee2);
        for(Employee employee3:employeeList){
            System.out.println(employee3);
        }


    }
}
