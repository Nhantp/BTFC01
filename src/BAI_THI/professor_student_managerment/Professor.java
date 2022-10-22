package BAI_THI.professor_student_managerment;

import java.util.Scanner;

public class Professor extends Person {
    private String department;

    public Professor(int code, String name, int rank, String department) {
        super(code, name, rank);
        this.department = department;
    }

    public Professor() {
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void displayProfessor() {
        display();
    }

    public void inputProfessor() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhap vao phong ban: ");
        this.department = scanner.nextLine();
    }

    String desProfessor = "";

    @Override
    public String description() {
        switch (getRank()) {
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
    public String toString() {
        return "Professor{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", description: " + description() +
                ", department='" + department + '\'' +
                '}';
    }
}
