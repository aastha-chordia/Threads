Aastha Chordia
23070126003
AIML A1

# Java Thread

This project demonstrates basic multithreading in Java using:

- A class that extends Thread
- A class that implements Runnable


##  Files & Descriptions
Main.java :- Entry point of the program. Calls thread operations.
MyThread.java :- Custom class extending Thread to define thread behavior.
MyRunnable.java :- Custom class implementing Runnable to define thread behavior.
ThreadOperations.java :- Contains separate methods to run both thread types.


##  Functionality

- runThreadClass() in ThreadOperations: Runs a thread using the MyThread class.
- runRunnableClass() in ThreadOperations : Runs a thread using the MyRunnable class.

Each thread prints numbers from 1 to 5 with a 500ms pause to simulate processing.

