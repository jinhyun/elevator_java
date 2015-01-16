package main;

import main.domain.Elevator;
import main.domain.Floor;

public class ElevatorOperate {
    public void goUp(int srcFloor, int destFloor) throws Exception {
        ElevatorThread et = new ElevatorThread();

        for (int i = srcFloor; i <= destFloor; i++){
            System.out.println("엘리베이터: " + i + "층");
            et.run();
        }
    }

    public void goDown(int srcFloor, int destFloor) throws Exception {
        ElevatorThread et = new ElevatorThread();

        for (int i = srcFloor; i >= destFloor; i--){
            System.out.println("엘리베이터: " + i + "층");
            et.run();
        }
    }

    public void goUpDown(Elevator elevator) throws Exception {
        int srcFloorNumber = elevator.getSrcFloorNumber();
        int destFloorNumber = elevator.getDestFloorNumber();

        if (srcFloorNumber < destFloorNumber){
            goUp(srcFloorNumber, destFloorNumber);

        } else if (srcFloorNumber > destFloorNumber){
            goDown(srcFloorNumber, destFloorNumber);

        } else {
            System.out.println("엘리베이터 위치와 동일합니다.");
        }
    }
}