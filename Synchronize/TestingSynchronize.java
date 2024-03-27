package Synchronize;
//The Synchronize keyword in JAVA ensures that only one thread can execute a block of code at a time.
// When a thread enters a Synchronized block or method, it acquires a lock on the object.
public class TestingSynchronize {
    public static void main(String[] args) throws InterruptedException{
        Long StartTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        Long EndTime = System.currentTimeMillis();

        System.out.printf("Final counter value: %d and time taken: %d",
                counter.getCount(),(EndTime - StartTime));
    }

}
