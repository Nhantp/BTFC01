package BAI_THI.hinh;

import BAI_THI.hinh.ListHinh;

public class Controller {
    public static void main(String[] args) {
        ListHinh listHinh=new ListHinh();
        listHinh.add();
        listHinh.display();
        listHinh.remove();
        listHinh.display();
        listHinh.search();
    }
}
