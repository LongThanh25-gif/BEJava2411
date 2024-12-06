package buoi6;

/**
 Khi các class kế thừa từ class Animal:
 + có tất cả cc thuộc tính và method mà
 class Animal có
 + có thể truy cập được các thuộc tính và
 method với phạm vi truy cập (public, protected,
 default với điều kiện cùng nằm trong vùng package)
 - Trong Java tất c các class khi được tạo ra từ thư viiện hoặc từ
 dev. Đều mặc định kế thưừa class Object của java
 - This:
 đại diện cho đối tượng hiện tại, để có thể
 sử dụng thao tác với(gọi tới) các thuộc tính,
 method khi con trỏ nằm trong class

 - Super:
 là 1 biến tham chiếu được sử dụng trong class
 con(subclass) để có thể gọi tới các thuộc tính,
 để có thể thao tá(gọi tới) các thuộc tính, method
 của lớp cha(super class) gần nhất với lớp con

 - Ghi đè phương thức:
    khi tại lớp con(subclass) có phương thức giống y hệt lớp cha(super class)
    giống(kiểu dẽ liệu trả về, tên hàm, tham số truyền vào)
    => lớp con đang thực hiện ghi đè lại phương thức của lớp cha
 // instanceof: kiểm tra xem object có phải là kiểu cu class được chỉ định không
    (có được tạo ra từ class đ không)


 */

public class Main {
    public static void main(String[] args) {
        // sử dụng class cha khởi tạo đối tượng con
        Voi voi = new Voi();
        voi.diChuyen();

        Ho ho = new Ho();
        ho.diChuyen();
        // Sử dụng class cha, khởi tạo đối tượng con
        Animal2 animal = new Voi();
//        animal.hutNuoc();
        animal.diChuyen();
        Animal2 ho2 = new Ho();
        // instanceof: kiểm tra xem object có phải là kiểu của class được chỉ định không(có được tạo ra từ class đ không)
        if (ho2 instanceof Ho){
            ((Ho) ho2).sanMoi();
        }
        ho2.diChuyen();


    }
}
