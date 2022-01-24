package vertex_examples.streams.groupingBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Test2 {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned", "Stark", 1),
                new Human("Robb", "Stark", 2),
                new Human("Arya", "Stark", 1),
                new Human("Aegon", "Targaryen", 6),
                new Human("Daenerys", "Targaryen", 4),
                new Human("Jaime", "Lannister", 1),
                new Human("Tyrion", "Lannister", 3));

//        Map<String, List<Human>> map = humans.stream()
//                .collect(Collectors.groupingBy(Human::getSurname));
//        System.out.println(map);

//        Map<String, Long> map = humans.stream()
//                .collect(Collectors.groupingBy(Human::getSurname, Collectors.counting()));
//        System.out.println(map);

//        Map<String, Integer> map = humans.stream()
//                .collect(Collectors.groupingBy(Human::getSurname, Collectors.summingInt(Human::getFriendsAmount)));
//        System.out.println(map);

        Map<String, Set<String>> map = humans.stream()
                .collect(Collectors.groupingBy(Human::getSurname, Collectors.mapping(Human::getName, Collectors.toSet())));
        System.out.println(map);
    }
}
