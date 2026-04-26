package org.example.app;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Modality;
import javafx.stage.Stage;
import org.example.database.ArticuloDAO;
import org.example.database.FabricanteDAO;
import org.example.model.Articulo;
import org.example.model.Fabricante;

public class FabricantesController {

    @FXML private TableView<Fabricante> tablaFabricantes;
    @FXML private TableColumn<Fabricante, Integer> colId;
    @FXML private TableColumn<Fabricante, String> colNombre;

    private FabricanteDAO fdao = new FabricanteDAO();
    private ArticuloDAO adao = new ArticuloDAO();

    @FXML
    private void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("idFabricante"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));

        tablaFabricantes.getItems().addAll(fdao.obtenerTodos());
    }

    @FXML
    private void nuevoArticulo() {
        Fabricante fab = tablaFabricantes.getSelectionModel().getSelectedItem();

        if (fab == null) {
            mostrarMensaje("Seleccione un fabricante primero");
            return; 
        }

        abrirModalArticulo(fab);
    }

    private void abrirModalArticulo(Fabricante fab) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("modal-articulo.fxml"));
            Parent root = loader.load();

            ModalArticuloController controller = loader.getController();

            Articulo nuevo = new Articulo();
            nuevo.setFabricante(fab);
            nuevo.setIdArticulo(-1); 

            controller.setArticulo(nuevo);

            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setTitle("Nuevo artículo");
            stage.initModality(Modality.APPLICATION_MODAL); 
            stage.showAndWait(); 

            if (controller.isGuardado()) {
                Articulo articuloFinal = controller.getArticulo();
                
                if (adao.insertar(articuloFinal)) {
                     System.out.println("El artículo se ha creado correctamente.");
                } else {
                     System.out.println("Error al crear el artículo en Base de Datos.");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void mostrarMensaje(String mensaje) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Mensaje");
        alert.setHeaderText(mensaje);
        alert.showAndWait();
    }
}
