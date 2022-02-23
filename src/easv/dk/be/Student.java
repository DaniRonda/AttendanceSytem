package easv.dk.be;



public class Student extends User {

    private String course;
    private String firstName;
    private String lastName;
    private int id;
    private boolean attending;
    private int studentId;

    public Student(String firstName, String lastName, int id, String course, boolean attending, int studentId) {
        super(firstName, lastName, id);
        this.course = course;
        this.attending = attending;
        this.studentId = studentId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){return lastName;}

    public String getCourse() {
        return course;
    }

    public boolean getAttendence(){return attending;}

    public int getStudentId(){return studentId;}

}
