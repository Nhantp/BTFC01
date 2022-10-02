package FC_01.bill_of_using_water;

import java.util.Scanner;

public class ControllerBill {
    //Resident Business Organization Otherwise
    public static void main(String[] args) {
        BillList billList1 = new BillList();
        Bill bill = new Bill();
        Scanner scanner = new Scanner(System.in);
//        billList1.add();
        billList1.display();
//        System.out.println("Nhap vao loai khach hang can tinh tong: ");
//        String customerType = scanner.nextLine();
//        billList1.total(customerType);
//        System.out.println("Nhap id khach hang can xoa:");
//        int customerCode = Integer.parseInt(scanner.nextLine());
//        billList1.remove(customerCode);
//        billList1.display();
        billList1.maxPayment();
    }
}

