import ElevatorDesign.*;

public class main {
    public static void main(String args[]){
        Elevator elevator = new Elevator();
        // person wants to go up from floor 0
        ExternalRequest er = new ExternalRequest(Direction.UP,0);
        InternalRequest ir = new InternalRequest(5);
        LiftRequest req = new LiftRequest(ir,er);

    }
}
