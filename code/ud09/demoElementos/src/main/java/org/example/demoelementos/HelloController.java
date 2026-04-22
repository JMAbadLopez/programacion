package org.example.demoelementos;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.RadioButton;

import java.awt.event.MouseEvent;

public class HelloController {
    @FXML
    private Label lbBienvenido;
    @FXML
    private Button btHola;
    @FXML
    private TextField txfNombre;
    @FXML
    private TextArea txaDescripcion;

    @FXML private RadioButton rbHombre;
    @FXML private RadioButton rbMujer;
    @FXML private RadioButton rbOtros;

    @FXML private CheckBox cbAceptar;

    @FXML private ListView<String> lwSistemas;
    @FXML private ComboBox<String> combSistemas;


    @FXML
    public void initialize(){
        // Obligamos a estos tres nodos a discutir: ¡solo uno de ellos podrá estar activo a la vez!
        ToggleGroup tgRadio = new ToggleGroup();
        rbHombre.setToggleGroup(tgRadio);
        rbMujer.setToggleGroup(tgRadio);
        rbOtros.setToggleGroup(tgRadio);

        // Creamos la lista matriz dinámica de inserción
        ObservableList<String> soList = FXCollections.observableArrayList("Windows", "Linux", "Mac OS");

        // Rellenamos e inflamos ambos componentes gráficos basándonos en la matriz original
        lwSistemas.setItems(soList);
        combSistemas.setItems(soList);

        // Extra visual para el listview puro: le facultamos permitir selección múltiple
        lwSistemas.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    }

    @FXML
    public void onHelloButtonClick() {
        lbBienvenido.setText("¡Botón presionado con éxito!");
    }

    @FXML
    public void procesarTextos() {
        String nombre = txfNombre.getText();
        String descripcion = txaDescripcion.getText();

        lbBienvenido.setText("Bienvenid@ "+nombre+". Texto escrito: "+descripcion);

        txfNombre.clear();
        txaDescripcion.clear();
    }

    @FXML
    public void pulsadoButtonRadio(javafx.scene.input.MouseEvent event) {

        // 1. Obtenemos el origen del evento (el RadioButton presionado)
        RadioButton rbPulsado = (RadioButton) event.getSource();

        // 2. Comprobamos a través de un if/else qué botón exacto es
        if (rbPulsado == rbHombre) {
            lbBienvenido.setText("Has marcado: " + rbHombre.getText());
        } else if (rbPulsado == rbMujer) {
            lbBienvenido.setText("Has marcado: " + rbMujer.getText());
        } else if (rbPulsado == rbOtros) {
            lbBienvenido.setText("Has marcado: " + rbOtros.getText());
        }
    }

    @FXML
    public void pulsadoAceptar(ActionEvent actionEvent) {
        // isSelected() nos confiesa instantáneamente su estado actual
        if(cbAceptar.isSelected()){
            lbBienvenido.setText("Condiciones aceptadas correctamente.");
        } else {
            lbBienvenido.setText("Debes aceptar las condiciones para continuar.");
        }
    }

    // Lógica para interceptar la decisión extraída del usuario
    public void obtenerSeleccion() {
        // Si queremos recuperar el dato elegido desde un ComboBox simple:
        String electo = combSistemas.getSelectionModel().getSelectedItem();

        // Si queremos rescatar varios elementos simultáneos desde un ListView:
        ObservableList<String> electos = lwSistemas.getSelectionModel().getSelectedItems();
    }

    @FXML
    private void mostrarErrorCritico() {
        // Instanciamos el modelo genérico que arroja un gran escudo rojo
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle("Notificación de Error");
        alert.setHeaderText(null); // Eliminamos la cabecera gris sobrante
        alert.setContentText("Ha surgido un peligro grave al establecer la ruta FXML.");

        // Pausamos la ejecución general hasta que el usuario reaccione cerrando la mosca web
        alert.showAndWait();
    }

    @FXML
    private void mostrarAvisoSalida() {
        // Modelo de alerta con aspa e interrogante para decisiones afirmativas-negativas
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Salida Controlada");
        alert.setHeaderText(null);
        alert.setContentText("Tienes datos no enviados. ¿Deseas firmemente perder estos progresos?");
        alert.showAndWait();
    }
}
