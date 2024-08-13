package com.divideai.views;

import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

public class MainScene {

    private GridPane grid;
    private TextField amigosInput;
    private TextField valorInput;
    private TextField focusedInput; // Campo atualmente focado

    public MainScene() {
        grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(15);
        grid.setHgap(10);
        grid.setAlignment(Pos.CENTER);

        // Campo de entrada para a quantidade de amigos
        Label amigosLabel = new Label("Quantidade de Amigos:");
        GridPane.setHalignment(amigosLabel, HPos.CENTER);
        amigosInput = new TextField();
        amigosInput.setMaxWidth(200);
        amigosInput.setAlignment(Pos.CENTER);
        amigosInput.setOnMouseClicked(e -> focusedInput = amigosInput);

        // Campo de entrada para o valor da conta
        Label valorLabel = new Label("Valor da Conta:");
        GridPane.setHalignment(valorLabel, HPos.CENTER);
        valorInput = new TextField();
        valorInput.setMaxWidth(200);
        valorInput.setAlignment(Pos.CENTER);
        valorInput.setOnMouseClicked(e -> focusedInput = valorInput);

        // Campo de saída para o resultado
        Label resultadoLabel = new Label("Valor por Amigo:");
        GridPane.setHalignment(resultadoLabel, HPos.CENTER);
        TextField resultadoOutput = new TextField();
        resultadoOutput.setEditable(false);
        resultadoOutput.setMaxWidth(200);
        resultadoOutput.setAlignment(Pos.CENTER);

        // Botão para calcular a divisão da conta
        Button calcularButton = new Button("Calcular");
        calcularButton.setMaxWidth(200);
        GridPane.setHalignment(calcularButton, HPos.CENTER);
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

        // Teclado numérico
        NumericKeypad keypad = new NumericKeypad();
        keypad.setKeypadListener(key -> {
            if (focusedInput != null) {
                if (key.equals("Apagar")) {
                    String currentText = focusedInput.getText();
                    if (!currentText.isEmpty()) {
                        focusedInput.setText(currentText.substring(0, currentText.length() - 1));
                    }
                } else {
                    focusedInput.setText(focusedInput.getText() + key);
                }
            }
        });

        // Adicionando os elementos ao GridPane
        grid.add(amigosLabel, 0, 0);
        grid.add(amigosInput, 0, 1);
        grid.add(valorLabel, 0, 2);
        grid.add(valorInput, 0, 3);
        grid.add(calcularButton, 0, 4);
        grid.add(resultadoLabel, 0, 5);
        grid.add(resultadoOutput, 0, 6);
        grid.add(keypad.getKeypad(), 0, 7);

        grid.setMinSize(300, 500);
    }

    public GridPane getGridPane() {
        return grid;
    }
}
