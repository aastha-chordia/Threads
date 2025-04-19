// MyThread.java

public class MyThread extends Thread {
    // This method contains the logic to be executed in a separate thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread from MyThread: " + i);
            
