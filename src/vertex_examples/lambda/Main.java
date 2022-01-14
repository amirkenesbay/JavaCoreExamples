package vertex_examples.lambda;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("John", 28),
                new User("Jane", 35),
                new User("Alex", 21)
        );
        System.out.println("Before sort:");
        for (User user : users) {
            System.out.println(user);
        }
//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.getAge() - o2.getAge();
//            }
//        });

//        Lambda sort by age example 1
//        Collections.sort(users, (o1, o2) -> o1.getAge() - o2.getAge());

//        Lambda sort by age example 2
//        users.sort((o1, o2) -> o1.getAge() - o2.getAge());


//        Reversed sort by age
//        Comparator<User> comparator = (o1, o2) -> o1.getAge() - o2.getAge();
//        users.sort(comparator.reversed());

//        Lambda sort by name example 2
//        users.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));

//        Reversed sort by name
//        Comparator<User> c = (o1, o2) -> o1.getName().compareTo(o2.getName());
//        users.sort(c.reversed());

//        Sort by name or age without lambda
//        Collections.sort(users, new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                if (o1.getAge() == o2.getAge()) {
//                    return o1.getName().compareTo(o2.getName());
//                } else
//                    return o1.getAge() - o2.getAge();
//            }
//        });

//        Sort by name or age with lambda
//        users.sort((o1, o2) -> {
//            if(o1.getAge() == o2.getAge())
//                return o1.getName().compareTo(o2.getName());
//            else return o1.getAge() - o2.getAge();
//        });

        System.out.println("\nAfter sort");
        for (User user : users) {
            System.out.println(user);
        }
    }
}
