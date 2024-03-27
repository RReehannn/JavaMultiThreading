package PracticeSet.Set1;

public class TwoThread extends Thread{
    private final int threadNumber;

    public TwoThread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) Hello from Thread-%d\n", (i+1), threadNumber);

        }
    }
}

