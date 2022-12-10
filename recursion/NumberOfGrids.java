package recursion;

import java.util.Scanner;

public class NumberOfGrids {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m,n, res;

        System.out.println("Enter the grid size m x n");
        System.out.print("Rows : ");
        n = sc.nextInt();
        System.out.print("Columns : ");
        m = sc.nextInt();

        if(n == 0 && m == 0){
            System.out.println("The row and column should not be zero");
        } else {
            res = grid(n, m);
            System.out.println("The total number of grids possible are : " + res);
        }

        sc.close();
    }

    static int grid(int n, int m){
        // BASE CASE
        if(n == 1 || m == 1)
            return 1;
        else 
            return grid(n-1, m) + grid(n, m-1);
    }
}
