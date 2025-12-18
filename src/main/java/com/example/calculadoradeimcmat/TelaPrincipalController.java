package com.example.calculadoradeimcmat;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class TelaPrincipalController {

    @FXML
    private ToggleGroup opcoesIMC;

    @FXML
    private RadioButton rbAdultos;

    @FXML
    private RadioButton rbIdosos;

    @FXML
    void cliqueOk(ActionEvent event) {
        String categoria = "";
        if (rbAdultos.isSelected()) {
            categoria = "ADULTO";
        } else {
            categoria = "IDOSO";
        }
        IMCApplication.trocarTela("CALCULO", categoria);
    }

}
