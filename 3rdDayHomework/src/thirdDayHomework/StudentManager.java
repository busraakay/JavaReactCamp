package thirdDayHomework;

public class StudentManager extends UserManager{

    public void updateChosenCourses(Student student, String newCourse){
        student.setChosenCourses(newCourse);
        System.out.println(student.getFirstName() + " adlı öğrencinin seçtiği kurs " + student.getChosenCourses() + " olarak değiştirildi.");
    }

}
