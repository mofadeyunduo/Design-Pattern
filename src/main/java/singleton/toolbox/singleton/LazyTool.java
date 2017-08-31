package singleton.toolbox.singleton;

public class LazyTool {

    private static LazyTool lazyTool;

    private LazyTool() {
    }

    public static LazyTool getInstance() {
        if(lazyTool == null) {
            lazyTool = new LazyTool();
        }
        return lazyTool;
    }

    public void sayHi() {
        System.out.println("hi");
    }

}
