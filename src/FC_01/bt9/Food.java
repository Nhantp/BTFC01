package FC_01.bt9;

public abstract class Food {
    private String description;
    private double numOfCalories;

    public Food() {
    }

    public Food(String description, double numOfCalories) {
        this.description = description;
        this.numOfCalories = numOfCalories;
    }

    public abstract double numOfcalo(double numOfCalories);
}
