package FC_01.Test;

import java.util.Scanner;

class employee{
    String name;
    double hsl;
    employee(){

    }
    employee(String n, double h){
        name=n;
        hsl=h;
    }
    void nhap() {
        System.out.println("Nhap ten nv:");
        Scanner kb=new Scanner(System.in);
        name =kb.nextLine();
        System.out.println("Nhap he so luong:");
        hsl =kb.nextDouble();
    }
    void in() {
        System.out.print("\nTen nv:"+name+"\nHSL:"+hsl);
    }
}

class manager extends employee{
    String cv;
    double phucap;
    manager(){

    }
    manager(String n,double h, String cv1,double pc){
        super(n,h);
        cv=cv1;
        phucap=pc;
    }
    void nhap() {
        super.nhap();
        System.out.println("Nhap ten chuc vu:");
        Scanner kb=new Scanner(System.in);
        cv =kb.nextLine();
        System.out.println("Nhap phu cap:");
        phucap=kb.nextDouble();
    }
    double luong(){
        return hsl*1500+phucap;
    }

    void in() {
        super.in();
        System.out.println("\nchucvu:"+cv+"\n"+"phucap:"+phucap+"\nTien luong:"+luong());
    }
}
public class nhanvien {
    public static void main(String[] args) {
        employee []x=new employee[100];
        manager []y=new manager[100];
        int m;
        int n;
        System.out.println("ban muon nhap nhan vien hay quan ly: \nnhanvien1,quanli2");
        Scanner kb=new Scanner(System.in);
        int z= kb.nextInt();
        System.out.println("ban muon nhap bao nhieu nhan vien:");
        n=kb.nextInt();
        System.out.println("ban muon nhap bao nhieu quan li:");
        m=kb.nextInt();
        if(z==1) {
            System.out.println("nhap nhan vien:");
            for(int i=0;i<n;i++) {
                x[i] = new employee();
                x[i].nhap();
            }
        }
        else {
            System.out.println("nhap quan li:");
            for(int i=0;i<m;i++) {
                y[i] = new manager();
                y[i].nhap();
            }
        }
        System.out.println("Nhan vien:");
        for(int i=0;i<n;i++) {
            x[i].in();
        }
        System.out.println("Quan li:");
        for(int i=0;i<m;i++) {
            y[i].in();
        }
        System.out.println("sap xep:");
        for(int i=0;i<m;i++) {
            for(int j=0;j<m;j++) {
                if(y[i].luong()<y[j].luong()) {
                    manager t;
                    t=y[i];
                    y[j]=y[i];
                    y[i]=t;
                }
            }
        }
        for(int i=0;i<m;i++) {
            y[i].in();
        }
    }

}