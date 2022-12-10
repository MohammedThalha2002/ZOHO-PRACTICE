package recursion;

import java.util.Scanner;

// 1. Find the factorial of a given number

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        // 
        int n = sc.nextInt();
        int res = fact(n);
        System.out.println("The factorial of " + n + "is " + res);
        // 
        sc.close();
    }

    static int fact(int n) {
        if (n == 1)
            return 1;
        else
            return n * fact(n - 1);
    }
}
