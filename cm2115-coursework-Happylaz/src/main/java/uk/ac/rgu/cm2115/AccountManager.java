package uk.ac.rgu.cm2115;

import java.util.List;
import java.util.ArrayList;

public class AccountManager {
    private List<Customer> customers;

    public AccountManager() {
        // Initialize the customers list when an AccountManager is created
        customers = new ArrayList<>();
    }

    public boolean addCustomer(Customer customer) {
        // Implementation to add a new customer to the account manager
        if (customers.add(customer)) {
            return true; // Customer added successfully
        } else {
            return false; // Failed to add customer
        }
    }
}
