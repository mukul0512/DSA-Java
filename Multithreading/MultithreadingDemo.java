/*
    Que - Write a Java program to demonstrate multithreading. Also, explain the concepts of locks and semaphores with a simple program.
*/

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.Semaphore;

// Thread class implementing Runnable interface
class MyRunnable implements Runnable {
    private String threadName;

    // Constructor to assign a name to the thread
    public MyRunnable(String name) {
        threadName = name;
    }

    // The run method contains the task that each thread will execute
    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(threadName + " is running: " + i);
            try {
                Thread.sleep(500);  // Pause execution for 0.5 seconds
            } catch (InterruptedException e) {
                System.out.println(threadName + " interrupted.");
            }
        }
        System.out.println(threadName + " finished.");
    }
}

// Shared resource class with lock
class SharedResource {
    private int counter = 0;
    private Lock lock = new ReentrantLock(); // Lock for synchronizing access

    public void increment() {
        lock.lock(); // Acquire the lock
        try {
            counter++;
            System.out.println("Counter: " + counter);
        } finally {
            lock.unlock(); // Always release the lock in the finally block
        }
    }
}

// Class demonstrating semaphore usage
class SemaphoreDemo {
    private Semaphore semaphore = new Semaphore(2); // Allow 2 threads to access simultaneously

    public void accessResource(int threadNumber) {
        try {
            semaphore.acquire(); // Acquire a permit
            System.out.println("Thread " + threadNumber + " is accessing the resource.");
            Thread.sleep(1000); // Simulating resource usage
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Thread " + threadNumber + " is releasing the resource.");
            semaphore.release(); // Release the permit
        }
    }
}

public class MultithreadingDemo {
    public static void main(String[] args) {
        // Creating and starting two threads using the Runnable interface
        Thread thread1 = new Thread(new MyRunnable("Thread 1"));
        Thread thread2 = new Thread(new MyRunnable("Thread 2"));

        // Starting the threads
        thread1.start();
        thread2.start();

        // Wait for both threads to finish
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Demonstrating semaphore
        SemaphoreDemo semaphoreDemo = new SemaphoreDemo();
        Runnable semaphoreTask1 = () -> semaphoreDemo.accessResource(1);
        Runnable semaphoreTask2 = () -> semaphoreDemo.accessResource(2);
        Runnable semaphoreTask3 = () -> semaphoreDemo.accessResource(3);

        // Creating and starting threads for semaphore demonstration
        new Thread(semaphoreTask1).start();
        new Thread(semaphoreTask2).start();
        new Thread(semaphoreTask3).start();
    }
}
