package uk.ac.rgu.cm2115;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class CustomerController {
    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private ListView<String> accountList;
    @FXML
    private TextField accountNameField;
    @FXML
    private TextField balanceField;
    @FXML
    private TextField depositAmountField;
    @FXML
    private TextField withdrawAmountField;
    
    // Handle the button click to open a current account
    @FXML
    private void openCurrentAccount() {
        // Implement the logic to open a current account for the customer.
    }
    
    // Handle the button click to open a savings account
    @FXML
    private void openSavingsAccount() {
        // Implement the logic to open a savings account for the customer.
    }
    
    // Handle the button click to deposit into the account
    @FXML
    private void deposit() {
        // Implement the logic to deposit into the selected account.
    }
    
    // Handle the button click to withdraw from the account
    @FXML
    private void withdraw() {
        // Implement the logic to withdraw from the selected account.
    }
    
    // Handle the button click to return to the Account Manager
    @FXML
    private void returnToAccountManager() {
        // Implement the logic to navigate back to the Account Manager.
    }
}
