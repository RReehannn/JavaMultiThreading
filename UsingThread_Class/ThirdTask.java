package UsingThread_Class;

public class ThirdTask extends Thread{
    @Override
    public void run() {
        // Third task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);

        }
        System.out.println("\n # task Complete");
    }
}
