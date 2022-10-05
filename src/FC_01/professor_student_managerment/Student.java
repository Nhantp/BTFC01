package FC_01.professor_student_managerment;

import com.sun.scenario.effect.impl.sw.java.JSWColorAdjustPeer;

import java.util.Scanner;

public class Student extends Person {
    private String degreeProgram;
    private int yearOfGraduation;

    public Student(String code, String name, int rank, String degreeProgram, int yearOfGraduation) {
        super(code, name, rank);
        this.degreeProgram = degreeProgram;
        this.yearOfGraduation = yearOfGraduation;
    }

    public Student() {
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }

    public int getYearOfGraduation() {
        return yearOfGraduation;
    }

    public void setYearOfGraduation(int yearOfGraduation) {
        this.yearOfGraduation = yearOfGraduation;
    }

    public void inputStudent() {
        Scanner scanner = new Scanner(System.in);
        super.input();
        System.out.println("Nhap vao chuong trinh hoc: ");
        this.degreeProgram = scanner.nextLine();
        System.out.println("Nhap vao nam tot nghiep: ");
        this.yearOfGraduation = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public void display() {
        super.display();
    }

    @Override
    public String description() {
        String desStudent = "";
        switch (getRank()) {
            case 0: {
                desStudent = "Freshman";
                break;
            }
            case 1: {
                desStudent = "Sophomore";
                break;
            }
            case 2: {
                desStudent = "Junior";
                break;
            }
            case 3: {
                desStudent = "Senior";
                break;
            }
            case 4: {
                desStudent = "Graduate";
                break;
            }
            case 5: {
                desStudent = "Masters Postgraduate";
                break;
            }
            case 6: {
                desStudent = "PhD Postgraduate";
                break;
            }
        }
        return desStudent;
    }


    @Override
    public String toString() {
        return "Student{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                ", description: " + description() +
                ", degreeProgram='" + degreeProgram + '\'' +
                ", yearOfGraduation=" + yearOfGraduation +
                '}';
    }
}
