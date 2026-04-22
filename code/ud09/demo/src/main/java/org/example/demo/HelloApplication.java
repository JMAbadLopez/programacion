package org.example.demo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        // 1. Cargamos el esquema absoluto del Menú Fijo (El esqueleto de la App)
        FXMLLoader menuLoader = new FXMLLoader(getClass().getResource("menu-layout.fxml"));
        Scene scene = new Scene(menuLoader.load(), 600, 400);

        // 2. Extraemos su controlador para delegarle de forma forzada la página 1 de inicio
        MenuController menuController = menuLoader.getController();
        menuController.cargarPantalla("hello-view.fxml");

        // 3. Montamos la plataforma final visual
        stage.setScene(scene);
        stage.setTitle("Software Profesional: Menú Global e inyección dinámica");
        stage.show();
    }
}
