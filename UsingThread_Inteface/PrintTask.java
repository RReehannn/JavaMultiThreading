package UsingThread_Inteface;
//Print task for Three task
//Runnable is interface
public class PrintTask implements Runnable{
    @Override
    public void run() {
        // Print task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ", i, targetChar);

        }
        System.out.printf("\n %s %c task Complete",
                Thread.currentThread().getName(),
                targetChar);
    }
    public final char targetChar;

    public PrintTask(char targetChar) {
        this.targetChar = targetChar;
    }
}