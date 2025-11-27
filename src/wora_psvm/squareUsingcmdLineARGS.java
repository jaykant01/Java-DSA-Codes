package wora_psvm;
//program to print square using command line args
public class squareUsingcmdLineARGS {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println("Square of " + n + " is " + (n * n));
    }
}
