import java.util.ArrayList;

public class Member {
    public String name;
    public String ID;
    private String password;
    Member(String name,String ID){
        this.name = name;
        this.ID = ID;
    }
    public void login(String adminID, String password, ArrayList<Driver> Drivers, ArrayList<Conductor> Conductors) {
        if (this.ID.equals(ID) && this.password.equals(password)) {
            System.out.println("Login Successful!");

        }
    }


}
