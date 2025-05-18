package Vehicle;
import ParkingRateStrategy.ParkingRateStrategy;

public class VehicleFactory {

    public static Vehicle createVehicle(String number, VehicleType type, ParkingRateStrategy strategy){
        if(type == VehicleType.CAR){
            return new Car(number, type, strategy);
        }
        else if(type == VehicleType.BUS){
            return new Bus(number, type, strategy);
        }
        else if(type == VehicleType.TRUCK){
            return new Truck(number, type, strategy);
        }
        return null;
    }
}
