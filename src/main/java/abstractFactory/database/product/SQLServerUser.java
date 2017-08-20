package abstractFactory.database.product;

import abstractFactory.database.productInterface.User;

public class SQLServerUser extends User {

    @Override
    public void printUser() {
        System.out.println("SQLServer user");
    }

}
