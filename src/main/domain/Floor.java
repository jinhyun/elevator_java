package main.domain;

/**
 * Created by Jinhyun on 2015. 1. 16..
 */
public class Floor {
    int number;
    boolean isUpBtn;
    boolean isDownBtn;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public boolean isUpBtn() {
        return isUpBtn;
    }

    public void setUpBtn(boolean isUpBtn) {
        this.isUpBtn = isUpBtn;
    }

    public boolean isDownBtn() {
        return isDownBtn;
    }

    public void setDownBtn(boolean isDownBtn) {
        this.isDownBtn = isDownBtn;
    }
}
