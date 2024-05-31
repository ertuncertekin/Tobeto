package interfacesDemo;

public class Main {

    public static void main(String[] args) {
        WorkableManager workerManager = new WorkableManager(new Robot());
        workerManager.work();
    }
}
