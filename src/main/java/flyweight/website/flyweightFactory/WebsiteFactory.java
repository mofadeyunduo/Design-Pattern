package flyweight.website.flyweightFactory;

import flyweight.website.flyweight.ConcreteWebsite;
import flyweight.website.flyweightInterface.Website;

import java.util.HashMap;

public class WebsiteFactory {

    private HashMap<String, Website> websiteHashMap = new HashMap<>();

    public Website getWebsiteCategory(String key) {
        if (!websiteHashMap.containsKey(key)) {
            websiteHashMap.put(key, new ConcreteWebsite(key));
        }
        return websiteHashMap.get(key);
    }

    public int getWebsiteCount() {
        return websiteHashMap.size();
    }

}
