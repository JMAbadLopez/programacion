package org.example.app;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.layout.VBox;
import java.io.IOException;

public class MenuController {

    @FXML
    private VBox contentArea;

    public void cargarPantalla(String archivoFxml) {
        try {
            Parent root = FXMLLoader.load(getClass().getResource(archivoFxml));
            contentArea.getChildren().setAll(root);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @FXML
    private void goFabricantes() {
        cargarPantalla("fabricantes.fxml");
    }

    @FXML
    private void goArticulos() {
        cargarPantalla("articulos.fxml");
    }
}
