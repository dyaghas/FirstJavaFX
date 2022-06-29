package com.example.firstfx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private Label welcomeText;
    @FXML private TextField username;
    @FXML private TextField password;

    private int num = 0;

    @FXML
    protected void submitBtnClick() {

        if(username.getText().equals("admin") && password.getText().equals("admin")) {
            num++;
            welcomeText.setText("Welcome to JavaFX! " + num);
        } else {
            num = 0;
            welcomeText.setText("Incorrect credentials");
        }
    }
}