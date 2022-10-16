package FC_01.professor_student;

import com.sun.org.apache.xalan.internal.xsltc.trax.XSLTCSource;

import java.util.Scanner;

public abstract class Person {
    protected String code;
    protected String name;
    protected int rank;

    public Person() {
    }

    public Person(String code, String name, int rank) {
        this.code = code;
        this.name = name;
        this.rank = rank;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public abstract String description();

    public abstract int getType();

    public void info(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ma");
        this.code=scanner.nextLine();
        System.out.println("Nhap vao ten: ");
        this.name=scanner.nextLine();
        System.out.println("Nhap vao thu hang: ");
        this.rank=Integer.parseInt(scanner.nextLine());
    }
    public void display() {
        System.out.println("Employee code:" + code);
        System.out.println("Employee name:" + name);
        System.out.println("Rank:" + rank);
    }

}
