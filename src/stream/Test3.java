package stream;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        int[] array = {5, 9, 3, 8, 1};
        Arrays.stream(array).forEach(System.out::println);
        Arrays.stream(array).forEach(Utils::myMethod);
        Arrays.stream(array).forEach(element -> Utils.myMethod(element));
    }
}
