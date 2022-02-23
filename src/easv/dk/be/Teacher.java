package easv.dk.be;

public class Teacher extends User {

    private int teacherId;
    private int id;
    private String firstName;
    private String lastName;

    public Teacher(String firstName, String lastName,  int id, int teacherId) {
        super(firstName, lastName, id);
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName(){return lastName;}

    public int getTeacherId(){return teacherId;}

}
