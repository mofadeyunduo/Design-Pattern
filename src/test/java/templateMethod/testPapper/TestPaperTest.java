package templateMethod.testPapper;

import org.junit.Test;
import templateMethod.testPaper.answer.Answer1;
import templateMethod.testPaper.answer.Answer2;
import templateMethod.testPaper.testPaper.TestPaper;

public class TestPaperTest {

    @Test
    public void testPaperTest() {
        TestPaper testPaper = new Answer1();
        testPaper.testQuestion1();
        testPaper.testQuestion2();
        testPaper.testQuestion3();
        System.out.println();

        testPaper = new Answer2();
        testPaper.testQuestion1();
        testPaper.testQuestion2();
        testPaper.testQuestion3();
    }

}
