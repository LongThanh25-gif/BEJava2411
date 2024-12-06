package buoi6.baitap.bai1;

/*
abstract: đánh dấu là class hoặc method trìu tượng
    - class abstract:
        + có các thuộc tính, khối lệnh như class thông thường
        + có các method trìu tượng: là các method chỉ có phần
            khai báo tên hàm, kiểu dữ liệu trả về, tham số
            và không có phần thân hàm
            vd:public abstract void eat();
            phần thân hàm sẽ được class subclass triển khai lại
            theo các cách riêng, phù hợp với đặc tính
        + luôn là class cha(super class) để cho các class con kế thừa
        + không thể sử dụng constructor để khởi tạo đối tượng, bắt buộc
        phải sử dụng constructor của
 */

public abstract class Animal {

    public String name;
    public int age;

    public abstract void eat();

}
