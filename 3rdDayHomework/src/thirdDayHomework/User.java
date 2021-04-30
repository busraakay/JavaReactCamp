package thirdDayHomework;

public class User {
    private int id;
    private String firstName;
    private String lastName;
    private String Email;

    public User(){}

    public User(int id, String firstName, String lastName, String Email){
        this();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.Email = Email;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
