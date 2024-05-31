package interfaces;

public class MySQLCustomerDal implements ICustomerDal, IRepository{
    @Override
    public void add() {
        System.out.println("My SQL Eklendi");
    }
}
