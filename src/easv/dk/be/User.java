package easv.dk.be;

public class User {

    private String firstName;
    private String lastName;
    private int id;
    private int isTeacher;
    private int isInClass;

    public User(String firstName, String lastName, int id){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }


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
