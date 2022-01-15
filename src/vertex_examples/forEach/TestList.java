package vertex_examples.forEach;

import java.util.Arrays;
import java.util.List;

public class TestList {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Simple forEach: ");
        for (Integer number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println("\nLambda forEach: ");
        numbers.forEach(number -> System.out.print(number + " "));

        numbers.forEach(System.out::println);

        System.out.println("\nSimple forEach: ");
        for (Integer number : numbers) {
            if (number > 2) {
                System.out.print(number + " ");
            }
        }

        System.out.println("\nLambda forEach: ");
        numbers.forEach(number -> {
            if (number > 2) {
                System.out.print(number + " ");
            }
        });
    }
}
