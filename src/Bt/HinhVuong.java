package Bt;

public class HinhVuong {
    protected double canh;
    //constructor

    public HinhVuong(double canh) {
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }


    //dien tich va chu vi
    public double dienTich(){
        return canh * canh ;
    }

    public double chuVi(){
        return canh * 4 ;
    }
    //toString
    @Override
    public String toString() {
        return "HinhVuong, " +canh+", S="+dienTich()+", P="+chuVi();
    }

}
