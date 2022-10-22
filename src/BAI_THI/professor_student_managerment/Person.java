package BAI_THI.professor_student_managerment;


import java.util.Scanner;

public abstract class Person {
    protected int code;
    protected String name;
    protected int rank;

    public Person(int code, String name, int rank) {
        this.code = code;
        this.name = name;
        this.rank = rank;
    }

    protected Person() {
    }

    public int getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getRank() {
        return rank;
    }

    public abstract String description();

    public void display() {
        System.out.println("Employee code:" + code);
        System.out.println("Employee name:" + name);
        System.out.println("Rank:" + rank);
    }

    public void input() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao ma: ");
        this.code =Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao ten: ");
        this.name = scanner.nextLine();
        System.out.println("Nhap vao thu hang: ");
        this.rank = Integer.parseInt(scanner.nextLine());
    }

    @Override
    public String toString() {
        return "Person{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", rank=" + rank +
                '}';
    }
}

