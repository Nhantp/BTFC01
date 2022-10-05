package FC_01.professor_student_managerment;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Person person = new Person() {
            @Override
            public String description() {
                return null;
            }
        };
        Student student = new Student();
        Professor professor = new Professor();
        PersonList personList = new PersonList();
        System.out.println("Them hoc sinh: ");
        personList.addStudent(student);
        personList.addProfessor(professor);
        System.out.println("Them giang vien: ");
        personList.displayAll();
        personList.average();
        personList.maxRank(person);
        System.out.println("Nhap vao nguoi co id can xoa:");
        String code = scanner.nextLine();
        personList.Remove(code, person);
        personList.displayAll();

    }
}
