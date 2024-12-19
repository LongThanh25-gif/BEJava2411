package buoi10.bt;

public class SumUsingThreads extends Thread {
        // Thread 1: Tính tổng từ 1 đến 5
        Thread thread1 = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
                sum1[0] += i;
            }
            System.out.println("Tổng từ 1 đến 5: " + sum1[0]);
        });

        // Thread 2: Tính tổng từ 6 đến 10
        Thread thread2 = new Thread(() -> {
            for (int i = 6; i <= 10; i++) {
                sum2[0] += i;
            }
            System.out.println("Tổng từ 6 đến 10: " + sum2[0]);
        });

}

