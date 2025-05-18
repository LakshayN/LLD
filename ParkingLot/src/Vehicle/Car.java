package Vehicle;
import ParkingRateStrategy.ParkingRateStrategy;

public class Car extends Vehicle {

    public Car(String licencePlate, VehicleType type, ParkingRateStrategy strat){
        super(licencePlate,type,strat);
    }
    
}
