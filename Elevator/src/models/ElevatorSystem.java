package models;

public class ElevatorSystem {
    private Building building;

    // SINGLETON
    private static ElevatorSystem elevatorSystemInstance;
    private ElevatorSystem(){

    }
    public synchronized static ElevatorSystem getInstance(){
        if(elevatorSystemInstance == null){
            elevatorSystemInstance = new ElevatorSystem();
        }
        return elevatorSystemInstance;
    }


    public void monitoring(){
        // TODO - add custom logic here
    }
    public void dispatcherAlgo(){

    }
}
