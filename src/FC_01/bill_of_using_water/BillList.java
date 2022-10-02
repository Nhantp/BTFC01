package FC_01.bill_of_using_water;

import java.util.*;

public class BillList {
    Bill bill = new Bill();
    private static List<Bill> billList = new ArrayList<>();
    private int numberBill;

    //Resident Business Organization Otherwise
    static {
        billList.add(new Bill(1, "Resident", 3, 7));
        billList.add(new Bill(2, "Business", 3, 7));
        billList.add(new Bill(3, "Resident", 3, 10));
        billList.add(new Bill(4, "Business", 3, 7));
        billList.add(new Bill(4, "Business", 3, 5));
    }

    public void add() {
        bill.input();
        billList.add(bill);
    }

    public void total(String customerType) {
        double sum = 0;
        for (Bill bill : billList) {
            if (bill.getCustomerType().equals(customerType)) {
                bill.price();
                sum += bill.payment();
            }
        }
        System.out.println("Tong tien hoa don " + customerType + ": " + sum);
    }

    //Resident Business Organization Otherwise
    public void display() {
        for (Bill bill : billList) {
            System.out.println(bill);
        }
    }

    double max = 0;

    public double takeHead() {
        for (Bill bill : billList) {
            max = bill.payment();
            break;
        }
        return max;
    }

    public void maxPayment() {
        for (Bill bill : billList) {
            if (max < bill.payment()) {
                max = bill.payment();
            }
        }
        System.out.println("Hoa don thanh toan lon nhat: " + max);
    }

    public void remove(int customerCode) {
        Bill bills = new Bill();
        for (Bill bill : billList) {
            if (bill.getIdCustomer() == customerCode) {
                bills = bill;
            }
        }
        int index = billList.indexOf(bills);
        if (index != -1) {
            billList.remove(index);
        } else {
            System.out.println("not found");
        }
    }

}
