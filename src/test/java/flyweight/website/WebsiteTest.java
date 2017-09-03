package flyweight.website;

import flyweight.website.flyweightFactory.WebsiteFactory;
import flyweight.website.flyweightInterface.Website;
import flyweight.website.outStatus.User;
import org.junit.Test;

public class WebsiteTest {

    @Test
    public void websiteTest() {
        WebsiteFactory websiteFactory = new WebsiteFactory();

        Website website = websiteFactory.getWebsiteCategory("Product");
        website.use(new User("Piers"));

        website = websiteFactory.getWebsiteCategory("Product");
        website.use(new User("Fiers"));

        website = websiteFactory.getWebsiteCategory("Images");
        website.use(new User("Piers"));

        System.out.println(websiteFactory.getWebsiteCount());
        System.out.println();
    }

}
