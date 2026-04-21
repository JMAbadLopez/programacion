package es.gva.edu.blocnotas;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class NoteController {
    @FXML
    private Label welcomeText;

    @FXML
    private TextArea noteTextArea;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
