package ElevatorDesign;

public class LiftRequest implements Comparable<LiftRequest> {
    private InternalRequest internalRequest;
    private ExternalRequest externalRequest;

    public LiftRequest(InternalRequest internalRequest, ExternalRequest externalRequest) {
        this.internalRequest = internalRequest;
        this.externalRequest = externalRequest;
    }

    public InternalRequest getInternalRequest() {
        return internalRequest;
    }

    public void setInternalRequest(InternalRequest internalRequest) {
        this.internalRequest = internalRequest;
    }

    public ExternalRequest getExternalRequest() {
        return externalRequest;
    }

    public void setExternalRequest(ExternalRequest externalRequest) {
        this.externalRequest = externalRequest;
    }

    @Override
    public int compareTo(LiftRequest req) {
        if (this.getInternalRequest().getDestinationFloor() == req.getInternalRequest().getDestinationFloor()) {
            return 0;
        } else if (this.getInternalRequest().getDestinationFloor() > req.getInternalRequest().getDestinationFloor()) {
            return 1;
        } else {
            return -1;
        }
    }

    public void process(Elevator elevator) {
        if (this.getInternalRequest().getDestinationFloor() == elevator.getCurrentFloor()) {
            return;
        } else if (elevator.getCurrentDirection() == Direction.UP && this.getInternalRequest().getDestinationFloor() > elevator.getCurrentFloor()) {
            //Append to the up queue
            elevator.addToUpQueue(this.getInternalRequest().getDestinationFloor());
        } else if (elevator.getCurrentDirection() == Direction.DOWN && this.getInternalRequest().getDestinationFloor() < elevator.getCurrentFloor()) {
            //Append to the down queue
            elevator.addToDownQueue(this.getInternalRequest().getDestinationFloor());
        } else {
            elevator.addToPendingRequests(this);
        }
    }
}

