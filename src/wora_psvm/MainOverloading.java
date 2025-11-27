package wora_psvm;
// Method Overloading of main method having same name but different parameters
// Without String signature it will not run
public class MainOverloading {
    public static void main(String...args) {
        System.out.println("String[]");
    }

    public static void main(int[] args) {
        System.out.println("int[]");
    }

    public static void main(boolean[] args) {
        System.out.println("boolean[]");
    }
}
