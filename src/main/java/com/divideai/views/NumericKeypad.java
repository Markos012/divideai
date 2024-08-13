package com.divideai.views;

import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;

public class NumericKeypad {

    private GridPane keypad;

    // Interface funcional para capturar a tecla pressionada
    private NumericKeypadListener listener;

    public NumericKeypad() {
        keypad = new GridPane();
        keypad.setHgap(5);
        keypad.setVgap(5);

        // Criar botões numéricos
        Button[] buttons = new Button[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new Button(String.valueOf(i));
            buttons[i].setMinSize(50, 50);
            int value = i;
            buttons[i].setOnAction(e -> {
                if (listener != null) {
                    listener.onButtonPressed(String.valueOf(value));
                }
            });
        }

        // Botão de "Ponto"
        Button pontoButton = new Button(".");
        pontoButton.setMinSize(50, 50);
        pontoButton.setOnAction(e -> {
            if (listener != null) {
                listener.onButtonPressed(".");
            }
        });

        // Botão de "Apagar"
        Button apagarButton = new Button("Apagar");
        apagarButton.setMinSize(50, 50);
        apagarButton.setOnAction(e -> {
            if (listener != null) {
                listener.onButtonPressed("Apagar");
            }
        });

        // Adicionando os botões ao layout do teclado numérico
        for (int i = 1; i < 10; i++) {
            keypad.add(buttons[i], (i - 1) % 3, (i - 1) / 3);
        }
        keypad.add(buttons[0], 1, 3); // Botão "0" no centro da última linha
        keypad.add(pontoButton, 0, 3); // Botão "Ponto" na última linha à esquerda
        keypad.add(apagarButton, 2, 3); // Botão "Apagar" na última linha à direita
    }

    public void setKeypadListener(NumericKeypadListener listener) {
        this.listener = listener;
    }

    public GridPane getKeypad() {
        return keypad;
    }

    public interface NumericKeypadListener {
        void onButtonPressed(String key);
    }
}
