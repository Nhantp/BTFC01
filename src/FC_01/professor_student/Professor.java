package FC_01.professor_student;

import java.util.Scanner;

public class Professor extends Person{
    Scanner scanner=new Scanner(System.in);
    private String department;

    public Professor() {
    }

    public Professor(String code, String name, int rank, String department) {
        super(code, name, rank);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
    public void info(){
        super.info();
        System.out.println("Nhap vao khoa: ");
        this.department=scanner.nextLine();
    }
    public void display(){
        super.display();
        System.out.println("Phong ban: "+department);
    }

    @Override
    public String description() {
        String desProfessor="";
        switch (rank) {
            case 0: {
                desProfessor = "None";
                break;
            }
            case 1: {
                desProfessor = "Assistant Professor";
                break;
            }
            case 2: {
                desProfessor = "Associate Professor";
                break;
            }
            case 3: {
                desProfessor = "Professor";
                break;
            }
            case 4: {
                desProfessor = "Assistant Teaching Professor";
                break;
            }
            case 5: {
                desProfessor = "Associate Teaching Professor";
                break;
            }
            case 6: {
                desProfessor = "Teaching Professor";
                break;
            }
        }
        return desProfessor;
    }


    @Override
    public int getType() {
        return 1;
    }
}
