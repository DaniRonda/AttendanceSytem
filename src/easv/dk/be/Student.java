package easv.dk.be;



public class Student extends User {

    private String course;
    private int id;
    private String name;
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

    public String getName() {
        return name;
    }

    public String getCourse() {
        return course;
    }

    public boolean getAttendence(){return attending;}

    public int getStudentId(){return studentId;}

}
