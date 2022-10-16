package FC_01.professor_student;

import java.util.Scanner;

public class PeopleList {
    Scanner scanner=new Scanner(System.in);
    Person[] personList;
    public void input() {
        System.out.println("Nhap vao so luong nguoi: ");
        int size = Integer.parseInt(scanner.nextLine());
        personList = new Person[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap vao nguoi thu " + (i + 1) + ":");
            System.out.println("Nhap sv(0) hay GS(<>0): ");
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer == 0) {
                personList[i] = new Student();
            } else {
                personList[i] = new Professor();
            }
            personList[i].info();
        }
    }
    public void display(){
        for (Person person:personList){
            person.display();
        }
    }


    public static void main(String[] args) {
        PeopleList peopleList=new PeopleList();
        peopleList.input();
        peopleList.display();

    }
}
