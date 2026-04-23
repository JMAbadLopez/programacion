package org.example.demopantallas;

import javafx.fxml.FXML;
import javafx.scene.control.*;

public class FormularioController {

    @FXML private TextField txtNombre;
    @FXML private ComboBox<String> comboCategoria;
    @FXML private CheckBox chkAcepto;

    // Se ejecuta automáticamente al arrancar esta vista
    @FXML
    private void initialize() {
        comboCategoria.getItems().addAll("General", "Premium", "Invitado");
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

    // Método auxiliar diseñado para prevenir repetición de código visualizando Alertas
    private void mostrarAlerta(String titulo, String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(titulo);
        alert.setHeaderText(null);
        alert.setContentText(mensaje);
        alert.showAndWait();
    }

    // Método público que llamaremos desde la ventana anterior
    public void recibirDatoPrecalculado(String usuario) {
        // En este ejemplo, auto-rellenamos el campo nombre con la información recibida
        txtNombre.setText(usuario);
    }
}
