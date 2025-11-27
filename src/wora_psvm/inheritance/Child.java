package wora_psvm.inheritance;

public class Child extends Parent {
    public int age;
    public String name;

    public Child(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Child{" +
                "age=" + age +
                ", name=" + name +
                '}';
    }
}
