package stream;

import java.util.ArrayList;
import java.util.List;

public class Test4 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(8);
        list.add(2);
        list.add(4);
        list.add(3);

        int result = list.stream().reduce((accumulator, element) -> accumulator * element).get();
        System.out.println(result);
        // 5 8 2 4 3
        // accumulator = 5  40  80  320 960
        // element =     8  2   4   3

        List<Integer> list100 = new ArrayList<>();
        int result100 = list.stream().reduce((accumulator, element) -> accumulator * element).get();

        int result2 = list.stream().reduce(1, (accumulator, element) -> accumulator*element);
        System.out.println("Without get " + result2);

        List<String> list3 = new ArrayList<>();
        list3.add("priv");
        list3.add("kak dela?");
        list3.add("ok");
        list3.add("poka");

        String result3 = list3.stream().reduce((a, e) -> a + " " + e).get();
        System.out.println(result3);
    }
}

