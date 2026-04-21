package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {

        try {
            // 1. Invocamos al FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource("popup.fxml"));

            // 2. Creamos y dotamos de contenido a la nueva ventana (Stage secundario)
            Stage popupStage = new Stage();
            popupStage.setScene(new Scene(loader.load()));
            popupStage.setTitle("Ventana emergente");

            // 3. Comportamiento modal (el popup bloqueará la ventana generadora)
            popupStage.initModality(Modality.APPLICATION_MODAL);

            // 4. Mostramos el popup y obligamos al código a "esperar" aquí hasta el cierre
            popupStage.showAndWait();

        } catch (IOException e) {
            // Gestionamos un posible fallo de lectura (archivo perdido, etc.)
            throw new RuntimeException("Error al abrir la ventana", e);
        }


    }
    @FXML
    public void onOpenButtonClick(ActionEvent event) throws IOException {
        welcomeText.setText("Cambiando de ventana");


            FXMLLoader loader = new FXMLLoader(getClass().getResource("formulario.fxml"));

            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

            stage.setScene(new Scene(loader.load()));

            stage.setTitle("Zona de Registro");

    }
}
