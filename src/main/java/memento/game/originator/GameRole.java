package memento.game.originator;

import memento.game.memento.StateMemento;

public class GameRole {

    private Integer HP;
    private Integer MP;
    private Integer str;

    public GameRole(Integer HP, Integer MP, Integer str) {
        this.HP = HP;
        this.MP = MP;
        this.str = str;
    }

    public StateMemento backupStateMemento() {
        return new StateMemento(HP, MP, str);
    }

    public void recoverStateMemento(StateMemento backup) {
        this.HP = backup.getHP();
        this.MP = backup.getMP();
        this.str = backup.getStr();
    }

    public void fight() {
        HP -= 100;
        MP -= 100;
        str -= 20;
    }

    public void show() {
        System.out.println(String.format("HP:%s MP:%s str:%s", HP.toString(), MP.toString(), str.toString()));
    }

}
