package interfacesDemo;

public class WorkableManager {
    private IWorkable workable;
    public WorkableManager(IWorkable workable) {
        this.workable = workable;
    }

    public void work() {
        workable.work();
    }

}
