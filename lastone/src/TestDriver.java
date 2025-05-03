//run the main method
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestDriver {

    public static void main(String[] args) {
        ArrayList<Bus> buses = new ArrayList<Bus>();
        buses.add(new Bus("A001", 50, "Route 1", "9:00 AM", "BIYAGAMA"));
        buses.add(new Bus("A002", 40, "Route 2", "10:00 AM", "PETTAH"));
        buses.add(new Bus("A003", 30, "Route 3", "11:00 AM", "GAMPAHA"));
        buses.add(new Bus("A004", 20, "Route 4", "12:00 PM", "MEERIGAMA"));
        buses.add(new Bus("A006", 10, "Route 5", "1:00 PM", "BORALLA"));
        buses.add(new Bus("A007", 10, "Route 5", "1:00 PM", "MAWARAMANDIYA"));
        buses.add(new Bus("A008", 10, "Route 5", "1:00 PM", "SEEDUWA"));
        buses.add(new Bus("A009", 10, "Route 5", "1:00 PM", "AVISSAWELLA"));
        buses.add(new Bus("A0010", 10, "Route 5", "1:00 PM", "KOTTAWA"));
        buses.add(new Bus("A0011", 10, "Route 5", "1:00 PM", "KADUWELA"));
        buses.add(new Bus("A0012", 10, "Route 5", "1:00 PM", "MEEGAMUWA"));




ArrayList<passenger> passengers = new ArrayList<passenger>();
passengers.add(new passenger("P1","P001","345"));
        passengers.add(new passenger("P2","P003","78"));


        {
            System.out.println("*** Welcome to the program ***\n");
        }
        {
            System.out.println("Insert ID: ");
        }

        Scanner input1= new Scanner(System.in);
        String EnteredID  = input1.nextLine();

        {
            System.out.println("Insert Password: ");
        }
        Scanner input2 = new Scanner(System.in);
        String Enteredpasswrd = input2.nextLine();

        ArrayList<passenger> foundpassenger= new ArrayList<passenger>();
        for (passenger gotn: passengers)
        {

            if (gotn.getID().equals(EnteredID))
            {
                foundpassenger.add(gotn);

            }
        }


        ArrayList<passenger> foundID= new ArrayList<passenger>();
        for (passenger got: passengers)
        {

            if (got.getPassword().equals(Enteredpasswrd))
            {
                foundID.add(got);

            }
        }
        if ((foundID.size() > 0)&&(foundpassenger.size() >0) )
        {

            System.out.println("login Successful");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter Destination to search for buses (Use block letters): ");
            String searchDestination = input.nextLine();



            ArrayList<Bus> foundBuses = new ArrayList<Bus>();
            for (Bus bus : buses) {
                if (bus.getDestination().equals(searchDestination)) {
                    foundBuses.add(bus);
                }
            }

            if (foundBuses.size() > 0) {
                System.out.println("Found buses:");
                for (Bus bus : foundBuses) {
                    System.out.println(bus.toString());

                    Scanner scanner = new Scanner(System.in);
                    System.out.print("Enter the number of seats required: ");
                    int numSeats = scanner.nextInt();
                    if (bus.getAvailableSeats() >= numSeats) {
                        int seats = bus.getSeats();
                        seats = seats - numSeats;
                        bus.setSeats(seats);
                        System.out.println(numSeats + " " + "Seats booked");
                        System.out.println("number of Available seats: " + seats);


                    }
                    else{
                        System.out.println("Seats not available");
                    }
                }
            }
            else {
                System.out.println("No buses found.");
            }
        }

        else {

            System.out.println("Incorrect ID");
            System.out.println("Login Unsuccessful");

        }

    }

}






