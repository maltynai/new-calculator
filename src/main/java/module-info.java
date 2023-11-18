module com.example.newcalc {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.newcalc to javafx.fxml;
    exports com.example.newcalc;
}