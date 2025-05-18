public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, Elevator!");
    }
}


/*

    Actors -> Passenger, System

    Passenger -> press inside panel button, press outside panel btn

    System -> move , stop lift
            open, close door
            communicating with inside display, outside display
            algorithm
            call emergency
            floor movement
            request for lift (after presing outside button)


    Generalisation -> inside panel btn - floor req, door open/close req, call emergency

    Association -> (relationships above)

    Include -> floor req --- move/stop lift
            door open/close req ---- open/close door
            outside panel btn ------ req for elevator


    
    CLASSES

    1. Button - inside panel btn, outside panel btn
    2. Panel - elevator, hall/outside panel
    3. Display - elevator, outside display
    4. Door
    5. Floor
    6. Building
    7. Elevator
    8. ElevatorSystem

    Passenger

    Can use Enums to avoid open-close principle
    - ElevatorState (up, down, idle)
    - DoorState (Open, close)
    - DirectionStatus (up, down)


    CLASS DIAG

    Button (status, press(), isPressed()) => 
        -ElevatorButton => destFloor
        -HallButton => directionStatus
    
    ElevatorPanel => floorButtons: ElevatorBtns(list)
                    openButton: ElevatorBtn
                    closedButton: ElevatorBtn
                    emergencyButton: ElevatorBtn

    HallPanel => upButton, downButton

    # Not creating panel abstract class as there is no re-usability

    Display => floot:int
                capacity: int
                direction: directionStatus ENUM

                showElevatorDisplay();
                showHallDisplay();
    
    Door => state
        open()
        close() OR slide() only
    
    
    Floor => id:int //level
            Panel: HallPanel
            display: display

    Building => floors: Floor(list)

    Elevator => id: int;
                door: Door;
                state: ElevatorStatus
                display: Display
                panel: ElevatorPanel
                currentFloor: Floor
                maxCapacity: int
            openDoor();
            closeDoor();
            move();
            stop();

    ElevatorSystem => building: Building;
                monitoring()
                selectBestElevator();


    ENUMS

    ElevatorStatus => moveUp
                        moveDown
                        idle
    
    DirectionStatus (for display)
                    UP, DOWN
    
    DoorStatus => OPEN, CLOSE


    Since we can use multiple algorithms - we can use Strategy Pattern in that case
    

 */
