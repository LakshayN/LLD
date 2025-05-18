import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("factory class");
        Vehicle car = VehicleFactory.getVehicle("Car");
        Vehicle bus = VehicleFactory.getVehicle("Bus");

        car.start();
        bus.start();
        car.stop();
        bus.stop();
    }

    
}


