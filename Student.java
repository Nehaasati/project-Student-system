public class Student extends User{
public Student(String username,String password){
    super(username, password);
}

    @Override
    public boolean login(String username, String password) {
        return getUsername().equals(username)&&getPassword().equals(password);
    }

    @Override
    public void menu() {
        System.out.println("student menu");
        System.out.println("1.view information");
        System.out.println("2.give exam");
        System.out.println("3.Logout");

    }

}
