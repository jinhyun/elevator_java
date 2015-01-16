package main;

import main.domain.Elevator;
import main.domain.Floor;

/**
 * Created by Jinhyun on 2015. 1. 16..
 */
public class FloorOperate {
    public void pushUpBtn(Elevator elevator, Floor floor) throws Exception {
        int elevatorFloorNumber = elevator.getSrcFloorNumber();
        int reqFloorNumber = floor.getNumber();
        boolean floorUpBtn = floor.isUpBtn();

        System.out.println("엘리베이터는 현재 " + elevatorFloorNumber + "층에 있습니다");
        Thread.sleep(1500);
        System.out.println(reqFloorNumber + "층에서 올라가는 버튼을 눌렀습니다");
        Thread.sleep(1500);

        floor.setNumber(reqFloorNumber);
        floor.setUpBtn(floorUpBtn);

        elevator.setSrcFloorNumber(elevatorFloorNumber);
        elevator.setDestFloorNumber(reqFloorNumber);

        ElevatorOperate elevatorOperate = new ElevatorOperate();
        elevatorOperate.goUpDown(elevator);
    }
}
