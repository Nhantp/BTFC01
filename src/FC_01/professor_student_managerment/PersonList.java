package FC_01.professor_student_managerment;

import java.util.ArrayList;
import java.util.List;

public class PersonList {
    static List<Person> personList=new ArrayList<>();
    static {
        personList.add(new Professor("1","a",1,"na"));
        personList.add(new Professor("4","d",5,"na"));
        personList.add(new Professor("2","b",6,"wer"));
        personList.add(new Professor("3","a",4,"nwer"));
        personList.add(new Student("5","r",2,"LA",2021));
        personList.add(new Student("8","r",6,"LA",2021));
        personList.add(new Student("7","r",3,"LA",2021));
    }
    public void addStudent(Student student){
        student.inputStudent();
        personList.add(student);
    }
    public void addProfessor(Professor professor){
        professor.inputProfessor();
        personList.add(professor);
    }
    public void displayAll(){
        for(Person person:personList){
            System.out.println(person);

        }
    }
    public void average(){
        int sum=0;
        int index=0;
        for(Person person:personList){
             sum += person.rank;
             index++;
        }
        System.out.println("Average Rank: "+sum/index);
    }
    int max=0;
    public void takeHead(){
        for(Person person:personList){
            max= person.getRank();
            break;
        }
        System.out.println(max);
    }
    public void maxRank(Person person1){
        for (Person person:personList){
            if(max<= person.rank){
                max= person.rank;
                person1=person;
            }
        }
        System.out.println("Nguoi co rank cao nhat: "+person1);
    }
    public void Remove(String code,Person person1){
        for (Person person:personList){
            if(person.getCode().equals(code)){
                person1=person;
            }
        }
        int index=personList.indexOf(person1);
        if(index!=-1){
            personList.remove(index);
        }else {
            System.err.println("not found.");
        }
    }
}
