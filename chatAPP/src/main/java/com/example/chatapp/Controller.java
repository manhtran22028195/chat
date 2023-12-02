package com.example.chatapp;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    void switchToMenu(MouseEvent event) {
        Main.switchScene("menu-view.fxml");
    }

    @FXML
    void switchToChat(MouseEvent event) {
        Main.switchScene("chat.fxml");
    }

    @FXML
    void switchToCall(MouseEvent event) {
        Main.switchScene("call.fxml");
    }
}
