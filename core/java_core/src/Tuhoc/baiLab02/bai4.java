package Tuhoc.baiLab02;

import java.util.Scanner;

public class bai4 {

    public static void bai1() {
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 1 <<");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào biến a = ");
        int a = sc.nextInt();
        System.out.print("Nhập vào biến b = ");
        int b = sc.nextInt() ;
        System.out.printf("Giải phương trình bậc nhất %dx + %d = 0 \n ", a, b);

        if( a == 0 & b == 0){
            System.out.println("Phương trình vô số nghiệm");
        }else if(a == 0 & b != 0){
            System.out.println(" phương trình vô nghiệm");
        }else {
            float x =(float) -b/a;
            System.out.printf(" phương trình có nghiệm = %.3f ", x);
        }
    }
    public static void  bai2(){
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 2 <<");
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào biến a = ");
        int a = sc.nextInt();
        System.out.print("Nhập vào biến b = ");
        int b = sc.nextInt();
        System.out.print("Nhập vào biến c = ");
        int c = sc.nextInt();

        System.out.printf("Giải phương trình bậc hai  %dx^2 + %dx + %d = 0 \n", a, b, c);

        /*
    - Nếu a = 0 => làm tương tự ví dụ bài 1
    - Nếu a # 0:
    - Tính delta = b^2 - 4ac.
    - Nếu delta < 0 => thông báo "phương trình vô nghiệm"
    - Nếu delta = 0 => thông báo "nghiệm kép x = -b/(2*a)
    - Nếu delta > 0 => thông báo có 2 nghiệm riêng biệt
    x1 = (-b + căn(delta))/(2*a)
    x2 = (-b - căn(delta))/(2*a)
        */
        if (a == 0) {
            // Viết logic giải phương tri ̀nh bậc nhất
        } else {
            int delta = b * b - 4 * a * c;
            if (delta < 0) {
                System.out.println("Phương trình vô nghiệm ");
            } else if (delta == 0) {
                float x = (float) -b / (2 * a);
                System.out.printf("Phương trình nghiệm kép x = %.3f ", x);

            } else if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.printf("Phương trình có 2 nghiệm riêng biệt, x1 = %.3f, x2 = %.3f ", x1, x2);
            }
        }
    }
    public static void  bai3(){
        System.out.println(">> LỰA CHỌN TÍNH NĂNG 3 <<");
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
        System.out.println("++ ----------------------------------------- ++");
        System.out.println("| 1. Giải phương trình bậc nhất |");
        System.out.println("| 2. Giải phương trình bậc hai |");
        System.out.println("| 3. Tính số tiền điện |");
        System.out.println("| 4. Kết thúc |");
        System.out.println("++ ------------------ ++");
        System.out.print("Lựa chọn của bạn là: ");
        int tinhNang = sc.nextInt();
        switch (tinhNang) {
            case 1:
                // giải phương trình bậc nhất
                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            default:
                System.out.println("Bạn đã thoát chương trình");
                System.exit(0);

        }
    }

}
