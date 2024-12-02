package Tuhoc.baitap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Nhập vào cạnh hình lập phương: ");
        Scanner sc = new Scanner(System.in);
        int canh = sc.nextInt();
        double theTich = Math.pow(canh, 3);
        System.out.println("Thể tích = " + theTich);
        sc.close();
    }
}
