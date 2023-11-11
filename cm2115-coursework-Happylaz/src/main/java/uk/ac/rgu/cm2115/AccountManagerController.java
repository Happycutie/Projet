package uk.ac.rgu.cm2115;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class AccountManagerController {
    @FXML
    private ListView<String> customerList;
    @FXML
    private TextField nameField;
    @FXML
    private TextField addressField;
    @FXML
    private ComboBox<String> customerTypeComboBox;

    @FXML
    private void viewCustomerDetails() {
        // Implement logic to display the Customer scene with the selected customer's details.
    }

    @FXML
    private void addCustomer() {
        // Implement logic to add a new customer to the list.
    }

    @FXML
    private void returnToMainMenu() {
        // Implement logic to navigate back to the main menu.
    }
}
