package UsingThread_Class;

public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long StartTime = System.currentTimeMillis();

        // First task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ", i);

        }
        System.out.println("\n * task Complete");

        // Second task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ", i);

        }
        System.out.println("\n $ task Complete");

        // Third task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ", i);

        }
        System.out.println("\n # task Complete");
        long EndTime = System.currentTimeMillis();

        System.out.printf("Total time taken: %d", (EndTime - StartTime));
    }
}
