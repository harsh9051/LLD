package RealWorldProblems.ElevatorSystem;

// Enum for DoorState
enum DoorState {
    OPEN, CLOSED;
}

// Enum for ElevatorState
enum ElevatorState {
    MOVING, IDLE;
}

// Enum for Direction
enum Direction {
    UP, DOWN, STATIONARY;
}

// Abstract Button Class
abstract class Button {
    protected boolean status;

    public void pressDown() {
        status = true;
    }

    public boolean isPressed() {
        return status;
    }
}

// ElevatorButton Class
class ElevatorButton extends Button {
    private int destinationFloorNumber;

    public ElevatorButton(int destinationFloorNumber) {
        this.destinationFloorNumber = destinationFloorNumber;
    }

    public int getDestinationFloorNumber() {
        return destinationFloorNumber;
    }
}

// HallButton Class
class HallButton extends Button {
    private Direction buttonSign;
    private int sourceFloorNumber;

    public HallButton(Direction buttonSign, int sourceFloorNumber) {
        this.buttonSign = buttonSign;
        this.sourceFloorNumber = sourceFloorNumber;
    }

    public Direction getButtonSign() {
        return buttonSign;
    }

    public int getSourceFloorNumber() {
        return sourceFloorNumber;
    }
}

// ElevatorPanel Class
class ElevatorPanel {
    private ElevatorButton[] floorButtons;
    private ElevatorButton openButton;
    private ElevatorButton closeButton;

    public ElevatorPanel(int totalFloors) {
        floorButtons = new ElevatorButton[totalFloors];
        for (int i = 0; i < totalFloors; i++) {
            floorButtons[i] = new ElevatorButton(i);
        }
        openButton = new ElevatorButton(-1); // Open button
        closeButton = new ElevatorButton(-1); // Close button
    }

    public ElevatorButton[] getFloorButtons() {
        return floorButtons;
    }

    public ElevatorButton getOpenButton() {
        return openButton;
    }

    public ElevatorButton getCloseButton() {
        return closeButton;
    }
}

// Display Class
class Display {
    private int floor;
    private int capacity;
    private Direction direction;

    public Display() {
        this.floor = 0;
        this.capacity = 0;
        this.direction = Direction.STATIONARY;
    }

    public int getFloor() {
        return floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Direction getDirection() {
        return direction;
    }

    public void showElevatorDisplay() {
        System.out.println("Floor: " + floor + ", Capacity: " + capacity + ", Direction: " + direction);
    }

    public void showHallDisplay() {
        System.out.println("Floor: " + floor + ", Waiting Direction: " + direction);
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }
}

// Door Class
class Door {
    private DoorState state;

    public Door() {
        this.state = DoorState.CLOSED;
    }

    public boolean isOpen() {
        return state == DoorState.OPEN;
    }

    public void open() {
        state = DoorState.OPEN;
    }

    public void close() {
        state = DoorState.CLOSED;
    }
}

// ElevatorCar Class
class ElevatorCar {
    private int id;
    private Door door;
    private Display display;
    private ElevatorPanel panel;
    private int currentFloor;
    private ElevatorState state;

