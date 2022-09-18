package Test.employee;

public class Employee extends Person {
    private double salary;

    public Employee(String name, int age, String address, double salary) {
        super(name, age, address);
        this.salary = salary;
    }

    public Employee() {
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", salary=" + salary;
    }

}
