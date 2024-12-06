package Tuhoc.baiLab02;

import java.util.Scanner;

public class bai3 {
    public static void main(String[] args) {
        // Nếu số điện <= 100 => số tiền = số điện x 1000
        // Nếu số điện > 100
        // => Số tiền = 100 * 1000 + (số điện - 100) * 1500
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Chương trình tính tiền điện");
        System.out.print("Nhập vào số điện: ");
        int soDien = scanner.nextInt();
        if(soDien <= 100){
            int soTien = soDien * 1000;
            System.out.println("Số tiền điện = " + soTien);
        }else{
            int soTien = 100 * 1000 + (soDien - 100) * 1500;
            System.out.println("Số tiền điện = " + soTien);
        }
    }
}
