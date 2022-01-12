package annotation_example;

public class Child extends Parent {
    public Child(String name) {
        super(name);
    }

    @Override
    void showInfo(String name) {
        System.out.println("It's Child class. Name = " + name);
    }
}
