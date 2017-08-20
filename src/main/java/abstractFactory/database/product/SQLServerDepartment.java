package abstractFactory.database.product;

import abstractFactory.database.productInterface.Department;

public class SQLServerDepartment extends Department {

    @Override
    public void printDepartment() {
        System.out.println("SQLServer department");
    }

}
