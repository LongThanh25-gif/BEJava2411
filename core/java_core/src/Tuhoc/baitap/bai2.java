package Tuhoc.baitap;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        System.out.println("Nhập vào chiều rộng hình chữ nhật: ");
        Scanner sc = new Scanner(System.in);
        int chieuRong = sc.nextInt();

        System.out.println("Nhập vào dài hình chữ nhật: ");
        int chieuDai = sc.nextInt();

        int chuVi = (chieuDai + chieuRong) * 2;
        int dienTich = (chieuDai * chieuRong);
        int canhNhonhat = Math.min(chieuDai, chieuRong);
        System.out.println("Chu vi = " + chuVi);
        System.out.println("Diện tích = " + dienTich);
        System.out.println("canhNhonhat = " + canhNhonhat);
        sc.close();

    }
}
