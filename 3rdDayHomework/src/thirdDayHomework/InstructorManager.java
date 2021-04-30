package thirdDayHomework;

public class InstructorManager extends  UserManager {

    public void updatecoursesTaught(Instructor instructor, String newTaught){
        instructor.setCoursesTaught(newTaught);
        System.out.println(instructor.getFirstName() + " adlı eğitmenin öğrettiği kurs " + instructor.getCoursesTaught() + " olarak değiştirildi.");
    }



}
