
package service;

import model.*;
import strategy.*;

import java.util.*;

// Main service class
// Contains all business operations
public class RideSharingService {

    // Store users using name as key
    private Map<String, User> users = new HashMap<>();

    // Store all rides
    private List<Ride> rides = new ArrayList<>();

    // Add user into system
    public void addUser(String name,
                        String gender,
                        int age) {

        users.put(name,
                new User(name, gender, age));
    }

    // Add vehicle for a user
    public void addVehicle(String userName,
                           String vehicleName,
                           String vehicleNumber) {

        User user = users.get(userName);

        if (user == null) {
            System.out.println("User not found");
            return;
        }

        Vehicle vehicle =
                new Vehicle(vehicleName,
                        vehicleNumber,
                        user);

        user.addVehicle(vehicle);
    }

    // Driver offers a ride
    public void offerRide(String driverName,
                          String source,
                          String destination,
                          int startTime,
                          int rideTime,
                          int seats) {

        User driver = users.get(driverName);

        if (driver == null) {
            System.out.println("Driver not found");
            return;
        }

        if (driver.getVehicles().isEmpty()) {
            System.out.println("No vehicle available");
            return;
        }

        Vehicle vehicle =
                driver.getVehicles().get(0);

        Ride ride = new Ride(
                driver,
                vehicle,
                source,
                destination,
                startTime,
                rideTime,
                seats
        );

        rides.add(ride);
    }

    // Passenger selects a ride
    public Ride selectRide(String passengerName,
                           String source,
                           String destination,
                           RideSelectionStrategy strategy) {

        List<Ride> availableRides =
                new ArrayList<>();

        // Find matching rides
        for (Ride ride : rides) {

            if (ride.getSource().equals(source)
                    && ride.getDestination().equals(destination)
                    && ride.getAvailableSeats() > 0) {

                availableRides.add(ride);
            }
        }

        if (availableRides.isEmpty()) {
            return null;
        }

        // Apply strategy
        Ride selectedRide =
                strategy.selectRide(availableRides);

        if (selectedRide != null) {
            selectedRide.bookSeat();
        }

        return selectedRide;
    }
}