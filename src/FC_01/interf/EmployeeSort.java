package FC_01.interf;

import java.util.ArrayList;
import java.util.List;

public class EmployeeSort implements Comparable{
    private int age;

    public EmployeeSort() {
    }

    public EmployeeSort(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int compareTo(EmployeeSort e){
        if(age>e.getAge()) return 1;
        else if(age<e.getAge()) return -1;
        else return 0;
    }
    @Override
    public int compareTo(Object o) {
        return compareTo(o);
    }

    @Override
    public String toString() {
        return "EmployeeSort{" +
                "age=" + age +
                '}';
    }

    public static void main(String[] args) {
        EmployeeSort employeeSort=new EmployeeSort(80);
        EmployeeSort employeeSort1=new EmployeeSort(90);
        EmployeeSort employeeSort2=new EmployeeSort(10);
        List<EmployeeSort> employeeList=new ArrayList<>();
        employeeList.add(employeeSort1);
        employeeList.add(employeeSort);
        employeeList.add(employeeSort2);
        for(EmployeeSort employeeSort3:employeeList){
            System.out.println(employeeSort3);
        }

    }
}
