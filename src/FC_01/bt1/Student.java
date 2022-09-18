package FC_01.bt1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student extends Person {
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    private static final String[] statusClass = {"Sinh vien nam 1", "Sinh vien nam 2", "junior", "senior"};

    public Student() {
    }

    public Student(String name, String address, int phoneNumber, String email) {
        super(name, address, phoneNumber, email);
    }

    public Student input() {
        System.out.println("Nhap vao ten: ");
        String name = scanner.nextLine();
        System.out.println("Nhap vao dia chi: ");
        String address = scanner.nextLine();
        System.out.println("Nhap vao so dien thoai: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao email: ");
        String email = scanner.nextLine();

        return new Student(name, address, phoneNumber, email);
    }


    //    public void addClass() {
//
//        }
//
//    }
    boolean check = true;
    String class2 = "";

    public void add() {
        System.out.println("Nhap vao so luong hoc sinh: ");
        int sizes = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < sizes; i++) {
            Student student = this.input();
            studentList.add(student);

            System.out.println("Cac lop duoc phep chon: Sinh vien nam 1,Sinh vien nam 2,junior,senior");
            System.out.println("Nhap vao lop: ");
            String className = scanner.nextLine();
            for (String class1 : statusClass) {
                if (className.equals(class1)) {
                    class2 = class1;
                    check = true;
                }
            }
        }
    }

//    public void displayClass() {
//
//    }

    public void display() {
        for (Student student : studentList) {
            System.out.println(student);
            if (check) {
                System.out.println("Trang thai lop: "+class2);
            } else {
                System.out.println("error");
            }
        }
    }

    @Override
    public String toString() {
        return super.toString();

    }
}
