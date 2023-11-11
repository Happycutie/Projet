package uk.ac.rgu.cm2115;

public abstract class BankAccount {
    protected int accountNumber;
    protected int sortCode;
    protected int balance;
    protected final String accountName;

    public BankAccount(int accountNumber, int sortCode, String accountName) {
        this.accountNumber = accountNumber;
        this.sortCode = sortCode;
        this.balance = 0; // You can initialize the balance to a default value if needed
        this.accountName = accountName;
    }

    public boolean deposit(int amount) {
        // Implementation for deposit
        return true; // Return true if deposit is successful
    }

    public boolean withdraw(int amount) {
        // Implementation for withdrawal
        return true; // Return true if withdrawal is successful
    }
}
