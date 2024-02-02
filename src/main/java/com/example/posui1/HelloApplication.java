package com.example.posui1;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("Home.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Sanula Super");
        stage.setScene(scene);
        stage.setMaximized(true);
        stage.getIcons().add(new Image(HelloApplication.class.getResourceAsStream("logo-modified.png")));
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}