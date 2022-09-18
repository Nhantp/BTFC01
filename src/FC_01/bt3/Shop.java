package FC_01.bt3;

public class Shop {
    public final double SALESJAXJATE =0.06;
    private String name;

    public Shop() {
    }

    public Shop(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                '}';
    }
}
