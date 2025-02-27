package buoi2;

/**
 - Biến:
     - là 1 vị trị trong vùng nhớm máy tính, được sử dụng để lưu trữ dữ liệu,
    mỗi vị trí này sẽ có tên, địa chỉ, kểu dữ liệu
     - Khi khai áo 1 iêến trong java tức là đang yêu cầu JVM cấp phát 1 vùng
    nhớ để lưu giá trị của iến đó
     - Biến có thể được thay đổi giá trị
 - Các loại biến:
    + Nguyên thủy:
        int, long, doule, float, ...

    + Biến tham chiếu: được tạo ra từ class đã được xây dựng sẵn
        từ thư viện hoặc được xây dựng trong quá trình phát triển

        Object, Integer, String, Array...

 - Các kiểu biến
    local: chỉ được sử dụng nội bộ hàm, khối lệnh, chỉ được khởi tạo khi hàm hoặc khối lệnh đó
            được thực thi, sau đó sẽ được giải phóng khi hàm thực thi xong
    instance: thường là thuộc tính của class, được khai báo ngay dưới tên class, có kèm phạm vi truy cập
            có thể truy cập dựa vào phạm vi truy cập, được khởi tạo ô nhớ khi sử dụng từ khóa new
            để khai báo object từ class, sẽ bị hủy khi object từ class bị hủy
    static: là 1 biến đặc biệt thuộc về class, chỉ được sử dụng thông qua tên class, có phụ thuộc
            vào phạm vi truy cập
            biến dùng chung cho tất cả các đối tượng sinh ra từ class
            được khởi tạo đầu tiên, và không cần khởi tạo đối tượng
 */
public class Main {

    // thuộc tính, biến toàn cục,
    private int tuoi;

    public String ten;

    protected float namSinh;

    public String diaChi;

    public static void main(String[] args) {
        // biến nguyên thủy
        int x = 10;
        int y = 15;
        int tong =  congHaiSo(x,y);
        System.out.println("Thanh cong: " + tong);
        // khai báo literal
        String text = "Hello";
        String text2 = "Hello";
        // Khai báo bằng từ khóa new
        String text3 = new String("hello");


    }

    public static int congHaiSo(int x, int y){
        int tong = x + y;
        return tong;
    }
}
