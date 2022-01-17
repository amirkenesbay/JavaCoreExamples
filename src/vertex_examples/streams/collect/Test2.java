package vertex_examples.streams.collect;

import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumbers = numbers.stream()
//                .filter(i -> i % 2 == 0)
//                .collect(Collectors.toList());
//        System.out.println(evenNumbers);

//        List<String> names = Arrays.asList("John", "Arya", "Sansa", "Sansa", "Arya");
//        Set<String> upperCaseNames = names.stream()
//                .map(String::toUpperCase)
//                .collect(Collectors.toSet());
//        System.out.println(upperCaseNames);

//        List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
//        Queue<String> queue = names.stream()
//                .filter(n -> !n.isEmpty())
//                .collect(Collectors.toCollection(() -> new LinkedList<>()));
//        System.out.println(queue);

        List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue = names.stream()
                .filter(n -> !n.isEmpty())
                .collect(Collectors.toCollection(LinkedList::new));
        System.out.println(queue);
    }
}
