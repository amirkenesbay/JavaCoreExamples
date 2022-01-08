package lambda;

import java.util.ArrayList;
import java.util.List;

public class StudentInfo {
    void testStudents(List<Student> al, StudentChecks sc){
        for (Student s : al) {
            if(sc.check(s)){
                System.out.println(s);
            }
        }
    }

//    void printStudentsOverGrade(List<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.getAvgGrade() > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(List<Student> al, int age) {
//        for (Student s : al) {
//            if (s.getAge() < age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(List<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.getAge() > age && s.getAvgGrade() < grade && s.getSex() == sex) {
//                System.out.println(s);
//            }
//        }
//    }
}


