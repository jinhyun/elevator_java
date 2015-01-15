package test;

import main.ElevatorOperate;
import org.junit.Test;

public class TestElevatorOperate {
    int peoplePushFloor;
    int elevatorSrcFloor;

    @Test
    // 엘리베이터가 1층에서 5층으로 올라간다
    public void testGoUp() throws Exception {
        elevatorSrcFloor = 1;
        peoplePushFloor = 5;

        ElevatorOperate elevatorOperate = new ElevatorOperate();
        elevatorOperate.goUpDown(elevatorSrcFloor, peoplePushFloor);
    }

    @Test
    // 엘리베이터가 5층에서 1층으로 내려간다
    public void testGoDown() throws Exception {
        elevatorSrcFloor = 5;
        peoplePushFloor = 1;

        ElevatorOperate elevatorOperate = new ElevatorOperate();
        elevatorOperate.goUpDown(elevatorSrcFloor, peoplePushFloor);
    }

    // (5층에 있는 엘리베이터)
    // 1층에 있는 사용자 A가 올라가는 버튼을 누른다
    // 1층으로 내려온 엘리베이터의 문이 열린다.
    // 사용자 A가 5층을 누른다.
    // 엘리베이터 문이 닫힌다.

    // (5층으로 올라가는 엘리베이터)
    // 3층에 있는 사용자 B가 올라가는 버튼을 누른다.
    // 3층으로 올라온 엘리베이터의 문이 열린다.
    // 사용자 B가 4층을 누른다.
    // 엘리베이터 문이 닫힌다.

    // 엘리베이터가 4층에서 멈춘다.
    // 엘리베이터가 5층에서 멈춘다.


    /*
     * 엘리베이터 기능
     *  - 사용자 눌렀던 층수를 다시 누르면 목적지 층수가 없어진다.
     *  - 엘리베이터가 가는방향과 사용자가 가능방향이 동일해야만 엘리베이터가 멈춘다.
     *  - 엘리베이터 정원이 존재한다.
     *  - 24시이후에 모든층에서 10분간 작동이 없는 경우, 엘리베이터가 자동으로 1층으로 내려온다.
     *  - 문이 열릴때 소리가 난다.
     */
}