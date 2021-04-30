package thirdDayHomework;

public class UserManager extends User {

    public void addUser(User user){

        System.out.println(user.getFirstName() + " adlı kullanıcı " + " eklendi");

    }

    public void addMultible(User[] users){
        for(User user : users){
            addUser(user);
        }
    }


}
