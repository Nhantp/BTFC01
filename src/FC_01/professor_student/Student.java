package FC_01.professor_student;

import java.util.Scanner;

public class Student extends Person {
    Scanner scanner=new Scanner(System.in);
    private String degreeProgram;
    private int yearOfGraduation;

    public Student() {
    }

    public Student(String code, String name, int rank, String degreeProgram, int yearOfGraduation) {
        super(code, name, rank);
        this.degreeProgram = degreeProgram;
        this.yearOfGraduation = yearOfGraduation;
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
    public void info(){
        super.info();
        System.out.println("Nhap vao chuong trinh tot nghiep: ");
        this.degreeProgram=scanner.nextLine();
        System.out.println("Nhap vao nam tot nghiep: ");
        this.yearOfGraduation=Integer.parseInt(scanner.nextLine());
    }
    public void display(){
        super.display();
        System.out.println("Chuong trinh tot nghiep: "+degreeProgram);
        System.out.println("Nam tot nghiep: "+yearOfGraduation);
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
    public int getType() {
        return 2;
    }

}
