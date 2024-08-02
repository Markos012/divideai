package com.divideai.views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CadastroScene {

    private GridPane grid;

    public CadastroScene() {
        grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Campos de cadastro
        Label nameLabel = new Label("Nome Completo:");
        GridPane.setConstraints(nameLabel, 0, 0);
        TextField nameInput = new TextField();
        GridPane.setConstraints(nameInput, 1, 0);

        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 1);
        TextField emailInput = new TextField();
        GridPane.setConstraints(emailInput, 1, 1);

        Label phoneLabel = new Label("Telefone:");
        GridPane.setConstraints(phoneLabel, 0, 2);
        TextField phoneInput = new TextField();
        GridPane.setConstraints(phoneInput, 1, 2);

        Label passwordLabel = new Label("Senha:");
        GridPane.setConstraints(passwordLabel, 0, 3);
        TextField passwordInput = new TextField();
        GridPane.setConstraints(passwordInput, 1, 3);

        Button cadastroButton = new Button("Cadastrar");
        GridPane.setConstraints(cadastroButton, 1, 4);
        cadastroButton.setOnAction(e -> {
            MainScene mainScene = new MainScene();
            Stage stage = (Stage) cadastroButton.getScene().getWindow();
            Scene scene = new Scene(mainScene.getGridPane(), 300, 200);
            scene.getStylesheets().add(getClass().getResource("/styles.css").toExternalForm());
            stage.setScene(scene);
        });

        grid.getChildren().addAll(nameLabel, nameInput, emailLabel, emailInput, phoneLabel, phoneInput, passwordLabel, passwordInput, cadastroButton);
    }

    public GridPane getGridPane() {
        return grid;
    }
}
