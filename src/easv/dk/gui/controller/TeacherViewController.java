package easv.dk.gui.controller;
import easv.dk.Main;
import easv.dk.gui.model.Student;
import easv.dk.gui.util.DateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class TeacherViewController implements Initializable {

    @FXML
    public TableView<Student> studentTable;
    @FXML
    public TableColumn<Student, String> firstNameColumn;
    public Button cancelTeacherViewButton;
    @FXML
    private TableColumn<Student, String> lastNameColumn;
    @FXML
    private Label firstNameLabel;
    @FXML
    private Label lastNameLabel;
    @FXML
    private Label courseLabel;
    @FXML
    private Label lastAttendanceLabel;
    @FXML
    private Text actiontarget;
    @FXML
    private DatePicker datepicker;
    private easv.dk.Main main;

    public TeacherViewController() {

    }

    @FXML
    protected void handleDatePickerAction (ActionEvent event)
        {
            actiontarget.setText(datepicker.getValue().toString());
        }

    @FXML
    private void initialize() {
        main = new Main();
        firstNameColumn.setCellValueFactory(new PropertyValueFactory<>("firstName"));
        lastNameColumn.setCellValueFactory(new PropertyValueFactory<>("lastName"));
        System.out.println("size: "+main.getStudentData().size());
        studentTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showStudentDetails(newValue));
        studentTable.setItems(main.getStudentData());
    }

    private void showStudentDetails(Student student) {
        if (student != null) {
            firstNameLabel.setText(student.getFirstName());
            lastNameLabel.setText(student.getLastName());
            courseLabel.setText(student.getCourse());
            lastAttendanceLabel.setText(DateUtil.format(student.getLastAttendance()));

        } else {
            firstNameLabel.setText("");
            lastNameLabel.setText("");
            courseLabel.setText("");
            lastAttendanceLabel.setText("");

        }
    }

    public void cancelTeacherView(ActionEvent actionEvent) {
        Stage stage = (Stage) cancelTeacherViewButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        initialize();
    }


}

