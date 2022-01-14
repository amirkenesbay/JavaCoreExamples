package vertex_examples.forEach;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer, Integer> numbers = new HashMap<>();
        numbers.put(1, 100);
        numbers.put(2, 200);
        numbers.put(3, 300);

        System.out.println("Simple forEach: ");
        for (Map.Entry<Integer, Integer> entry : numbers.entrySet()) {
            System.out.println("Key: " + entry.getKey() + " Value: " + entry.getValue());
        }

        System.out.println("\nLambda forEach: ");
        numbers.forEach((k, v) -> System.out.println("Key: " + k + " Value " + v));
    }
}
