package uk.ac.rgu.cm2115;

public class ISA extends BankAccount implements SavingsAccount {
    // Constructor
    public ISA(int accountNumber, int sortCode, String accountName) {
        super(accountNumber, sortCode, accountName);
    }

    @Override
    public void applyInterest() {
        // Implementation to apply interest to the account
    }

    @Override
    public int getInterestRate() {
        // Implementation to get the interest rate
        return 0; // Replace with the actual interest rate value
    }

    @Override
    public void setInterestRate(int rate) {
        // Implementation to set the interest rate
    }

    @Override
    public boolean withdraw(int amount) {
        // Implementation to withdraw the specified amount from the account
        // Update the balance and apply any necessary checks
        return true; // Return true if the withdrawal is successful
    }

    @Override
    public boolean deposit(int amount) {
        // Implementation to deposit the specified amount to the account
        // Update the balance and apply any necessary checks
        return true; // Return true if the deposit is successful
    }
}
