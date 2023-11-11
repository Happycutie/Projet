module uk.ac.rgu.cm2115 {
    requires transitive javafx.controls;
    requires transitive javafx.fxml;

    opens uk.ac.rgu.cm2115 to javafx.fxml;
    exports uk.ac.rgu.cm2115;
}
