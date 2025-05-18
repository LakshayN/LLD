package Vehicle;
import ParkingRateStrategy.ParkingRateStrategy;

public class Bus extends Vehicle {
    public Bus(String no, VehicleType type, ParkingRateStrategy feeStrategy){
        super(no,type,feeStrategy);
    }
}
