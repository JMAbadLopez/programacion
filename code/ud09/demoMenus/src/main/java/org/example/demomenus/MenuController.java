package org.example.demomenus;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class MenuController {

    @FXML
    private VBox contentArea; // Vinculación FXML de nuestro receptáculo dinámico

    // Función núcleo: lee FXML, saca su raíz y borra el panel central para injertar el nuevo
    public void cargarPantalla(String archivoFxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(archivoFxml));
            // Actualización radical de los hijos del VBox "contentArea"
            contentArea.getChildren().setAll(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Enlaces de Acción para los botones declarados en nuestro menú maestro
    @FXML
    private void goHello() {
        cargarPantalla("hello-view.fxml");
    }

    @FXML
    private void goFormulario() {
        cargarPantalla("formulario.fxml");
    }
}
