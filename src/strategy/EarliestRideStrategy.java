package strategy;

import model.Ride;
import java.util.List;

public class EarliestRideStrategy implements RideSelectionStrategy {
    @Override
    public Ride selectRide(List<Ride> rides){
        Ride answer = null;
        for (Ride ride: rides){
            if (answer == null || ride.getEndTime()<answer.getEndTime()){
                answer=ride;
            }
        }
        return answer;
    }

}
