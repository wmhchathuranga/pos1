package com.example.posui1;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;
import javafx.util.Duration;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private Text date_text;
    @FXML
    private Text time_text;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Timeline timeline = new Timeline(

                new KeyFrame(Duration.seconds(1), event -> {

                    date_text.setText("Date : "+ java.time.LocalDate.now());
                    time_text.setText("Time : "+ java.time.LocalTime.now().format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss")));
                })
        );

        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

}