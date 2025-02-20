package edu.farmingdale.csc311_module3week4lab;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class SplashScreenController {

    @FXML
    private Label welcomeText;

    @FXML
    void moveToNewScreen(MouseEvent event) throws IOException {
        System.out.println("Welcome to the landing screen");
        Scene scene = welcomeText.getScene();
        FXMLLoader landingScnRoot = new FXMLLoader(HelloApplication.class.getResource("landing_screen.fxml"));
        scene.setRoot(landingScnRoot.load());
    }

}
