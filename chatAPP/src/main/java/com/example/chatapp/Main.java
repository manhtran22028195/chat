package com.example.chatapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    public static void switchScene(String s) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource(s));
            Scene scene = new Scene(fxmlLoader.load());
            Main.stage.setScene(scene);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static Stage stage;
    @Override
    public void start(Stage stage) throws IOException {
        Main.stage = stage;
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("menu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Main.stage.setTitle("Chat APP");
        Main.stage.setScene(scene);
        Main.stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}