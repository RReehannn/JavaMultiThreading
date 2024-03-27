package PracticeSet.Set1;

public class main {
    public static void main(String[] args) {
        TwoThread t1 = new TwoThread(1);
        TwoThread t2 = new TwoThread(2);

        t1.start();
        t2.start();

    }
}
