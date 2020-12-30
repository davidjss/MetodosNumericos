module com.davidjss {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.davidjss to javafx.fxml;
    exports com.davidjss;
}