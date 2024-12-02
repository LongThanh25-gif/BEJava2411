package Tuhoc.baitap;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập tên sinh viên: ");
        String name = sc.nextLine();
        System.out.println("Nhập dểm: ");
        int score = sc.nextInt();
        System.out.println(name + " có điểm = " + score);
        sc.close();
    }
}
