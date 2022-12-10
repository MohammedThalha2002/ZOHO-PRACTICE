import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        System.out.print("Enter the element need to search : ");
        int val = sc.nextInt();

        int index = binarySearch(arr, val, 0, arr.length - 1);

        if (index == 0)
            System.out.println("The element is not found");
        else
            System.out.println("The element is found at the position " + (index + 1));
        sc.close();

    }

    static int binarySearch(int[] arr, int val, int low, int high) {
        // No element found
        int mid;
        while (low <= high) {
            mid = (high + low) / 2;

            if (val == arr[mid])
                return mid;
            else if (val < arr[mid])
                high = mid - 1;
            else
                low = mid + 1;
        }
        return 0;
    }
}
