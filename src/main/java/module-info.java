module com.jgund.demo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.jgund.demo to javafx.fxml;
    exports com.jgund.demo;
}