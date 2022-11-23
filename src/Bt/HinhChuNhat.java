package Bt;

public class HinhChuNhat extends HinhVuong{
    private double canh2;
    public  HinhChuNhat(double canh2, double canh) {
        super(canh);
        this.canh2 = canh2;
    }

    public double getCanh2() {
        return canh2;
    }

    public void setCanh2(double canh2) {
        this.canh2 = canh2;
    }

    public double dienTich(){
        return canh2 * getCanh();
    }

    public double chuVi(){
        return (getCanh()+ canh2)*2;
    }

    public String toString(){
        return "HinhChuNhat, "+canh2+", "+getCanh()+", S="+dienTich()+", P="+chuVi();
    }

}
