package UsingThread_Class;// Creating Thread Extending Thread Class

public class ExtendingThreadClass {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        FirstTask t1 = new FirstTask();
        SecondTask t2 = new SecondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First Thread");
        t1.start();
        System.out.println("\nStarting Second Thread");
        t2.start();
        System.out.println("\nStarting Third  Thread");
        t3.start();

        long EndTime = System.currentTimeMillis();
        System.out.printf("%s Total Time taken: %d",
                Thread.currentThread().getName(),
                (EndTime-StartTime));
    }
}
