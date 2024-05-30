package abstractClassesDemo;

public class MySQLDatabaseManager extends BaseDatabaseManager{
    @Override
    public void getData() {
        System.out.println("Veri getirildi: My SQL");
    }
}
