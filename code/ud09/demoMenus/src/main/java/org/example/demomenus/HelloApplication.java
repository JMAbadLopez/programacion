package org.example.demomenus;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("menu-layout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        MenuController menuController = fxmlLoader.getController();
        menuController.cargarPantalla("hello-view.fxml");
        
        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }
}
