package org.example.app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu-layout.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 800, 600);

        MenuController menuController = fxmlLoader.getController();
        menuController.cargarPantalla("fabricantes.fxml");

        stage.setTitle("Gestión Tienda Informática");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
