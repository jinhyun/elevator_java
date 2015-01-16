package main.domain;

import java.util.List;

/**
 * Created by Jinhyun on 2015. 1. 16..
 */
public class Elevator {
    public static String DOOR_STATUS_OPENING = "OPI";
    public static String DOOR_STATUS_OPENED = "OPD";
    public static String DOOR_STATUS_CLOSING = "CLI";
    public static String DOOR_STATUS_CLOSED = "CLD";
    public static long DOOR_SPEED = 2000;
    public static long DOOR_WAIT_SPEED = 3000;

    int srcFloorNumber;
    int destFloorNumber;
    List destFloorNumberList;
    String doorStatus;

    public int getSrcFloorNumber() {
        return srcFloorNumber;
    }

    public void setSrcFloorNumber(int srcFloorNumber) {
        this.srcFloorNumber = srcFloorNumber;
    }

    public int getDestFloorNumber() {
        return destFloorNumber;
    }

    public void setDestFloorNumber(int destFloorNumber) {
        this.destFloorNumber = destFloorNumber;
    }

    public List getDestFloorNumberList() {
        return destFloorNumberList;
    }

    public void setDestFloorNumberList(List destFloorNumberList) {
        this.destFloorNumberList = destFloorNumberList;
    }

    public String getDoorStatus() {
        return doorStatus;
    }

    public void setDoorStatus(String doorStatus) {
        this.doorStatus = doorStatus;
    }
}
