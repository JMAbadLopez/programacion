package org.example.app;

import javafx.beans.property.SimpleStringProperty;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.example.database.ArticuloDAO;
import org.example.model.Articulo;

public class ArticulosController {

    @FXML private TableView<Articulo> tablaArticulos;
    @FXML private TableColumn<Articulo, Integer> colId;
    @FXML private TableColumn<Articulo, String> colNombre;
    @FXML private TableColumn<Articulo, Integer> colPrecio;
    @FXML private TableColumn<Articulo, String> colFabricante;

    private ArticuloDAO adao = new ArticuloDAO();

    @FXML
    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("idArticulo"));
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colPrecio.setCellValueFactory(new PropertyValueFactory<>("precio"));

        colFabricante.setCellValueFactory(celda -> {
            String nombreFabricante = celda.getValue().getFabricante().getNombre();
            return new SimpleStringProperty(nombreFabricante);
        });

        tablaArticulos.getItems().addAll(adao.obtenerTodos());
    }
}
