package BAI_THI.professor_student_managerment;

import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {
    ArrayList<Person>personArrayList=new ArrayList<>();
    Scanner scanner=new Scanner(System.in);
    public void add(){
        System.out.println("Nhap vao so luong: ");
        int size=Integer.parseInt(scanner.nextLine());
        for (int i=0; i<size; i++){
            System.out.println("Giao su(p), hoc sinh(s), exit(e)");
            System.out.println("Nhap vao lua chon: ");
            String choice=scanner.nextLine();
            if(choice.equals("p")){
                Professor professor=new Professor();
                professor.inputProfessor();
                personArrayList.add(professor);
            }
            else if(choice.equals("s")){
                Student student=new Student();
                student.inputStudent();
                personArrayList.add(student);
            }
            else {
                break;
            }
        }
    }
    public void display(){
        for (Person person:personArrayList){
            System.out.println(person);
        }
    }
    public void average(){
        int sum=0;
        int index=0;
        for(Person person:personArrayList){
             sum += person.rank;
             index++;
        }
        System.out.println("Average Rank: "+sum/index);
    }
    public void maxRank(){
        Person personObj=null;
        int max=0;
        for(Person person:personArrayList){
            max= person.getRank();
            break;
        }
        for (Person person:personArrayList){
            if(max<= person.getRank()){
                max= person.getRank();
                personObj=person;
            }
        }
        System.out.println("Nguoi co rank cao nhat: "+personObj);
    }
    public void Remove(){
        Person personObj=null;
        System.out.println("Nhap vao nguoi co id can xoa: ");
        int code=Integer.parseInt(scanner.nextLine());
        for (Person person:personArrayList){
            if(person.getCode()==code){
                personObj=person;
            }
        }
        if(personObj!=null){
            personArrayList.remove(personObj);
            System.out.println("Success delete");
        }else {
            System.err.println("not found.");
        }
    }
}
