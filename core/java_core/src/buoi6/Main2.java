package buoi6;

/**
 - Đa hình:
    cùng 1 hành động, nhưng được thể hiện bằng các hình thái khác nhau
    vd:
        cùng là hành động tạo ra tiếng kêu nhưng khi object là
        lion sẽ kêu: Lion is roaring
        khi là: Elephant sẽ kêu Elephant is trumpeting.
        khi là: Monkey sẽ kêu Monkey is chattering
    => đó chính là tính đa hình trong java

 - Các thời điểm đa hình:
    + compile time: là thời điểm chương trình biên dịch từ
        file. java -> file .class, tức là thời điểm compile
        chương trình
        để đạt được tính đa hình tại thời điểm này chúng ta sử
        dụng overload method

    + runtime: là thời điểm máy ảo jvm chạy các file byte code,
        hay nói cách khác là chương trình java đang chạy từng
        dòng lệnh 1.
        để đạt được tính đa hình tại thời điểm này chúng ta sử
        dụng overriding method

 overload method:
    - xảy ra khi hai chiều method cùng chung xuất hiện
    trong cùng 1 class với các đặc tính sau
        + trùng tên(bắt buộc)
        + trùng tham số truyền vào nhưng khác kiểu dữ liệu
        trả về
        + khác kiểu dữ liệu trả về nhưng cùng kiểu dữ liệu tham
        số truyền vào
        + cùng kiểu dữ liệu trả về cùng số lượng tham số truyền vào
        nhưng trong danh sách tham số truyền vào có các kiểu dữ liệu
        khác nhau
 overriding method:
    - xảy ra tại hai class có mối quan hệ kế thừa
    - khi class con tồn tại 1 method giống y hệt class cha
        + giống tên, kiểu dữ liệu trả về. tham số truyền vào
    => method tại class chính là override method

 */

public class Main2 {
}
