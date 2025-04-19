//MyRunnable.java

public class MyRunnable implements Runnable {
    // This method contains the logic to be executed in a thread
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Thread from MyRunnable: " + i);
            try {
                Thread.sleep(500); // Simulate processing time
            } 
            catch (InterruptedException e) {
                System.out.println("Runnable thread interrupted");
            }
        }
    }
}
