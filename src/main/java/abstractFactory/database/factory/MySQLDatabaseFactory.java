package abstractFactory.database.factory;

import abstractFactory.database.factoryInterface.DatabaseFactory;
import abstractFactory.database.product.MySQLDepartment;
import abstractFactory.database.product.MySQLUser;

public class MySQLDatabaseFactory implements DatabaseFactory {

    @Override
    public void printUser() {
        new MySQLUser().printUser();
    }

    @Override
    public void printDepartment() {
        new MySQLDepartment().printDepartment();
    }

}
