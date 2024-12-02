package buoi1.baitap;

import java.util.Scanner;

public class Bai1_2 {
    public static void main(String[] args) {


        System.out.println("Nhập vào thông tin cá nhân");
        // Mỗi 1 dòng nhập vào sẽ đều khởi tạo 1 đối tượng scanner
        // bằng new Scanner
        String hoTen = new Scanner(System.in).nextLine();
        System.out.println("Nhập vào tên ngày sinh: ");
        int ngaySinh = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào tháng sinh: ");
        int thangSinh = new Scanner(System.in).nextInt();
        System.out.println("Nhập vào năm sinh: ");
        int namSinh = new Scanner(System.in).nextInt();
        System.out.println("Nhập quê quán: ");
        String que = new Scanner(System.in).nextLine();
        System.out.println("Trường: ");
        String truong = new Scanner(System.in).nextLine();
        System.out.println("Xin chào " + hoTen + "đến từ " + que +
                ", sinh ngày " + ngaySinh + "/" +thangSinh + "/" + namSinh + ", học tại\n" + "trường " + truong);


    }
}
