package prototype.resume;

import org.junit.Test;
import prototype.resume.prototype.Resume;

public class ResumeTest {

    @Test
    public void resumeTest() {
        Resume resumeA = new Resume("Piers");
        resumeA.setPersonalInfo("Male", "22");
        resumeA.setWorkExperience("1", "Microsoft");
        resumeA.display();
        System.out.println();

        try {
            Resume resumeB = (Resume) resumeA.clone();
            resumeB.setWorkExperience("2", "Google");
            resumeB.display();
            System.out.println();

            resumeA.display();
        } catch (CloneNotSupportedException e) {
        }
    }

}
