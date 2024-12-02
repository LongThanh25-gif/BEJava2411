package buoi1;
// Câu lệnh tạo class trong java
// quy tắc tên class

import java.util.Scanner;

/**
 - Chữ cái đầu tiên của mỗi chữ đều viết hoa
 - Không được bắt đầu bằng số
 - Tên có ý nghĩa
 */
public class HelloWorld {

    /*
    Hàm main dùng để chạy chương trình Java
    - 1 chương trình java có thể viết nhiều hàm main, nhưng lúc nào cũng chỉ có 1 hàm main
     duy nhất được chạy
     */
    public static void main(String[] args) {
        // câu lệnh in ra text trên màn hình console
        System.out.println("Hello World");
        System.out.println("Nhập vào tên giảng viên: ");
        // Thu thập dữ liệu nhập vào từ màn hình console
        String name = new Scanner(System.in).nextLine();
        System.out.println("Tên của giảng viên là:  " + name);
    }
}
