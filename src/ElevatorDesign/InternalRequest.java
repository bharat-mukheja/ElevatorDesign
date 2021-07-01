package ElevatorDesign;

public class InternalRequest {
    public int getDestinationFloor() {
        return destinationFloor;
    }

    public void setDestinationFloor(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    public InternalRequest(int destinationFloor) {
        this.destinationFloor = destinationFloor;
    }

    private int destinationFloor;
}
