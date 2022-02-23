package easv.dk.be;

public class Teacher extends User {

    private int teacherId;
    private int id;
    private String name;

    public Teacher(String firstName, String lastName,  int id, int teacherId) {
        super(firstName, lastName, id);
        this.teacherId = teacherId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTeacherId(){return teacherId;}

}
