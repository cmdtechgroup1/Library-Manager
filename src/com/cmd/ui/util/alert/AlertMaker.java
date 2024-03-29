package com.cmd.ui.util.alert;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXDialog;
import com.jfoenix.controls.JFXDialogLayout;
import com.jfoenix.controls.events.JFXDialogEvent;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.scene.effect.BoxBlur;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.util.List;

public class AlertMaker {

    private static AlertMaker mInstance;



    public static AlertMaker getInstance(){
        if (mInstance == null) {
            mInstance = new AlertMaker();
        }
        return mInstance;
    }

    public static void showMaterialDialog(StackPane root, Node nodeToBeBlurred, List<JFXButton> controls, String header, String body) {
        BoxBlur blur = new BoxBlur(3, 3, 3);
        if (controls.isEmpty()) {
            controls.add(new JFXButton("Okay"));
        }
        JFXDialogLayout dialogLayout = new JFXDialogLayout();
        JFXDialog dialog = new JFXDialog(root, dialogLayout, JFXDialog.DialogTransition.TOP);


        controls.forEach(controlButton -> {
            controlButton.getStyleClass().add("dialog-button");
            controlButton.addEventHandler(MouseEvent.MOUSE_CLICKED, (MouseEvent mouseEvent) ->
                    dialog.close()
            );
        });

        dialogLayout.setHeading(new Label(header));
        dialogLayout.setBody(new Label(body));
        dialogLayout.setActions(controls);
      //  dialogLayout.getStylesheets().add(AlertMaker.class.getResource("C:\\Users\\LENOVO L560\\Documents\\GitHub\\Library-Manager\\src\\com\\cmd\\ui\\util\\style\\dark-theme.css").toExternalForm());
        dialogLayout.getStyleClass().add("custom-alert");
        dialog.show();
        dialog.setOnDialogClosed((JFXDialogEvent event1) ->{
                    if(nodeToBeBlurred != null)
                        nodeToBeBlurred.setEffect(null);
                }
        );
        if(nodeToBeBlurred != null)
            nodeToBeBlurred.setEffect(blur);
    }

    //    Method to handle minimize
    public void handleMinimize(Stage stage){
        if(stage != null){
            stage.setIconified(true);
        }
    }



}