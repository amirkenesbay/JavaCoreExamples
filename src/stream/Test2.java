package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Test2 {
    public static void main(String[] args) {
        Student st1 = new Student("Amir", 'm', 22, 8.3);
        Student st2 = new Student("Alizhan", 'm', 18, 7.2);
        Student st3 = new Student("Alima", 'f', 20, 5.1);
        Student st4 = new Student("Kairat", 'm', 23, 9.5);
        Student st5 = new Student("Rose", 'f', 25, 8.7);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students = students.stream().filter(element
//                        -> element.getAge() > 20 && element.getAvgGrade() > 8.2)
//                .collect(Collectors.toList());
//        System.out.println(students);


        Stream<Student> myStream = Stream.of(st1, st2, st3, st4, st5);
        List<Student> studentsStream = myStream.filter(element
                -> element.getAge() > 20 && element.getAvgGrade()>8.2)
                .collect(Collectors.toList());
        System.out.println(studentsStream);


    }
}
