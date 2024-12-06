package Tuhoc.baiLab02;

import java.util.Scanner;

/*
    - Nếu a = 0, b = 0 => thông báo "phương trình có vô số nghiệm"
- Nếu a = 0, b # 0 => thông báo "phương trình vô nghiệm"
- Còn lại: x = -b/a => thông báo x = ?
 */
public class bai1 {
    public static void main(String[] args) {
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
        sc.close();
    }

}
