package Players;

public abstract class Player {
    private String name;
    private int health;

    protected Player(String name, int health) {
        this.name = name;
        this.health = health;
    }


}
