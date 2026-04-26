module org.example.demomenus {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demomenus to javafx.fxml;
    exports org.example.demomenus;
}