package com.cmd.ui.addstudent;

import com.cmd.ui.util.alert.AlertMaker;
import com.jfoenix.controls.JFXButton;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.Arrays;

public class AddStudentController {

    @FXML
    private StackPane rootPane;

    @FXML
    private HBox hBox;

    @FXML
    private Label closeLabel, minimizeLabel;


    //    Method implementation abstracted using the RequestHandler Singleton class
    @FXML
    public void closeLabelPressed() {
        JFXButton yesButton = new JFXButton("Okay");
        JFXButton cancelButton = new JFXButton("Cancel");
        AlertMaker.showMaterialDialog(rootPane, hBox, Arrays.asList(yesButton, cancelButton), "Exit", "Are you sure you want to exit?");
        yesButton.setOnAction(event -> Platform.exit());
    }

    @FXML
    public void minimizeLabelPressed(MouseEvent mouseEvent) {
        AlertMaker.getInstance().handleMinimize((Stage) ((Node) mouseEvent.getSource()).getScene().getWindow());
    }

}
