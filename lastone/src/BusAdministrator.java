
import java.util.ArrayList;
import java.util.Scanner;

public  class BusAdministrator extends Member implements abstraction {

    private String password;
    private ArrayList<String> Drivers;

    private ArrayList<String> conductors;
    private boolean loggedIn;

    public BusAdministrator(String name, String adminID, String password, ArrayList<Driver> Drivers) {
       super(name,adminID);
        this.password = password;
        this.Drivers = new ArrayList<>();

        this.conductors = new ArrayList<>();
        this.loggedIn = false;
    }

public void  addingDrivers(ArrayList<Driver> Drivers){
    Scanner performance = new Scanner(System.in);
    System.out.println("Enter the name of the driver: ");

    String UserName = performance.nextLine();
    System.out.println("Enter the ID of the driver: ");
    String ID = performance.nextLine();
    // Driver driverInfo = new Driver(UserName,ID);


    Driver driverInfo = new Driver(UserName, ID);
    Drivers.add(driverInfo);


    System.out.println(UserName + " added successfully!");

}
public void addingconductors(ArrayList<Conductor> conductors){
    Scanner performance = new Scanner(System.in);
    System.out.println("Enter the name of the conductor: ");

    String UserName2 = performance.nextLine();
    System.out.println("Enter the ID of the conductor: ");
    String ID2 = performance.nextLine();


    Conductor conInfo = new Conductor(UserName2, ID2);
    conductors.add(conInfo);


    System.out.println(UserName2 + " added successfully!");

}

@Override
    public void login(String adminID, String password, ArrayList<Driver>
        Drivers, ArrayList<Conductor> Conductors) {
        if (this.ID.equals(adminID) && this.password.equals(password)) {
            System.out.println("Login Successful!");
            this.loggedIn = true;
            Scanner performance = new Scanner(System.in);
            System.out.println("Do you want to add drivers : ");
            String answer = performance.nextLine();
            if (answer.equals("yes")) {
                addingDrivers(Drivers);
            }

            System.out.println("Do you want to remove drivers : ");
            String answer2 = performance.nextLine();
            if (answer2.equals("yes")) {
                System.out.println("Enter the name of the driver: ");
                String UserName = performance.nextLine();
                System.out.println("Enter the ID of the driver: ");
                String ID2 = performance.nextLine();
                Driver removedDriver = null;
                for (Driver d : Drivers) {
                    if (d.getDriverID().equals(ID2)) {
                        removedDriver = d;
                        Drivers.remove(d);
                        break;
                    }
                }
                if (removedDriver != null) {
                    System.out.println( removedDriver.getUsername()+" has been removed");
                } else {
                    System.out.println("No driver found with the specified ID.");
                }


            }
            System.out.println("Do you want to add conductors : ");
            String answer3 = performance.nextLine();
            if (answer3.equals("yes")) {
                addingconductors(Conductors);



            }

            System.out.println("Do you want to remove conductors : ");
            String answer4 = performance.nextLine();
            if (answer4.equals("yes")) {
                System.out.println("Enter the name of the conductor: ");
                String UserName = performance.nextLine();
                System.out.println("Enter the ID of the conductor: ");
                String ID3 = performance.nextLine();

                Conductor removedconductor = null;
                for (Conductor c : Conductors) {
                    if (c.getConductorID().equals(ID3)) {
                        removedconductor = c;
                        conductors.remove(c);
                        break;
                    }
                }
                if (removedconductor != null) {
                    System.out.println(  removedconductor.getUsername()+" has been removed");
                } else {
                    System.out.println("No conductor found with the specified ID.");
                }

            }

                System.out.println("Do you want to logout");
                String answer5 = performance.nextLine();
                if (answer5.equals("yes"))
                {
                    System.out.println("Logged out Successfully!");
                }
                this.loggedIn = false;
            }

        else {
            System.out.println("invalid id or password");
        }
    }
}


