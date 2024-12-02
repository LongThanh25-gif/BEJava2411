package buoi1.baitap;

import java.util.Scanner;

/**
 Debug:
    Kỹ năng theo dõi và quan sát chuơng trình
 chạy trên từng dng code, và kiểm soát dữ liệu
 trên từng dòng khi chương trình chạy qua
 */

public class Bai2 {

    public static void main(String[] args) {
        System.out.printf("Nhập vào hai số và tính: ");
        int a = new Scanner(System.in).nextInt();
        int b = new Scanner(System.in).nextInt();
        System.out.println("Tổng: " + (a + b));
        System.out.println("Tích " + (a*b));
        System.out.println("Thương " + (a/b));
        System.out.println("Chia lấy dư: " + (a % b));
    }

}
