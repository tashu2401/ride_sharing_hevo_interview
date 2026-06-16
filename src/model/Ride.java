package model;

public class Ride {

    private User driver;
    private Vehicle vehicle;

    private String source;
    private String destination;

    private int startTime;
    private int rideTime;
    private int availableSeats;

    public Ride(User driver,
                Vehicle vehicle,
                String source,
                String destination,
                int startTime,
                int rideTime,
                int availableSeats) {

        this.driver = driver;
        this.vehicle = vehicle;
        this.source = source;
        this.destination = destination;
        this.startTime = startTime;
        this.rideTime = rideTime;
        this.availableSeats = availableSeats;
    }

    public User getDriver() {
        return driver;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public String getSource() {
        return source;
    }

    public String getDestination() {
        return destination;
    }

    public int getStartTime() {
        return startTime;
    }

    public int getRideTime() {
        return rideTime;
    }

    public int getEndTime() {
        return startTime + rideTime;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void bookSeat() {
        availableSeats--;
    }
}