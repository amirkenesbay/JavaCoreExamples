package vertex_examples.forEach;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class TestSet {
    public static void main(String[] args) {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println("Simple forEach: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nLambda forEach: ");
        numbers.forEach(number -> System.out.print(number + " "));
    }
}
