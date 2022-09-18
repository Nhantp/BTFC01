package FC_01.bt9;

public class Fruit extends Food{
    private String season;

    public Fruit() {
    }

    public Fruit(String description, double numOfCalories, String season) {
        super(description, numOfCalories);
        this.season = season;
    }

    @Override
    public double numOfcalo(double numOfCalories) {
        return numOfCalories;
    }

}
