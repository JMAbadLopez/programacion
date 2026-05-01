module es.gva.edu.aplicacionvuelos {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires java.sql;

    opens es.gva.edu.app to javafx.fxml;
    exports es.gva.edu.app;

    opens es.gva.edu.model to javafx.base;

}