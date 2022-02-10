module com.projet6.m1.projet6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.projet6.m1.projet6 to javafx.fxml;
    exports com.projet6.m1.projet6;
}