    public ElevatorCar(int id, int totalFloors) {
        this.id = id;
        this.door = new Door();
        this.display = new Display();
        this.panel = new ElevatorPanel(totalFloors);
        this.currentFloor = 0;
        this.state = ElevatorState.IDLE;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public ElevatorPanel getPanel() {
        return panel;
    }

    public void setPanel(ElevatorPanel panel) {
        this.panel = panel;
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public ElevatorState getState() {
        return state;
    }

    public void setState(ElevatorState state) {
        this.state = state;
    }

    public void openDoor() {
        door.open();
        System.out.println("Elevator " + id + " Door Opened");
    }

    public void closeDoor() {
        door.close();
        System.out.println("Elevator " + id + " Door Closed");
    }

    public void move(int targetFloor) {
        closeDoor();
        System.out.println("Elevator " + id + " moving from Floor " + currentFloor + " to Floor " + targetFloor);
        currentFloor = targetFloor;
        display.setFloor(currentFloor);
        openDoor();
    }
}

// Floor Class
class Floor {
    private Display[] displays;
    private HallPanel panel;

    public Display[] getDisplays() {
        return displays;
    }

    public void setDisplays(Display[] displays) {
        this.displays = displays;
    }

    public HallPanel getPanel() {
        return panel;
    }

    public void setPanel(HallPanel panel) {
        this.panel = panel;
    }

    public Floor() {
        displays = new Display[]{new Display()};
        panel = new HallPanel();
    }

    public boolean isBottomMost() {
        return false;
    }

    public boolean isTopMost() {
        return false;
    }
}

// HallPanel Class
class HallPanel {
    private HallButton up;
    private HallButton down;

    public HallPanel() {
        up = new HallButton(Direction.UP, 0);
        down = new HallButton(Direction.DOWN, 0);
    }

    public HallButton getUpButton() {
        return up;
    }

    public HallButton getDownButton() {
        return down;
    }
}

// Building Class
class Building {
    private Floor[] floors;
    private ElevatorCar[] elevators;

    public Building(int totalFloors, int totalElevators) {
        floors = new Floor[totalFloors];
        elevators = new ElevatorCar[totalElevators];
        for (int i = 0; i < totalFloors; i++) {
            floors[i] = new Floor();
        }
        for (int i = 0; i < totalElevators; i++) {
            elevators[i] = new ElevatorCar(i + 1, totalFloors);
        }
    }

    public Floor[] getFloors() {
        return floors;
    }

    public ElevatorCar[] getElevators() {
        return elevators;
    }
}

// ElevatorSystem Class
class ElevatorSystem {
    private static ElevatorSystem instance;
    private Building building;

    private ElevatorSystem(int totalFloors, int totalElevators) {
        building = new Building(totalFloors, totalElevators);
    }

    public static ElevatorSystem getInstance(int totalFloors, int totalElevators) {
        if (instance == null) {
            instance = new ElevatorSystem(totalFloors, totalElevators);
        }
        return instance;
    }

    public void monitoring() {
        System.out.println("Monitoring all elevators and floors...");
    }

    // SCAN algorithm implementation
    public void selectBestElevatorCar(int targetFloor) {
        ElevatorCar[] elevators = building.getElevators();
        ElevatorCar bestElevator = null;
        int closestDistance = Integer.MAX_VALUE;

        for (ElevatorCar elevator : elevators) {
            int currentFloor = elevator.getCurrentFloor();
            ElevatorState state = elevator.getState();
            Direction direction = elevator.getDisplay().getDirection();

            // Calculate distance based on SCAN logic
            int distance;
            if ((direction == Direction.UP && targetFloor >= currentFloor) ||
                    (direction == Direction.DOWN && targetFloor <= currentFloor) ||
                    (direction == Direction.STATIONARY)) {
                distance = Math.abs(targetFloor - currentFloor);
            } else {
                distance = Integer.MAX_VALUE; // Ignore elevators moving away
            }

            // Update best elevator
            if (distance < closestDistance) {
                closestDistance = distance;
                bestElevator = elevator;
            }
        }

        if (bestElevator != null) {
            System.out.println("Best elevator selected: " + bestElevator.getId());
            bestElevator.move(targetFloor);
        } else {
            System.out.println("No suitable elevator found for Floor " + targetFloor);
        }
    }

    public Building getBuilding() {
        return building;
    }
}


// Main Class for Testing
public class ElevatorMain {
    public static void main(String[] args) {
        // Create an elevator system with 5 floors and 2 elevators
        ElevatorSystem system = ElevatorSystem.getInstance(5, 2);
        system.selectBestElevatorCar(2);
//        // Test elevator actions
//        ElevatorCar elevator = system.getBuilding().getElevators()[0];
//        elevator.openDoor();
//        elevator.closeDoor();
//        elevator.move(3);
//        elevator.move(0);
//        elevator.openDoor();
        // Monitor system
        system.monitoring();
    }
}
