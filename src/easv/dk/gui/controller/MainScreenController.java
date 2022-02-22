package easv.dk.gui.controller;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class MainScreenController {

    public void keyTyped(javafx.scene.input.KeyEvent e) throws IOException {
        switch (e.getCharacter()) {
            case "s":
                Parent root = FXMLLoader.load(getClass().getResource("GUI/View/StudentView.fxml"));
                Scene scene = new Scene(root);
                Stage stage = new Stage();
                stage.setScene(scene);
                stage.show();
            case "t":
                Parent root2 = FXMLLoader.load(getClass().getResource("GUI/View/TeacherView.fxml"));
                Scene scene2 = new Scene(root2);
                Stage stage2 = new Stage();
                stage2.setScene(scene2);
                stage2.show();
                break;
        }
    }
}


