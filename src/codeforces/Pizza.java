package codeforces;

import java.util.Scanner;

public class Pizza {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
            System.out.println((n - 1) / 2);
        }
    }
}
