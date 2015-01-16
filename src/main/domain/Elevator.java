package main.domain;

import java.util.List;

/**
 * Created by Jinhyun on 2015. 1. 16..
 */
public class Elevator {
    int srcFloorNumber;
    int destFloorNumber;
    List destFloorNumberList;

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
}
