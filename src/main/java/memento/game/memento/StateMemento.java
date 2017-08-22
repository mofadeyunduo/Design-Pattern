package memento.game.memento;

public class StateMemento {

    private Integer HP;
    private Integer MP;
    private Integer str;

    public StateMemento(Integer HP, Integer MP, Integer str) {
        this.HP = HP;
        this.MP = MP;
        this.str = str;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public Integer getMP() {
        return MP;
    }

    public void setMP(Integer MP) {
        this.MP = MP;
    }

    public Integer getStr() {
        return str;
    }

    public void setStr(Integer str) {
        this.str = str;
    }

}
