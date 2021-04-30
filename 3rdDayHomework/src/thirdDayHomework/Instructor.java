package thirdDayHomework;

public class Instructor extends User {
    private String coursesTaught;

    public Instructor(int id, String firstName, String lastName, String Email, String coursesTaught){
        super(id, firstName, lastName, Email);
        this.coursesTaught = coursesTaught;
    }


    public String getCoursesTaught() {
        return coursesTaught;
    }

    public void setCoursesTaught(String coursesTaught) {
        this.coursesTaught = coursesTaught;
    }
}
