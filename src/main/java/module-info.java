module com.example.csc325javafxhomework {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.csc325javafxhomework to javafx.fxml;
    exports com.example.csc325javafxhomework;
}