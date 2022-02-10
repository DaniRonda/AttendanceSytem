package easv.dk.be;

public class User {

    private String name;
    private int id;
    private int isTeacher;
    private int isInClass;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIsTeacher() {
        return isTeacher;
    }

    public void setIsTeacher(int isTeacher) {
        this.isTeacher = isTeacher;
    }

    public int getIsInClass() {
        return isInClass;
    }

    public void setIsInClass(int isInClass) {
        this.isInClass = isInClass;
    }
}
