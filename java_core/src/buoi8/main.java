package buoi8;

import java.util.*;

public class main {
    public static void main(String[] args) {

    Iterable<Integer> integers;
    Collection collection;
    List<Integer> list;
    // khai báo 1 tập hợp 10 phần tử số nguyên
    Integer[] arrayInteger = new Integer[10];
    // khai báo 1 tập hợp 10 phần tử số nguyên sử dụng interface list
    // của collection
    List<Integer> integers1 = new ArrayList<Integer>();
    /*
    Sử dụng cc class implement để khởi tạo đối tượng collection
     */
        // Thêm mới 1 phần tử vào collection
    integers1.add(1);
    integers1.add(2);
    integers1.add(3);
    integers1.add(4);
    // kiểm tra khối lượng các phần tử hiện tại
    System.out.println(integers1.size());
    // cập nhật giá trị phần tử tại vị trí index =1, giá trị mới = 10
    integers1.set(1,10);
    // truy cập phần tử trong  collection có index = 1 trong collection
    Integer data = integers1.get(1);
    System.out.println("data: " + data);
    // Kiểm tra phần tử có tồn tại trong collection hay không?
    System.out.println(integers1.contains(1));
    // Duyệt danh sách các phần tử trong collection, tương tự như duyệt mảng
    for (Integer element: integers1){
        System.out.println(element);
    }

    System.out.println("Sử dụng interator để duyệt danh sách collection");
    Iterator<Integer> iterator = integers1.iterator();
    // iterator.hasNext(): Kiểm tra nếu vẫn còn phần tử phía sau
    while (iterator.hasNext()) {
        // lấy phần tử phía sau
        Integer dataI = iterator.next();
        System.out.println("lấy phần tử phía sau " + dataI);
    }
    //
    Set<Integer> set = new HashSet<>();
    SortedSet<Integer> sortedSet = new TreeSet<>();
    List <Integer> list1 = new ArrayList<>();
    Queue<Integer> queue = new LinkedList<>();
    Map<Integer, Integer> map = new HashMap<>();
    }
}



