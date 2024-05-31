package interfacesDemo;

public class Robot implements IWorkable , IMaintenance {
    @Override
    public void work() {
        System.out.println("Robot has worked");
    }

    @Override
    public void maintenance() {
        System.out.println("Robot has been maintained");
    }
}
