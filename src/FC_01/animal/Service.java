package FC_01.animal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Service  {
    public static String FILE_NAME="D:\\BTFC01\\FC01\\src\\FC_01\\animal\\source.dat";
    Cat cat=new Cat();
    Dog dog=new Dog();
    List<Animal>animalList=new ArrayList<>();
    public void addCat() {
        cat.inputCat();
        animalList.add(cat);
        try {
            FileOutputStream fos=new FileOutputStream(FILE_NAME);
            ObjectOutputStream oos=new ObjectOutputStream(fos);
            oos.writeObject(animalList);

        }catch (IOException e){
            System.out.println("Loi file");
        }
    }
    public void displayCat(){
        try {
            FileInputStream fis=new FileInputStream(FILE_NAME);
            ObjectInputStream ois=new ObjectInputStream(fis);
            List<Animal> animalList =(List<Animal>)ois.readObject();
            for (Animal animal : animalList) {
                cat.intro();
                System.out.println(animal);
            }
        }catch (IOException e){
            System.out.println("Loi file");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    public void addDog(){
        dog.input();
        animalList.add(dog);
    }
    public void displayDog(){
        for (Animal animal:animalList){
            dog.intro();
            System.out.println(animal);
        }
    }

    public static void main(String[] args) {
        Service service=new Service();
//        service.addCat();
        service.displayCat();
    }
}
