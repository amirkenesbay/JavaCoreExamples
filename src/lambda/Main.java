package lambda;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student st1 = new Student("Amir", 'm', 22, 3, 8.3);
        Student st2 = new Student("Alizhan", 'm', 18, 1, 7.2);
        Student st3 = new Student("Alima", 'f', 20, 2, 5.1);
        Student st4 = new Student("Kairat", 'm', 23, 4, 9.5);
        Student st5 = new Student("Rose", 'f', 25, 5, 8.7);

        List<Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        StudentInfo info = new StudentInfo();
//        info.testStudents(students, new CheckOverGrade());
//        System.out.println("-----------------");
//        info.testStudents(students, new StudentChecks() {
//            @Override
//            public boolean check(Student s) {
//                return s.getAge() < 30;
//            }
//        });

        info.testStudents(students, (Student s) -> {return s.getAvgGrade() > 8;});
        System.out.println("-----------------");
        info.testStudents(students, (Student s) -> {return s.getAge() < 30;});
        System.out.println("-----------------");
        info.testStudents(students, (Student s) -> {return s.getAge() > 20 && s.getAvgGrade() < 9.3 && s.getSex() == 'f';});
    }
}
