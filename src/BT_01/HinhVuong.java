package BT_01;

public class HinhVuong {
    protected int a;

    public HinhVuong(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int dienTich() {
        return this.a * this.a;
    }

    public int chuVi() {
        return this.a * 4;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "a=" + a +
                '}';
    }
}
