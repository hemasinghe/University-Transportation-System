//run the main method
import java.util.ArrayList;
import java.util.Scanner;

public class TestDriver2 {
    public static void main(String[] args) {
        ArrayList<Driver> Drivers = new ArrayList<Driver>();
        Drivers.add(new Driver("Hemachandra", "D0021"));
        Drivers.add(new Driver("Kumara", "D0022"));
        Drivers.add(new Driver("Kasun", "D0023"));
        Drivers.add(new Driver("Udith", "D0024"));
        Drivers.add(new Driver("Shehan", "D0025"));
        Drivers.add(new Driver("Janith", "D0026"));
        Drivers.add(new Driver("Chandrasekara", "D0027"));
        Drivers.add(new Driver("Sunil", "D0028"));

        ArrayList<Conductor> Conductors = new ArrayList<Conductor>();
        Conductors.add(new Conductor("Hemachandra", "C0021"));
        Conductors.add(new Conductor("Kumara", "C0022"));
        Conductors.add(new Conductor("Kasun", "C0023"));
        Conductors.add(new Conductor("Udith", "C0024"));
        Conductors.add(new Conductor("Shehan", "C0025"));
        Conductors.add(new Conductor("Janith", "C0026"));
        Conductors.add(new Conductor("Chandrasekara", "C0027"));
        Conductors.add(new Conductor("Sunil", "C0028"));

        BusAdministrator admin = new BusAdministrator("John", "1234", "password", Drivers);

        // Login
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Admin ID: ");
        String adminID = scanner.next();
        System.out.print("Enter Password: ");
        String password = scanner.next();
        admin.login(adminID, password, Drivers, Conductors);



    }

}


        // Perform Operations
