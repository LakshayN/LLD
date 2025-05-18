import java.util.*;
import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

public class ParkingLot {

    public List<ParkingSpot> parkingSpots;

    public ParkingLot(List<ParkingSpot> parkingSpots){
        this.parkingSpots = parkingSpots;
    }

    public ParkingSpot findAvailabParkingSpot(Vehicle vehicle){
        for(ParkingSpot spot : parkingSpots){
            if(spot.isAvailable && spot.getSpotType().name().equals(vehicle.getVehicleType().name())){
                return spot;
            }
        }
        return null;
    }
    public void parkVehicle(Vehicle vehicle){
        ParkingSpot availabSpot = findAvailabParkingSpot(vehicle);
        if(availabSpot == null){
            throw new IllegalArgumentException("All spots of this type are full");
        }

        availabSpot.parkVehicle(vehicle);
        System.out.print( vehicle.number + " parked");

    }
}
