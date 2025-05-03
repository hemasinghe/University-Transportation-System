public class Bus {
    private String number;
    private int seats;
    private String route;
    private String departure;
    private String destination;
    private int reservedSeats;




    public Bus(String number, int seats, String route, String departure, String destination) {
        this.number = number;
        this.seats = seats;
        this.route = route;
        this.departure = departure;
        this.destination = destination;
        this.reservedSeats = 0;
    }

    public String getNumber() {
        return number;
    }

    public int getSeats() {
        return seats;
    }

    public String getRoute() {
        return route;
    }

    public String getDeparture() {
        return departure;
    }


    public int getReservedSeats() {
        return reservedSeats;
    }

    public int getAvailableSeats() {
        return seats - reservedSeats;
    }

    public boolean reserveSeats(int numSeats) {
        if (numSeats <= getAvailableSeats()) {
            reservedSeats += numSeats;
            return true;
        } else {
            return false;
        }
    }
    public String getDestination() {
        return destination;
    }

    public String toString() {
        return "Bus " + number + " (" + seats + " seats) on " + route + " route departs at " + departure + " and goes to " + destination;
    }
    public void setSeats(int seats) {
        this.seats=seats;
    }
}




