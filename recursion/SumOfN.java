package recursion;

import java.util.Scanner;

// 2. Find the sum of positive numbers upto N

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("Enter a number : ");
        n = sc.nextInt();
        int output = sumOfN(n);
        System.out.println("The sum of the positive integers upto " + n + " is : " + output);
        sc.close();
    }

    static int sumOfN(int n){
        // BASE CASE
        if(n == 0){
            return 0;
        } else {
            // initial value with the next lower value
            return n + sumOfN(n-1);
        }
    }
}
