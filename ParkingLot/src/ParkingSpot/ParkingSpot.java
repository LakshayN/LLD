package ParkingSpot;
import Vehicle.Vehicle;

public abstract class ParkingSpot {
    public int spotNumber;
    public Vehicle vehicle;
    public boolean isAvailable; 
    public SpotType spotType; 
    
    public ParkingSpot(int spotNumber, SpotType spotType){
        this.spotNumber = spotNumber;
        this.spotType=spotType;
        isAvailable = true;
    }

    public boolean isFree(){
        return isAvailable;
    }

    public abstract boolean canParkVehicle(Vehicle vehicle);

    public void parkVehicle(Vehicle vehicle){
        if (!isAvailable){
            throw new IllegalArgumentException("Spot already used");
        }
        if(!canParkVehicle(vehicle)){
            throw new IllegalArgumentException("Cant park this type of vehicle here.");
        }

        this.vehicle = vehicle;
        isAvailable = false;
    }

    public SpotType getSpotType(){
        return spotType;
    }
}
