package uk.ac.rgu.cm2115;

public class BasicAccount extends BankAccount {

    public BasicAccount(int accountNumber, int sortCode, String accountName) {
        super(accountNumber, sortCode, accountName);
    }

    @Override
    public boolean deposit(int amount) {
        // Implement deposit logic
        if (amount > 0) {
            balance += amount;
            return true;
        } else {
            return false;
        }
    }

    @Override
    public boolean withdraw(int amount) {
        // Implement withdrawal logic
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            return false;
        }
    }
}
