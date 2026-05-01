package es.gva.edu.app;

import es.gva.edu.database.FlightDAO;
import es.gva.edu.model.Flight;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;

import java.time.LocalDate;

public class VuelosController {

    @FXML
    private TableView<Flight> tblFlights;
    @FXML
    private TableColumn<Flight, String> colNumFlight;
    @FXML
    private TableColumn<Flight, String> colDestination;
    @FXML
    private TableColumn<Flight, LocalDate> colDeparture;
    @FXML
    private TableColumn<Flight, Integer> colDuration;
    @FXML
    private TextField tfNumFlight, tfDestination, tfDuration;
    @FXML
    private DatePicker dpDeparture;
    @FXML
    private ComboBox<String> cbxFilter;

    private FlightDAO fdao = new FlightDAO();

    @FXML
    private void initialize() {

        colNumFlight.setCellValueFactory(new PropertyValueFactory<>("numFlight"));
        colDestination.setCellValueFactory(new PropertyValueFactory<>("destination"));
        colDeparture.setCellValueFactory(new PropertyValueFactory<>("departure"));
        colDuration.setCellValueFactory(new PropertyValueFactory<>("duration"));

        tblFlights.getItems().addAll(fdao.obtenerTodos());

        ObservableList<String> filterList = FXCollections.observableArrayList("Large flights", "Destination");
        cbxFilter.setItems(filterList);

    }

    public void addFlight(ActionEvent actionEvent) {

        Flight fl = new Flight();
        fl.setNumFlight(tfNumFlight.getText());
        fl.setDestination(tfDestination.getText());
        fl.setDeparture(dpDeparture.getValue());
        fl.setDuration(Integer.parseInt(tfDuration.getText()));

        if (fdao.insertar(fl)) {
            mostrarMensaje("INFO", "Flight added successfully");
            refreshTable();
        } else {
            mostrarMensaje("ERROR", "Flight not inserted");
        }

    }

    public void deleteFlight(ActionEvent actionEvent) {

        Flight fl = tblFlights.getSelectionModel().getSelectedItem();

        if (fl != null) {
            fdao.eliminar(fl.getNumFlight());
            mostrarMensaje("INFO", "Flight deleted successfully");
            refreshTable();
        } else {
            mostrarMensaje("ERROR", "No flight selected");
        }
    }

    public void filter(ActionEvent actionEvent) {

        String filter = cbxFilter.getSelectionModel().getSelectedItem();
        switch (filter) {
            case "Large flights":
                tblFlights.getItems().clear();
                tblFlights.getItems().addAll(fdao.obtenerTodosFiltro("","duration"));
                break;
            case "Destination":
                if(tfDestination.getText().equals("")) {
                    mostrarMensaje("ERROR", "Destination empty");
                } else {
                    tblFlights.getItems().clear();
                    tblFlights.getItems().addAll(fdao.obtenerTodosFiltro(tfDestination.getText(), "destination"));
                }
                break;
            default:
                mostrarMensaje("ERROR", "Invalid filter");
                break;
        }
    }

    @FXML
    public void mostrarMensaje(String type, String message) {
        Alert alert;
        if (type.equals("INFO")) {
            alert = new Alert(Alert.AlertType.INFORMATION);
        } else {
            alert = new Alert(Alert.AlertType.WARNING);
        }
        alert.setTitle(null);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @FXML
    private void refreshTable() {
        tblFlights.getItems().clear();
        initialize();
    }

}
