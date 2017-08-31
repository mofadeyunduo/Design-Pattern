package singleton.toolbox.singleton;

public class Tool {

    private static Tool tool = new Tool();

    private Tool() {
    }

    public static Tool getInstance() {
        return tool;
    }

    public void sayHi() {
        System.out.println("hi");
    }

}
