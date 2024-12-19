package buoi7.demo4;

public class Main {
    public static void main(String[] args) {
        // c1: Tạo đối tượng thông qua class implements interface
        Calculator calcutlator = new CalculatorImpl();
        System.out.println(calcutlator.add(1, 2));
        // c2: Tạo đối tượng thông qua class vô danh (Anonymous class)
        Calculator calcutlator1 = new Calculator(){

            @Override
            public int add(int a, int b) {
                return a + b;
            }
        };
        System.out.println(calcutlator1.add(1, 2));
        // c3: Sử dụng lambda expression
        /**
         Cú pháp: (param..) -> body
         param: có thể có 1 hoặc nhiều hoặc không có param
         body: có thể là 1 khối lệnh hoặc là 1 câu lệnh
         */
         Calculator calcutlator2 = (a,b) -> a + b;
        System.out.println(calcutlator2.add(1, 2));
    }
}
