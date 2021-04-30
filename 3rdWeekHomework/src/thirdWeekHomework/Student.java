package thirdWeekHomework;

public class Student extends User {

    private String chosenCourses;

    public Student(int id, String firstName, String lastName, String Email, String chosenCourses){
        super(id, firstName, lastName, Email);
        this.setChosenCourses(chosenCourses);
    }

    public String getChosenCourses() {
        return chosenCourses;
    }

    public void setChosenCourses(String chosenCourses) {
        this.chosenCourses = chosenCourses;
    }
}
