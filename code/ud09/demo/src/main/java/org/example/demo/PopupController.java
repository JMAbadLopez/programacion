package org.example.demo;

import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

import java.sql.SQLXML;

public class PopupController {

    public void onCloseButtonClick(ActionEvent event) {

        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // 2. Cerramos el stage recuperado
        stage.close();

    }
}
