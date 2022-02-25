package easv.dk.gui.controller;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class StudentViewController {
    public Button cancelStudentViewButton;

    public void cancelStudentView(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelStudentViewButton.getScene().getWindow();
        stage.close();
    }
}
