module org.example.demoelementos {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.demoelementos to javafx.fxml;
    exports org.example.demoelementos;
}