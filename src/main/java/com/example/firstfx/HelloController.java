package com.example.firstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    private int num = 0;

    @FXML
    protected void submitBtnClick() {
        num++;
        welcomeText.setText("Welcome to JavaFX! " + num);
    }
}