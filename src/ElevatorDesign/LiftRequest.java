package ElevatorDesign;

public class LiftRequest implements Comparable<LiftRequest>{
    private InternalRequest internalRequest;
    private ExternalRequest externalRequest;

    public void setInternalRequest(InternalRequest internalRequest) {
        this.internalRequest = internalRequest;
    }

    public void setExternalRequest(ExternalRequest externalRequest) {
        this.externalRequest = externalRequest;
    }

    public InternalRequest getInternalRequest() {
        return internalRequest;
    }

    public ExternalRequest getExternalRequest() {
        return externalRequest;
    }

    public LiftRequest(InternalRequest internalRequest, ExternalRequest externalRequest) {
        this.internalRequest = internalRequest;
        this.externalRequest = externalRequest;
    }

    @Override
    public int compareTo(LiftRequest req) {
        if (this.getInternalRequest().getDestinationFloor() == req.getInternalRequest().getDestinationFloor()){
            return 0;
        } else if (this.getInternalRequest().getDestinationFloor()> req.getInternalRequest().getDestinationFloor()){
            return 1;
        } else{
            return -1;
        }
    }
}

