package strategy;

import model.Ride;
import java.util.List;

public class ShortestRideStrategy implements RideSelectionStrategy {

    @Override
    public Ride selectRide(List<Ride> rides) {
        Ride answer = null;

        for (Ride ride : rides) {
            if (answer == null || ride.getRideTime() < answer.getRideTime()) {
                answer = ride;
            }
        }

        return answer;
    }
}