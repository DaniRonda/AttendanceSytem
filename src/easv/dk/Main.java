package easv.dk;

import easv.dk.gui.model.Student;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    private ObservableList<Student> studentData = FXCollections.observableArrayList();

    public Main() {
        studentData.add(new Student("Chantal", "Brockmeyer"));
        studentData.add(new Student("Mareike", "Steffens"));
        studentData.add(new Student("Benjamin", "Steckmetz"));
        studentData.add(new Student("Daniel", "Ronda"));

    }

    public ObservableList<Student> getStudentData() {
        return studentData;
    }


    public void start(Stage stage) throws IOException {
            Parent root = FXMLLoader.load(getClass().getResource("GUI/View/TeacherView.fxml"));
            Scene scene = new Scene(root);
            stage.setTitle("Welcome :)");
            stage.setScene(scene);
            stage.show();
        }
    public static void main(String[] args) {
        launch(args);
    }
}
