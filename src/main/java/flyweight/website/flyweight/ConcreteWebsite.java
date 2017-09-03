package flyweight.website.flyweight;

import flyweight.website.flyweightInterface.Website;
import flyweight.website.outStatus.User;

public class ConcreteWebsite implements Website {

    private String name;

    public ConcreteWebsite(String name) {
        this.name = name;
    }

    @Override
    public void use(User user) {
        System.out.printf("category %s user %s\n", name, user.getName());
    }

}
