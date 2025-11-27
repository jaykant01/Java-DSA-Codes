package sigma.recursion;

public class SumofDigits {
    public static void main(String[] args) {
        int ans = digit(13425);
        System.out.println(ans);
    }

    static int digit(int n){
        if(n == 0){
            return 0;
        }

        return digit(n/10) + n%10;
    }
}
