package com.divideai.views;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MainScene {

    private GridPane grid;

    public MainScene() {
        grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        // Campos de entrada
        Label amigosLabel = new Label("Quantidade de Amigos:");
        GridPane.setConstraints(amigosLabel, 0, 0);
        TextField amigosInput = new TextField();
        GridPane.setConstraints(amigosInput, 1, 0);

        Label valorLabel = new Label("Valor da Conta:");
        GridPane.setConstraints(valorLabel, 0, 1);
        TextField valorInput = new TextField();
        GridPane.setConstraints(valorInput, 1, 1);

        Label resultadoLabel = new Label("Valor por Amigo:");
        GridPane.setConstraints(resultadoLabel, 0, 3);
        TextField resultadoOutput = new TextField();
        resultadoOutput.setEditable(false);
        GridPane.setConstraints(resultadoOutput, 1, 3);

        Button calcularButton = new Button("Calcular");
        GridPane.setConstraints(calcularButton, 1, 2);
        calcularButton.setOnAction(e -> {
            try {
                int amigos = Integer.parseInt(amigosInput.getText());
                double valor = Double.parseDouble(valorInput.getText());
                double resultado = valor / amigos;
                resultadoOutput.setText(String.format("R$ %.2f", resultado));
            } catch (NumberFormatException ex) {
                resultadoOutput.setText("Entrada inválida");
            }
        });

        grid.getChildren().addAll(amigosLabel, amigosInput, valorLabel, valorInput, calcularButton, resultadoLabel, resultadoOutput);
    }

    public GridPane getGridPane() {
        return grid;
    }
}
