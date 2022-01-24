package vertex_examples.streams.groupingBy;

import java.util.*;

public class Test1 {
    public static void main(String[] args) {
        List<Human> humans = Arrays.asList(
                new Human("Ned", "Stark", 1),
                new Human("Robb", "Stark", 2),
                new Human("Arya", "Stark", 1),
                new Human("Aegon", "Targaryen", 6),
                new Human("Daenerys", "Targaryen", 4),
                new Human("Jaime", "Lannister", 1),
                new Human("Tyrion", "Lannister", 3));
        Map<String, List<Human>> map = new HashMap<>();
        for (Human human : humans) {
            String surname = human.getSurname();
            if (!map.containsKey(surname)) {
                List<Human> humanList = new ArrayList<>();
                humanList.add(human);
                map.put(surname, humanList);
            } else {
                List<Human> humanList = map.get(surname);
                humanList.add(human);
            }
        }
        System.out.println(map);
    }
}
