package composite.company.composite;

import composite.company.component.Company;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Stream;

public class ConcreteCompany extends Company {

    private List<Company> companies;

    public ConcreteCompany(String name) {
        super(name);
        companies = new LinkedList<>();
    }

    @Override
    public void add(Company company) {
        companies.add(company);
    }

    @Override
    public void remove(Company company) {
        companies.remove(company);
    }

    @Override
    public void display(int depth) {
        Stream
                .iterate("-", String::new)
                .limit(depth)
                .forEach(System.out::print);
        System.out.println(name);

        companies.forEach(company -> company.display(depth + 2));
    }

    @Override
    public void lineOfDuty() {
        companies.forEach(Company::lineOfDuty);
    }

}
