package adapter.basketball.playerInterface;

public abstract class Player {

    private String name;

    public Player(String name) {
        this.name = name;
    }

    public void attack() {
        System.out.println("attack");
    }

    public void defense() {
        System.out.println("defense");
    }

}
