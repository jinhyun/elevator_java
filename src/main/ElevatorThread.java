package main;

/**
 * Created by Jinhyun on 2015. 1. 14..
 */

public class ElevatorThread extends Thread {
    public void run(long sleepTime){
        try{
            Thread.sleep(sleepTime);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
