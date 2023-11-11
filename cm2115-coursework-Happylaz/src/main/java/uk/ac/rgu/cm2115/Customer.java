package uk.ac.rgu.cm2115;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name;
    private String address;
    private List<BankAccount> accounts;
    private CustomerType type;

    public Customer(String name, String address, CustomerType type) {
        this.name = name;
        this.address = address;
        this.type = type;
        this.accounts = new ArrayList<>();
    }

    public void openAccount(BankAccount account) {
        accounts.add(account);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public CustomerType getType() {
        return type;
    }
}
