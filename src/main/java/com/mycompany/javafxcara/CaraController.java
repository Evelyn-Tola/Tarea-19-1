package com.mycompany.javafxcara;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.shape.Circle;
import javafx.scene.shape.QuadCurve;

public class CaraController {

    @FXML
    private QuadCurve boca;

    @FXML
    private Circle circulo;

    @FXML
    void CambiarCara(ActionEvent event) {

        boca.setStartX(-35);
        boca.setStartY(-13);
        boca.setEndX(29);
        boca.setEndY(-13);
        boca.setControlX(0);
        boca.setControlY(22);
        
    }

}
