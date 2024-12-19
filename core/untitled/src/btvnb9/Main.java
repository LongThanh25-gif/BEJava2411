package btvnb9;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        QuanLySinhVien quanlysinhvien = new QuanLySinhVien();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nLựa chọn của bạn:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Hiển thị sinh viên");
            System.out.println("4. Tìm kiếm sinh viên theo tên");
            System.out.println("5. Sắp xếp danh sách sinh viên theo điểm thi");
            System.out.println("6. Kiểm tra sinh viên có tồn tại không");
            System.out.println("7. Thoát");

            int choice = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Nhập ID: ");
                        String id = scanner.nextLine();
                        System.out.print("Nhập Tên: ");
                        String name = scanner.nextLine();
                        System.out.print("Nhập Điểm: ");
                        double score = scanner.nextDouble();
                        quanlysinhvien.themSinhvien(id, name, score);
                        break;
                    case 2:
                        System.out.print("Nhập ID sinh viên muốn xóa: ");
                        String xoaId = scanner.nextLine();
                        quanlysinhvien.xoaSinhvien(xoaId);
                        break;
                    case 3:
                        quanlysinhvien.hienthiSinhvien();
                        break;
                    case 4:
                        System.out.print("Nhập tên sinh viên cần tìm: ");
                        String searchName = scanner.nextLine();
                        quanlysinhvien.timkiemSinhvien(searchName);
                        break;
                    case 5:
                        System.out.println("Thoát");
                        scanner.close();
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại");
                }
            } catch (Exception e) {
                System.out.println("Lỗi: " + e.getMessage());
            }
        }
    }
}