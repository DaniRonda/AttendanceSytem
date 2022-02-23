package easv.dk.be;

public class Teacher extends User {

    private int teacherId;
    private int id;
    private String name;

    public Teacher(String name, int id, int teacherId) {
        super(name, id);
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
