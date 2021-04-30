package thirdDayHomework;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student(1, "Büşra", "Akay", "busraakay06@gmail.com", "C# - Angular");
        Student student2 = new Student(1, "Kübra", "Akay", "kubraakay@gmail.com", "C# - Angular");

        Instructor instructor1 = new Instructor(1, "Engin", "Demiroğ", "engindemirog@gmail.com", "Java-React");

        User[] users = {student1, student2, instructor1};

        UserManager userManager = new UserManager();

        userManager.addMultible(users);

        StudentManager studentManager = new StudentManager();
        studentManager.updateChosenCourses(student1,"C# - Angular");


    }

}
