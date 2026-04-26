module org.example.app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens org.example.app to javafx.fxml;
    exports org.example.app;
    
    // Necesario para que CellValueFactory pueda leer por reflexión los POJOs
    opens org.example.model to javafx.base; 
}
