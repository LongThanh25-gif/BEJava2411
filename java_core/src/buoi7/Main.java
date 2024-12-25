package buoi7;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Integer> integers = new ArrayList<Integer>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        integers.add(4);
        // c1: Sử dụng biểu thức lambda
        integers = integers.stream().filter(data -> data % 2 == 0).collect(Collectors.toList());
        //C2 sử dụng anonymous class

        Predicate<Integer> predicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer integer) {
                return false;
            }
        };
        integers = integers.stream().filter(predicate).collect(Collectors.toList());
        // c1



    }
}

