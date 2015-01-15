package main;

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

    public void goUpDown(int srcFloor, int destFloor) throws Exception {
        if (srcFloor < destFloor){
            goUp(srcFloor, destFloor);

        } else if (srcFloor > destFloor){
            goDown(srcFloor, destFloor);

        } else {
            System.out.println("엘리베이터 위치와 동일합니다.");
        }
    }
}