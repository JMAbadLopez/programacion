package org.example.app;

import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.example.model.Articulo;

public class ModalArticuloController {
    @FXML private TextField txtId;
    @FXML private TextField txtNombre;
    @FXML private TextField txtPrecio;

    private Articulo articulo;
    private boolean guardado = false;

    public void setArticulo(Articulo articulo) {
        this.articulo = articulo;

        if (articulo != null && articulo.getIdArticulo() >= 0) {
            txtId.setText(String.valueOf(articulo.getIdArticulo()));
            txtNombre.setText(articulo.getNombre());
            txtPrecio.setText(String.valueOf(articulo.getPrecio()));
            
            txtId.setDisable(true); 
        }
    }
    
    @FXML
    private void guardar() {
        try {
            articulo.setIdArticulo(Integer.parseInt(txtId.getText()));
            articulo.setNombre(txtNombre.getText());
            articulo.setPrecio(Integer.parseInt(txtPrecio.getText()));
            
            guardado = true;
            cerrarVentana();
        } catch (NumberFormatException ex) {
            System.out.println("Error de formato numérico en el formulario.");
        }
    }
    
    @FXML
    private void cancelar() {
        guardado = false;
        cerrarVentana();
    }

    private void cerrarVentana() {
        Stage stage = (Stage) txtId.getScene().getWindow();
        stage.close();
    }
    
    public Articulo getArticulo() { return articulo; }
    public boolean isGuardado() { return guardado; }
}
