package secondDayHomework;

public class Main {
    public static void main(String[] args){
        Category category1 = new Category(1, "Programlama");

        Instructor instructor1 = new Instructor();
        instructor1.id = 1;
        instructor1.instructorName = "Engin Demiroğ";

        Course course1 = new Course(1, "Java - React");
        Course course2 = new Course(2, "C# - Angular");

        Course[] courses = {course1, course2};

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
    }
}
