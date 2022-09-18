package FC_01.bt3;

public class Restaurant extends Shop{
    private int peopleAreServed;
    private int averagePrice;

    public Restaurant() {
    }

    public Restaurant(String name, int peopleAreServed, int averagePrice) {
        super(name);
        this.peopleAreServed = peopleAreServed;
        this.averagePrice = averagePrice;
    }

    public int getPeopleAreServed() {
        return peopleAreServed;
    }

    public void setPeopleAreServed(int peopleAreServed) {
        this.peopleAreServed = peopleAreServed;
    }

    public int getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(int averagePrice) {
        this.averagePrice = averagePrice;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "peopleAreServed=" + peopleAreServed +
                ", averagePrice=" + averagePrice +
                '}';
    }
}
