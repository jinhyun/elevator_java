package main;

import main.domain.Elevator;

public class ElevatorOperate {
    long ELEVATOR_SPEED = 500;

    // 엘리베이터가 올라간다.
    public void goUp(int srcFloor, int destFloor) throws Exception {
        ElevatorThread et = new ElevatorThread();

        for (int i = srcFloor; i <= destFloor; i++){
            System.out.println("엘리베이터: " + i + "층");
            et.run(ELEVATOR_SPEED);
        }
    }

    // 엘리베이터가 내려간다.
    public void goDown(int srcFloor, int destFloor) throws Exception {
        ElevatorThread et = new ElevatorThread();

        for (int i = srcFloor; i >= destFloor; i--){
            System.out.println("엘리베이터: " + i + "층");
            et.run(ELEVATOR_SPEED);
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

    // 엘리베이터 문이 열린다.
    public void openDoor() throws Exception {
        Elevator elevator = new Elevator();
        ElevatorThread et = new ElevatorThread();

        System.out.println("문이 열립니다.");
        elevator.setDoorStatus(elevator.DOOR_STATUS_OPENING);

        et.run(elevator.DOOR_SPEED);

        System.out.println("문이 열렸습니다.");
        elevator.setDoorStatus(elevator.DOOR_STATUS_OPENED);
    }

    // 엘리베이터 문이 열린상태로 대기중이다.
    public void waitDoor() throws Exception {
        Elevator elevator = new Elevator();
        ElevatorThread et = new ElevatorThread();

        et.run(elevator.DOOR_WAIT_SPEED);
    }

    // 엘리베이터 문이 닫힌다.
    public void closeDoor() throws Exception {
        Elevator elevator = new Elevator();
        ElevatorThread et = new ElevatorThread();

        System.out.println("문이 닫힙니다.");
        elevator.setDoorStatus(elevator.DOOR_STATUS_CLOSING);

        et.run(elevator.DOOR_SPEED);

        System.out.println("문이 닫혔습니다.");
        elevator.setDoorStatus(elevator.DOOR_STATUS_CLOSED);
    }
}