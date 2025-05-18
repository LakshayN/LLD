package ParkingRateStrategy;

import Vehicle.Vehicle;

public class LuxuryRate implements ParkingRateStrategy {
    @Override
    public double getPrice(Vehicle vehicle){
        return 0.0;
    }
}
