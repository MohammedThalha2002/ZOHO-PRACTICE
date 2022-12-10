package recursion;
import java.util.Scanner;

// Using Recursion
// 4. Do binary search on the given sorted array

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter the element need to search : ");
        int val = sc.nextInt();

        int index = binarySearch(arr, val, 0, arr.length-1);

        if(index == -1)
            System.out.println("The element is not found");
        else 
            System.out.println("The element is found at the index " + index);
        sc.close();

    }

    static int binarySearch(int[] arr, int val, int low, int high) {
        // No element found
        if (low > high)
            return -1;

        int mid = (high + low) / 2;

        // VALUE FOUND
        if (val == arr[mid])
            return mid;
        // Traverse left
        else if (val < arr[mid])
            return binarySearch(arr, val, low, mid - 1);
        // Traverse right
        else
            return binarySearch(arr, val, mid + 1, high);
    }
}

