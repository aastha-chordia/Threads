// ThreadOperations.java

public class ThreadOperations {
    
    public void runThreadClass() {
        System.out.println("\nRunning Thread using MyThread class:");
        MyThread t1 = new MyThread();
        t1.start();
        try {
            t1.join(); 
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void runRunnableClass() {
        
