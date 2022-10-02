package FC_01.bill_of_using_water;

import java.util.Scanner;

public class Bill{
    private int idCustomer;
    private String customerType;
    private int oldIndexOfWaterMeter;
    private int newIndexOfWaterMeter;

    public Bill() {
    }

    public Bill(int idCustomer, String customerType, int oldIndexOfWaterMeter, int newIndexOfWaterMeter) {
        this.idCustomer = idCustomer;
        this.customerType = customerType;
        this.oldIndexOfWaterMeter = oldIndexOfWaterMeter;
        this.newIndexOfWaterMeter = newIndexOfWaterMeter;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public int getOldIndexOfWaterMeter() {
        return oldIndexOfWaterMeter;
    }

    public void setOldIndexOfWaterMeter(int oldIndexOfWaterMeter) {
        this.oldIndexOfWaterMeter = oldIndexOfWaterMeter;
    }

    public int getNewIndexOfWaterMeter() {
        return newIndexOfWaterMeter;
    }

    public void setNewIndexOfWaterMeter(int newIndexOfWaterMeter) {
        this.newIndexOfWaterMeter = newIndexOfWaterMeter;
    }
    public void input(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap vao ma khach hang: ");
        this.idCustomer=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao loai khach hang: ");
        this.customerType=scanner.nextLine();
        System.out.println("Nhap vao chi so dong ho nuoc cu: ");
        this.oldIndexOfWaterMeter=Integer.parseInt(scanner.nextLine());
        System.out.println("Nhap vao chi so dong ho nuoc moi: ");
        this.newIndexOfWaterMeter=Integer.parseInt(scanner.nextLine());
    }
    int unitPrice;
    public int price(){
        if(customerType.equals("Resident")){
            unitPrice=500;
        }
        else if(customerType.equals("Business")){
            unitPrice=400;
        }
        else if(customerType.equals("Organization")){
            unitPrice=400;
        }
        else if(customerType.equals("Otherwise")){
            unitPrice=300;
        }
        else {
            unitPrice=0;
        }
        return unitPrice;
    }
    public double payment(){
        price();
        double payment;
       payment= unitPrice*(newIndexOfWaterMeter-oldIndexOfWaterMeter);
       return payment;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "idCustomer=" + idCustomer +
                ", customerType='" + customerType + '\'' +
                ", oldIndexOfWaterMeter=" + oldIndexOfWaterMeter +
                ", newIndexOfWaterMeter=" + newIndexOfWaterMeter +
                '}';
    }

}
