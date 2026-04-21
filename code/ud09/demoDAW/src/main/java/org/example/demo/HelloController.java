package org.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;

public class HelloController {
    @FXML
    private Label welcomeText;
    @FXML
    private Button btnHello;

    @FXML
    private RadioButton rbMan;
    @FXML
    private RadioButton rbWoman;
    @FXML
    private RadioButton rbOther;

    @FXML
    private TextField txtName;

    @FXML
    private TextField txtAge;

    @FXML
    private CheckBox cbOK;

    @FXML
    private TextArea txtAreaNote;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
        btnHello.setText("It Changes!");
        btnHello.setDisable(true);
    }

    @FXML
    public void initialize() {
        welcomeText.setText("Press button to welcome!");
        btnHello.setText("Say Hello!");

        ToggleGroup toggleGroup = new ToggleGroup();
        rbMan.setToggleGroup(toggleGroup);
        rbWoman.setToggleGroup(toggleGroup);
        rbOther.setToggleGroup(toggleGroup);
    }

    @FXML
    public void mostrarAlertError(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setHeaderText(null);
        alert.setTitle("Error");
        alert.setContentText("Something went wrong!");
        alert.showAndWait();
    }

    @FXML
    public void mostrarAlertInfo(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Info");
        alert.setContentText("Getting data...");

        String nameText = txtName.getText();
        String ageText = txtAge.getText();

        welcomeText.setText("Hello, " + nameText + " you are " + ageText +" y.o.");
        alert.showAndWait();
    }

    @FXML
    public void mostrarAlertWarning(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setHeaderText(null);
        alert.setTitle("Warning");
        alert.setContentText("Warning about your application!");
        alert.showAndWait();
    }

    @FXML
    public void mostrarAlertConfirmation(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setHeaderText(null);
        alert.setTitle("Confirmation");
        alert.setContentText("Do you want to continue?");
        alert.showAndWait();
    }

    public void pressMan(MouseEvent mouseEvent) {
        welcomeText.setText(rbMan.getText());
    }

    public void pressWoman(MouseEvent mouseEvent) {
        welcomeText.setText(rbWoman.getText());
    }

    public void pressOther(MouseEvent mouseEvent) {
        welcomeText.setText(rbOther.getText());
    }

    public void pressOk(ActionEvent actionEvent) {
        if(cbOK.isSelected()) {
            welcomeText.setText("Checkbox OK!");
        } else {
            welcomeText.setText("Checkbox Cancel!");
        }
    }

    public void saveNote(ActionEvent actionEvent) {

        String area = txtAreaNote.getText();

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText(null);
        alert.setTitle("Information");
        alert.setContentText("Saving your note...");
        alert.showAndWait();

        welcomeText.setText(area);
        txtAreaNote.setText("");

    }
}
