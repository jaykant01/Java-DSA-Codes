package wora_psvm.methodHiding;
// this is method hiding not overriding
//method over-riding is not possible in main method because it is static
public class Child extends Parent{
    public static void main(String[] args) {
        System.out.println("Child having main method");
    }
}
