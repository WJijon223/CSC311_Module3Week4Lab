package edu.farmingdale.csc311_module3week4lab;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SplashScreenController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}