module com.luisfer.demo3 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.dlsc.formsfx;
    requires mysql.connector.java;
    requires java.sql;

    opens com.luisfer.demo3 to javafx.fxml;
    exports com.luisfer.demo3;
}