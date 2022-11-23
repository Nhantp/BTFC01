package BT_01;

public class HinhChuNhat extends HinhVuong{
    private int b;

    public HinhChuNhat(int a, int b) {
        super(a);
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public int dienTich() {
        return this.a*this.b;
    }

    @Override
    public int chuVi() {
        return (this.a+this.b)*2;
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" +
                "b=" + b +
                ", a=" + a +
                '}';
    }
}
