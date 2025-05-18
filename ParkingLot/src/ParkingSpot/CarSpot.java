package ParkingSpot;

import Vehicle.Vehicle;

public class CarSpot extends ParkingSpot {
    public CarSpot(int spotNumber, SpotType spotType){
        super(spotNumber, spotType);
    }

    public boolean canParkVehicle(Vehicle vehicle){
        return true;
    }
}
