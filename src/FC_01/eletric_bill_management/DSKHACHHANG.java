package FC_01.eletric_bill_management;
import java.util.*;

public class DSKHACHHANG {
    Scanner scanner=new Scanner(System.in);
    static List<KHACHHANG>khachhangList=new ArrayList<>();
    public void addKHVN(){
        System.out.println("Nhap vao so luong khach hang viet nam: ");
        int size=Integer.parseInt(scanner.nextLine());
        for(int i=0; i<size; i++) {
            System.out.println("Nhap vao khach hang viet nam");
            KHACHHANGVIETNAM khachhangvietnam=new KHACHHANGVIETNAM();
            khachhangvietnam.infoKHVN();
            khachhangList.add(khachhangvietnam);
        }
    }
    public void addKHNN() {
        System.out.println("Nhap vao so luong khach hang nuoc ngoai: ");
        int size = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < size; i++) {
            System.out.println("Nhap vao khach hang nuoc ngoai");
            KHACHHANGNUOCNGOAI khachhangnuocngoai=new KHACHHANGNUOCNGOAI();
            khachhangnuocngoai.infoKHNN();
            khachhangList.add(khachhangnuocngoai);
        }
    }
    public void displayKH(){
        for(KHACHHANG khachhang:khachhangList){
            System.out.println(khachhang);
        }
    }
    public void search(int idCode){
        for (KHACHHANG khachhang:khachhangList){
            if(khachhang.getIdCode()==idCode){
                System.out.println(khachhang);
            }
        }
    }
    public void updateName(int idCode){
        Scanner scanner=new Scanner(System.in);
        for(KHACHHANG khachhang:khachhangList){
            if(khachhang.getIdCode()==idCode){
                System.out.println("Nhap vao ten can sua: ");
                String name=scanner.nextLine();
                khachhang.setName(name);
            }
        }
    }
    public void sort(){
        Collections.sort(khachhangList, new Comparator<KHACHHANG>() {
            @Override
            public int compare(KHACHHANG o1, KHACHHANG o2) {
                return (int) (o2.tinhThanhTien()- o1.tinhThanhTien());
            }
        });
    }
    public void max(){
        sort();
        for (KHACHHANG khachhang:khachhangList){
            System.out.println(khachhang);
            break;
        }
    }


}
