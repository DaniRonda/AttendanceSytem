package easv.dk.gui.model;import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import java.time.LocalDate;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Student {

    private final StringProperty firstName;
    private final StringProperty lastName;
    private final StringProperty course;
    private final ObjectProperty<LocalDate> lastAttendance;

    /**
     * Default constructor.
     */
    public Student() {
        this(null, null);
    }

    /**
     * Constructor with some initial data.
     *
     * @param firstName
     * @param lastName
     */
    public Student(String firstName, String lastName) {
        this.firstName = new SimpleStringProperty(firstName);
        this.lastName = new SimpleStringProperty(lastName);

        this.course = new SimpleStringProperty("Computer Science");
        this.lastAttendance = new SimpleObjectProperty<LocalDate>(LocalDate.of(2022, 2, 21));
    }

    public String getFirstName() {
        return firstName.get();
    }

    public void setFirstName(String firstName) {
        this.firstName.set(firstName);
    }

    public StringProperty firstNameProperty() {
        return firstName;
    }

    public String getLastName() {
        return lastName.get();
    }

    public void setLastName(String lastName) {
        this.lastName.set(lastName);
    }

    public StringProperty lastNameProperty() {
        return lastName;
    }

    public String getCourse() {
        return course.get();
    }

    public void setCourse(String course) {
        this.course.set(course);    }


    public LocalDate getLastAttendance() {
        return lastAttendance.get();
    }

    public void setLastAttendance(LocalDate lastAttendance) {
        this.lastAttendance.set(lastAttendance);
    }

    public ObjectProperty<LocalDate> lastAttendanceProperty() {
        return lastAttendance;
    }
}
