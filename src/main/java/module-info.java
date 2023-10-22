module com.example.javatask {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javatask to javafx.fxml;
    exports com.example.javatask;
}