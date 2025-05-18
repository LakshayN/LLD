package ParkingSpot;

import Vehicle.Vehicle;

public class BusSpot extends ParkingSpot{
    public BusSpot(int spotNumber, SpotType spotType){
        super(spotNumber, spotType);
    }

    public boolean canParkVehicle(Vehicle vehicle){
        return true;
    }
}
