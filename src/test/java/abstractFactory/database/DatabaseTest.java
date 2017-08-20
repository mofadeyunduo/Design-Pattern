package abstractFactory.database;

import abstractFactory.database.factory.MySQLDatabaseFactory;
import abstractFactory.database.factory.SQLServerDatabaseFactory;
import abstractFactory.database.factoryInterface.DatabaseFactory;
import org.junit.Test;

public class DatabaseTest {

    @Test
    public void databaseTest() {
        DatabaseFactory databaseFactory = new MySQLDatabaseFactory();
        databaseFactory.printUser();
        databaseFactory.printDepartment();
        System.out.println();

        databaseFactory = new SQLServerDatabaseFactory();
        databaseFactory.printUser();
        databaseFactory.printDepartment();
    }

}
