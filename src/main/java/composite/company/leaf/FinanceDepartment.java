package composite.company.leaf;

import composite.company.component.Company;

import java.util.stream.Stream;

public class FinanceDepartment extends Company {

    public FinanceDepartment(String name) {
        super(name);
    }

    @Override
    public void add(Company company) {
    }

    @Override
    public void remove(Company company) {
    }

    @Override
    public void display(int depth) {
        Stream
                .iterate("-", String::new)
                .limit(depth)
                .forEach(System.out::print);
        System.out.println(name);
    }

    @Override
    public void lineOfDuty() {
        System.out.printf("%s Finance\n", name);
    }

}
