package com.example.authorization;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

public class con_img {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView image;

    @FXML
    private Text logo;

    @FXML
    private Text registr_text;

    @FXML
    private AnchorPane registration_zone;

    @FXML
    void initialize() {
        assert image != null : "fx:id=\"image\" was not injected: check your FXML file 'app.fxml'.";
        assert logo != null : "fx:id=\"logo\" was not injected: check your FXML file 'app.fxml'.";
        assert registr_text != null : "fx:id=\"registr_text\" was not injected: check your FXML file 'app.fxml'.";
        assert registration_zone != null : "fx:id=\"registration_zone\" was not injected: check your FXML file 'app.fxml'.";

    }

}
