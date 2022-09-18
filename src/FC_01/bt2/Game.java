package FC_01.bt2;

public class Game {
    private String description;

    public Game() {
    }

    public Game(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Game{" +
                "Mo ta: " + description ;
    }
}
