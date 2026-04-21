module es.gva.edu.blocnotas {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.gva.edu.blocnotas to javafx.fxml;
    exports es.gva.edu.blocnotas;
}