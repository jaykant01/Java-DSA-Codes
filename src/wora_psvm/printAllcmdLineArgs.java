package wora_psvm;
// Write a program to print all command line arguments in java
public class printAllcmdLineArgs {
    public static void main(String[] args) {
        if(args.length > 0){
            for(String value : args){
                System.out.println(value);
            }
        }else{
            System.out.println("No Arguments is passed");
        }
    }
}
