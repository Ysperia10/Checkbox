module com.example.ejerciciosdesarrollo {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ejerciciosdesarrollo to javafx.fxml;
    exports com.example.ejerciciosdesarrollo;
}