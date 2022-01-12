package annotation_example;

public abstract class Parent {
    String name;

    public Parent(String name) {
        this.name = name;
    }

    void showInfo(){
        System.out.println("It's Parent class. Name = " + name);
    }

    abstract void showInfo(String name);
}
