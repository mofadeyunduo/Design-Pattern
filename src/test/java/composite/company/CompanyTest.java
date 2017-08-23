package composite.company;

import composite.company.composite.ConcreteCompany;
import composite.company.leaf.FinanceDepartment;
import composite.company.leaf.HRDepartment;
import org.junit.Test;

public class CompanyTest {

    @Test
    public void companyTest() {
        ConcreteCompany root = new ConcreteCompany("head company");

        ConcreteCompany child1 = new ConcreteCompany("child company");
        FinanceDepartment child2 = new FinanceDepartment("child finance");
        HRDepartment child3 = new HRDepartment("child HR");

        FinanceDepartment son = new FinanceDepartment("son finance");

        root.add(child1);
        root.add(child2);
        root.add(child3);

        child1.add(son);

        root.display(2);
        System.out.println();
        root.lineOfDuty();
    }

}
