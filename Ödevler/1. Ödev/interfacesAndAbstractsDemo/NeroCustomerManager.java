package interfacesAndAbstractsDemo;

public class NeroCustomerManager extends BaseCustomerManager{
    ICustomerCheckService iCustomerCheckService;
    public NeroCustomerManager(ICustomerCheckService iCustomerCheckService) {
        this.iCustomerCheckService = iCustomerCheckService;
    }
    @Override
    public void save(Customer customer) {
        if (iCustomerCheckService.checkIfRealPerson(customer))
            super.save(customer);
        else
            System.out.println("Not a vaild person");
    }
}
