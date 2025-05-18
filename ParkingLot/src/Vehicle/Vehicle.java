package Vehicle;
import ParkingRateStrategy.ParkingRateStrategy;

public abstract class Vehicle {
    public String number;
    public VehicleType type;
    public ParkingRateStrategy strategy;

    public Vehicle(String no, VehicleType type, ParkingRateStrategy strat){
        this.number = no;
        this.type = type;
        this.strategy = strat;
    }

    public VehicleType getVehicleType(){
        return type;
    }

}
