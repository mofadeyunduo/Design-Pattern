package abstractFactory.database.product;

import abstractFactory.database.productInterface.User;

public class MySQLUser extends User {

    @Override
    public void printUser() {
        System.out.println("MySQL user");
    }

}
