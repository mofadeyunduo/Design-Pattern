package prototype.resume.resume;

public class Resume implements Cloneable {

    private String name;
    private String sex;
    private String age;
    private WorkExperience workExperience;

    public Resume(String name) {
        this.name = name;
        workExperience = new WorkExperience();
    }

    private Resume(WorkExperience workExperience) {
        try {
            this.workExperience = (WorkExperience) workExperience.clone();
        } catch (CloneNotSupportedException e) {
        }
    }

    public void setPersonalInfo(String sex, String age) {
        this.sex = sex;
        this.age = age;
    }

    public void setWorkExperience(String workDate, String company) {
        workExperience.setWorkDate(workDate);
        workExperience.setCompany(company);
    }

    public void display() {
        System.out.printf("%s %s %s\n", name, sex, age);
        System.out.printf("Work experience: %s %s\n", workExperience.getWorkDate(), workExperience.getCompany());
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        super.clone();
        Resume resume = new Resume(this.workExperience);
        resume.setPersonalInfo(sex, age);
        resume.name = name;
        return resume;
    }

}
