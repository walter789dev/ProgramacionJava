package exercise;

public class Player {
    private String name;
    private String position;
    private int numberShirt;

    public Player(String name, String position, int numberShirt) {
        this.name = name;
        this.position = position;
        this.numberShirt = numberShirt;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getNumberShirt() {
        return this.numberShirt;
    }

    public void setNumberShirt(int numberShirt) {
        this.numberShirt = numberShirt;
    }

    public String toString() {
        return "Player{name='" + this.name + "', position='" + this.position + "', numberShirt=" + this.numberShirt + "}";
    }
}

