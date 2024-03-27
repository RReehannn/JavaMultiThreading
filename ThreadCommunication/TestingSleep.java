package ThreadCommunication;

// Sleep() the currently executing thread to sleep.
// yield() currently executing thread to pause.
// wait() Current threads is wait until another thread invokes to notify().
// notify() Wakes up a single thread.
// NotifyAll() Wakes up All thread.

public class TestingSleep {
    public static void main(String[] args) throws InterruptedException{
        System.out.println("Before Sleeping");
        Thread.sleep(5000);
        System.out.println("Woke Up");
    }
}
