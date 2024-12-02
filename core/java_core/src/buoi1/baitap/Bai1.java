package buoi1.baitap;

import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        // Tạo ra 1 đối tượng scanner bằng từ khóa new
        Scanner scanner = new Scanner(System.in);
        // dùng đối tượng scanner cho tất cả các lân nhập vào
        System.out.println("Nhập vào thông tin cá nhân");
        String hoTen = scanner.nextLine();
        System.out.println("Nhập vào tên ngày sinh: ");
        int ngaySinh = scanner.nextInt();
        System.out.println("Nhập vào tháng sinh: ");
        int thangSinh = scanner.nextInt();
        System.out.println("Nhập vào năm sinh: ");
        int namSinh = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập quê quán: ");
        String que = scanner.nextLine();
        System.out.println("Trường: ");
        String truong = scanner.nextLine();
        System.out.println("Xin chào " + hoTen + "đến từ " + que +
                ", sinh ngày " + ngaySinh + "/" +thangSinh + "/" + namSinh + ", học tại\n" + "trường " + truong);


    }
}
