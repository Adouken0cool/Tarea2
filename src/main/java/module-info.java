module com.example.tarea2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.tarea2 to javafx.fxml;
    exports com.example.tarea2;
    exports Tarea2;
    opens Tarea2 to javafx.fxml;
}