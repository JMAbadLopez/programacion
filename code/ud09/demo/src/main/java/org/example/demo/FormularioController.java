package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.awt.*;

public class FormularioController {

    @FXML
    private TextField txtNombre;

    @FXML
    private ComboBox<String> comboCategoria;

    @FXML
    private CheckBox chkAcepto;

    @FXML
    private void initialize() {
        comboCategoria.getItems().addAll("General","Premium","Invitado");
    }

    @FXML
    private void limpiarFormularioButtonClick() {
        txtNombre.clear();
        // Vaciamos la elección del usuario
        comboCategoria.getSelectionModel().clearSelection();
        chkAcepto.setSelected(false);
    }

    @FXML
    private void enviarFormularioButtonClick() {
        // Validación básica de campos
        if (txtNombre.getText().isBlank() || comboCategoria.getValue() == null || !chkAcepto.isSelected()) {
            mostrarAlerta("Error", "Debes completar todos los campos y aceptar los términos.");
            return;
        }
        mostrarAlerta("Formulario Recibido", "¡Bienvenido, " + txtNombre.getText() + "!");
    }

    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }
}
