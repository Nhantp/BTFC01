package FC_01.NV2;

import java.util.Scanner;

public class Manager extends Employee {
    private String office;
    private double allowance;
    public Manager() {
    }

    public Manager(String name, double salary, double allowance, String office, double allowance1) {
        super(name, salary, allowance);
        this.office = office;
        this.allowance = allowance1;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    @Override
    public double getAllowance() {
        return allowance;
    }

    @Override
    public void setAllowance(double allowance) {
        this.allowance = allowance;
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhap vao phong ban: ");
        this.office = scanner.nextLine();
        System.out.println("Nhap vao phu cap: ");
        this.allowance = Double.parseDouble(scanner.nextLine());
    }

    @Override
    public String toString() {
        return super.toString() +
                ", Van phong='" + office + '\'' +
                ",Phu cap=" + allowance;
    }
}

