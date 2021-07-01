package ElevatorDesign;

import java.util.Collections;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Vector;

public class Elevator {
    private int currentFloor=0;
    private Direction currentDirection=Direction.UP;
    private State currentState=State.IDLE;
    private PriorityQueue<Integer> upQueue = new PriorityQueue<Integer>();
    private PriorityQueue<Integer> downQueue = new PriorityQueue<Integer>(Collections.reverseOrder());

    public void addToPendingRequests(LiftRequest req) {
        this.pendingRequests.add(req);
    }

    public int getNextStopFloor() {
        return nextStopFloor;
    }

    public void setNextStopFloor(int nextStopFloor) {
        this.nextStopFloor = nextStopFloor;
    }

    private Vector<LiftRequest> pendingRequests = new Vector<LiftRequest>();
    private int nextStopFloor = 0;

    public Integer pollUpQueue() {
        return upQueue.peek();
    }

    public void addToUpQueue(int dest) {
        this.upQueue.add(dest);
    }

    public Integer pollDownQueue() {
        return downQueue.peek();
    }

    public void addToDownQueue(int dest) {
        this.downQueue.add(dest);
    }

    public int getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(int currentFloor) {
        this.currentFloor = currentFloor;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void setCurrentDirection(Direction currentDirection) {
        this.currentDirection = currentDirection;
    }

    public State getCurrentState() {
        return currentState;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }




}
