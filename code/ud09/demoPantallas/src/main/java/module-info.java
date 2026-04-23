module org.example.demopantallas {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.demopantallas to javafx.fxml;
    exports org.example.demopantallas;
}