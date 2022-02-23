package easv.dk.be;

public class Teacher extends User {

    private int teacherId;

    public Teacher(String name, int id, int teacherId) {
        super(name, id);
        this.teacherId = teacherId;
    }



}
