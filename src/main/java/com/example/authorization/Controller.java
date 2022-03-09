package com.example.authorization;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.scene.Parent;

import java.io.IOException;

public class Controller {

    @FXML
    private TextField email_field;

    @FXML
    private Button login_menu_button;

    @FXML
    private Text logo;

    @FXML
    private PasswordField password_field;

    @FXML
    private Text registr_text;

    @FXML
    private AnchorPane registration_zone;

    @FXML
    private Button sign_in_button;

    @FXML
    void initialize() {


        login_menu_button.setOnAction(event -> {
            login_menu_button.getScene().getWindow().hide();

            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("authorization.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.showAndWait();
        });



    }

}
