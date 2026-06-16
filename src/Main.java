
import model.Ride;
import service.RideSharingService;
import strategy.ShortestRideStrategy;

// Driver Class
public class Main {

    public static void main(String[] args) {

        RideSharingService service =
                new RideSharingService();

        // Add Users
        service.addUser(
                "Rohan",
                "M",
                28
        );

        service.addUser(
                "Shashank",
                "M",
                29
        );

        service.addUser(
                "Nandini",
                "F",
                27
        );

        // Add Vehicle
        service.addVehicle(
                "Rohan",
                "Swift",
                "KA01AB1234"
        );

        // Offer Ride
        service.offerRide(
                "Rohan",
                "Bangalore",
                "Mysore",
                9,
                3,
                2
        );

        // Select Ride
        Ride ride = service.selectRide(
                "Shashank",
                "Bangalore",
                "Mysore",
                new ShortestRideStrategy()
        );

        if (ride != null) {

            System.out.println(
                    "Ride booked with driver : "
                            + ride.getDriver().getName()
            );

        } else {

            System.out.println(
                    "No Ride Available"
            );
        }
    }
}