package Vehicle;
import ParkingRateStrategy.ParkingRateStrategy;

public class Truck extends Vehicle {
    public Truck(String no, VehicleType type, ParkingRateStrategy feeStrategy){
        super(no,type,feeStrategy);
    }
}
