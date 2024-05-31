package interfacesAndAbstractsDemo;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
        customerManager.save(new Customer(1, "Nergis","Nergis", LocalDate.of(1995,5,4)));
    }
}
