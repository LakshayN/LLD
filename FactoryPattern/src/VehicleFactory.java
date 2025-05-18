public class VehicleFactory {
    public static Vehicle getVehicle(String vehicleType){
        if(vehicleType.equals("Car")){
            return new Car();
        }
        else if(vehicleType.equals("Bus")){
            return new Bus();
        }
        else{
            throw new IllegalArgumentException("Unknown Vehicle");
        }
    }
}
