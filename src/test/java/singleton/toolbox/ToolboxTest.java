package singleton.toolbox;

import org.junit.Test;
import singleton.toolbox.singleton.LazyTool;
import singleton.toolbox.singleton.Tool;

public class ToolboxTest {

    @Test
    public void toolboxTest() {
        Tool tool = Tool.getInstance();
        tool.sayHi();
        System.out.println();

        LazyTool lazyTool = LazyTool.getInstance();
        lazyTool.sayHi();
    }

}
