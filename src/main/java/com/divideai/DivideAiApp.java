package com.divideai;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import com.divideai.views.MainScene;

public class DivideAiApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Divide Aí");

        MainScene mainScene = new MainScene();
        Scene scene = new Scene(mainScene.getGridPane(), 400, 300);

        scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
