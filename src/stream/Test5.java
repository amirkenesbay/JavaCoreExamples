package stream;

import lambda.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test5 {
    public static void main(String[] args) {
        int[] arr = {3, 8, 1, 5, 9, 12, 4, 21, 81, 7, 18};
        arr = Arrays.stream(arr).sorted().toArray();

        lambda.Student st1 = new lambda.Student("Amir", 'm', 22, 3, 8.3);
        lambda.Student st2 = new lambda.Student("Alizhan", 'm', 18, 1, 7.2);
        lambda.Student st3 = new lambda.Student("Alima", 'f', 20, 2, 5.1);
        lambda.Student st4 = new lambda.Student("Kairat", 'm', 23, 4, 9.5);
        lambda.Student st5 = new lambda.Student("Rose", 'f', 25, 5, 8.7);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

//        students = students.stream().sorted((x,y)->x.getName().compareTo(y.getName())).collect(Collectors.toList());
        students = students.stream().sorted(Comparator.comparing(Student::getName)).collect(Collectors.toList());
        System.out.println(students);
    }
}
