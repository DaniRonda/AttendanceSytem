package easv.dk.be;

public class User {

    private String name;
    private int id;
    private int isTeacher;
    private int isInClass;

    public User(String name, int id){
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }


    public int getId() {
        return id;
    }


    public int getIsTeacher() {
        return isTeacher;
    }

    public int getIsInClass() {
        return isInClass;
    }

}
