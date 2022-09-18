package FC_01.bt1;

import java.util.ArrayList;
import java.util.List;

public class Faculty extends Employee{
    private int officeHours;
    private int rank;
    List<Faculty>facultyList=new ArrayList<>();
    public Faculty() {
    }

    public Faculty(String name, String address, int phoneNumber, String email, String office, double salary, String dateHired, int officeHours, int rank) {
        super(name, address, phoneNumber, email, office, salary, dateHired);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public int getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(int officeHours) {
        this.officeHours = officeHours;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }
    public Faculty input(){
        System.out.println("Nhap vao ten: ");
        String name=scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        String address=scanner.nextLine();
        System.out.println("Nhap vao so dien thoai: ");
        int phoneNumber=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao email: ");
        String email=scanner.nextLine();
        System.out.println("Nhap vao ngay thue: ");
        String dateHired=scanner.nextLine();
        System.out.println("Nhap vao van phong: ");
        String office=scanner.nextLine();
        System.out.println("Nhap vao luong: ");
        double salary=Double.parseDouble(scanner.nextLine());
        System.out.println("Nhap vao gio hanh chinh: ");
        int officeHours=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao cap bac: ");
        int rank=Integer.parseInt(scanner.nextLine());



        return new Faculty(name,address,phoneNumber,email,office,salary,dateHired,officeHours,rank);
    }
    public void add(){
        System.out.println("Nhap vao so luong giang vien: ");
        int sizes=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<sizes; i++){
            Faculty faculty = this.input();
            facultyList.add(faculty);
        }
    }
    public void display(){
        for (Employee employee:facultyList){
            System.out.println(employee);
        }
    }

    @Override
    public String toString() {
        return super.toString() + " ,officeHours: " + officeHours + ", rank: " + rank;
    }
}
