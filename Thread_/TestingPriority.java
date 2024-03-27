package Thread_;

import UsingThread_Inteface.PrintTask;

// 1 has Low PRIORITY.
// 10 has Max PRIORITY.
// 5 has Default PRIORITY.

public class TestingPriority {
    public static void main(String[] args) {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        // Here We have to Create thread class for method like start()

        java.lang.Thread t1 = new java.lang.Thread(p1);
        t1.setPriority(java.lang.Thread.MAX_PRIORITY);
        t1.start();
        java.lang.Thread t2 = new java.lang.Thread(p2);
        t2.setPriority(java.lang.Thread.MIN_PRIORITY);
        t2.start();
        java.lang.Thread t3 = new java.lang.Thread(p3);
        t3.setPriority(5);
        t3.start();





    }
}
