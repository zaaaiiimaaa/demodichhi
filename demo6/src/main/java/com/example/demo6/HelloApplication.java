package com.example.demo6;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Parent root = FXMLLoader.load(getClass().getResource("hello-view.fxml"));



        Scene scene = new Scene(root, 600, 400);
        stage.setTitle("WELCOME!");
        stage.setResizable(false);
        stage.setScene(scene);
        final double [] x= new double[1];
        final double [] y=new double [1];
        root.setOnMousePressed(event->{
            x[0]=event.getSceneX();
            y[0]=event.getSceneY();
                });
        root.setOnMouseDragged(event -> {

            stage.setX(event.getScreenX() - x[0]);
            stage.setY(event.getScreenY() - y[0]);

        });
        stage.show();

    }

    public static void main(String[] args) {

        launch();
    }
}