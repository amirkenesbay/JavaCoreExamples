package vertex_examples.streams.collect;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        List<Integer> evenNumbers = new ArrayList<>(numbers.size());
//        for (Integer i : numbers) {
//            if (i % 2 == 0) {
//                evenNumbers.add(i);
//            }
//        }
//        System.out.println(evenNumbers);

//        List<String> names = Arrays.asList("John", "Arya", "Sansa");
//        Set<String> upperCaseNames = new HashSet<>();
//        for (String name : names) {
//            upperCaseNames.add(name.toUpperCase());
//        }
//        System.out.println(upperCaseNames);

        List<String> names = Arrays.asList("Jaime", "Daenerys", "", "Tyrion", "");
        Queue<String> queue = new LinkedList<>();
        for (String name : names) {
            if(!name.isEmpty()){
                queue.add(name);
            }
        }
        System.out.println(queue);
    }
}
