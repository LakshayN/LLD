import ParkingRateStrategy.BasicRate;
import ParkingRateStrategy.ParkingRateStrategy;
import ParkingSpot.CarSpot;
import ParkingSpot.ParkingSpot;
import ParkingSpot.SpotType;
import Vehicle.Vehicle;
import Vehicle.VehicleFactory;
import Vehicle.VehicleType;
import ParkingSpot.ParkingSpot;
import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Parking Lot!");
        
        ParkingSpot s1 = new CarSpot(1,SpotType.CAR);
        ParkingSpot s2 = new CarSpot(2,SpotType.CAR);
        ParkingSpot s3 = new CarSpot(3,SpotType.BUS);
        ParkingSpot s4 = new CarSpot(4,SpotType.TRUCK);

        List<ParkingSpot> parkingSpots = new ArrayList<>();

        parkingSpots.add(s1);
        parkingSpots.add(s2);
        parkingSpots.add(s3);
        parkingSpots.add(s4);

        Vehicle car1 = VehicleFactory.createVehicle("DL9CA7834z", VehicleType.CAR, new BasicRate());
        Vehicle car2 = VehicleFactory.createVehicle("DLz", VehicleType.CAR, new BasicRate());
        Vehicle car3 = VehicleFactory.createVehicle("DL333", VehicleType.CAR, new BasicRate());

        ParkingLot parkingLot = new ParkingLot(parkingSpots);

        parkingLot.parkVehicle(car1);
        parkingLot.parkVehicle(car2);
        // parkingLot.parkVehicle(car3);

        ParkingRateStrategy strategy1 = new BasicRate();
        double p1 = strategy1.getPrice(car1);
        System.out.println("price = " + p1);

        



    }
}


/*

ParkingLot -> isSpotAvaliable(VehicleType)
                parkVehicle(ParkingSpot spot)
                removeVehicle(ParkingSpot spot)


ParkingSpots -> CarSpot, BusSpot, TruckSpot

ParkingSpot -> Vehicle, id, isAvailable, spotType
 */