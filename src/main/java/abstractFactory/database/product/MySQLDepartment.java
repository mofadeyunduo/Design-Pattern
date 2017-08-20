package abstractFactory.database.product;

import abstractFactory.database.productInterface.Department;

public class MySQLDepartment extends Department {

    @Override
    public void printDepartment() {
        System.out.println("MySQL department");
    }

}
