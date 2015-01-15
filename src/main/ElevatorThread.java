package main;

/**
 * Created by Jinhyun on 2015. 1. 14..
 */

public class ElevatorThread extends Thread {
    public void run(){
        try{
            Thread.sleep(1000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
