package buoi10.bt;

public class Main {
    public static void main(String[] args) {
    // Khởi tạo các biến tổng
    final int[] sum1 = {0};
    final int[] sum2 = {0};

}
    // Bắt đầu chạy các thread
        thread1.start();
        thread2.start();

        try {
        // Chờ thread1 hoàn thành
        thread1.join();
        // Chờ thread2 hoàn thành
        thread2.join();
    } catch (InterruptedException e) {
        System.out.println("Thread bị gián đoạn.");
    }

    // Tính tổng cuối cùng
    int totalSum = sum1[0] + sum2[0];
        System.out.println("Tổng từ 1 đến 10: " + totalSum);
}
}
