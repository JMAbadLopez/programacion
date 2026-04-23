package org.example.demopantallas;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onOpenButtonClick(ActionEvent evento) {
        try {
            // 1. Cargamos el archivo físico FXML de la nueva pantalla
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formulario.fxml"));

            // 2. Rastreamos la ventana actual (Stage) apoyándonos en el botón que activó el evento
            Stage stage = (Stage) ((Node) evento.getSource()).getScene().getWindow();

            // 3. Sustituimos radicalmente la escena alojada y actualizamos el título
            stage.setScene(new Scene(loader.load()));
            stage.setTitle("Zona de Registro");

        } catch (IOException ex) {
            throw new RuntimeException("Lanzamiento fallido de escena", ex);
        }
    }

    @FXML
    private void onOpenButtonSendData(ActionEvent evento) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("formulario.fxml"));

            // 1. Cargamos el Parent raíz primero (sin atarlo a una escena aún)
            Parent root = loader.load();

            // 2. Extraemos el Controlador de la pantalla destino
            FormularioController controladorDestino = loader.getController();

            // 3. ¡Inyectamos los datos en remoto!
            controladorDestino.recibirDatoPrecalculado("Aragorn");

            // 4. Cambiamos la escena normalmente usando el Parent ya "rellenado"
            Stage stage = (Stage) ((Node) evento.getSource()).getScene().getWindow();
            stage.setScene(new Scene(root));
            stage.setTitle("Formulario Autocompletado");

        } catch (IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}
