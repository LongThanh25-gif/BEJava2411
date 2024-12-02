package buoi1.baitap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào hai cạnh: ");
        System.out.println("Nhập chiều rộng ");
        int chieuRong = new Scanner(System.in).nextInt();
        System.out.println("Nhập chiều dài ");
        int chieuDai = new Scanner(System.in).nextInt();
        System.out.println("Diện tích: " + (chieuDai * chieuRong));
    }
}
