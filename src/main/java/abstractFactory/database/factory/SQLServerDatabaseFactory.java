package abstractFactory.database.factory;

import abstractFactory.database.factoryInterface.DatabaseFactory;
import abstractFactory.database.product.SQLServerDepartment;
import abstractFactory.database.product.SQLServerUser;

public class SQLServerDatabaseFactory implements DatabaseFactory {

    @Override
    public void printUser() {
        new SQLServerUser().printUser();
    }

    @Override
    public void printDepartment() {
        new SQLServerDepartment().printDepartment();
    }

}
