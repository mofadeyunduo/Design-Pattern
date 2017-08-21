package state.work;

import org.junit.Test;
import state.work.context.WorkContext;

public class WorkTest {

    @Test
    public void workTest() {
        WorkContext workContext = new WorkContext();
        workContext.writeProgramme();
        workContext.writeProgramme();
        workContext.writeProgramme();
    }

}
