package annotation_example;

import java.lang.annotation.Annotation;

public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        Class xiaomiClass = Class.forName("annotation_example.Xiaomi");
        Annotation annotation1 = xiaomiClass.getAnnotation(SmartPhone.class);
        SmartPhone sm1 = (SmartPhone) annotation1;
        System.out.println("Annotation info from Xiaomi class: " + sm1.OS() + ", " + sm1.yearOfCompanyCreation());

        Class iphClass = Class.forName("annotation_example.IPhone");
        Annotation annotation2 = iphClass.getAnnotation(SmartPhone.class);
        SmartPhone sm2 = (SmartPhone) annotation2;
        System.out.println("Annotation info from iPhone class: " + sm2.OS() + ", " + sm2.yearOfCompanyCreation());
    }
}
