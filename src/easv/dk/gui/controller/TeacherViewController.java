package easv.dk.gui.controller;
import easv.dk.Main;
import easv.dk.gui.model.Student;
import easv.dk.gui.util.DateUtil;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TeacherViewController {

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
        firstNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().firstNameProperty());
        lastNameColumn.setCellValueFactory(
                cellData -> cellData.getValue().lastNameProperty());
        showStudentDetails(null);
        studentTable.getSelectionModel().selectedItemProperty().addListener(
                (observable, oldValue, newValue) -> showStudentDetails(newValue));
    }

   /* public void setMainApp(Main main) {
        this.main = main;
        //System.out.println("main in teacher: "+main);
        studentTable.setItems(main.getStudentData());
    }*/

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
}

