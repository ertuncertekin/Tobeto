package interfacesDemo;

public class Worker implements IWorkable, IEatable, IPayable {
    @Override
    public void work() {
        System.out.println("Personnel has worked");
    }

    @Override
    public void eat() {
        System.out.println("Personnel has eaten");
    }

    @Override
    public void paySalary() {
        System.out.println("Personnel has taken his/her salary");
    }
}
