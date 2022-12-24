

public class MaximumSubArray {
    public static void main(String[] args) {
        int arr[] = { -2, 1, -2, 4, -1, 2, 1, -5, 4 };
        maximumSumOfSubarray(arr);
        maximumProductOfSubarray(arr);
    }

    static void maximumSumOfSubarray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            // find the max from the current and current + previous val and 
            // assign them back to the index
            // this makes the base of the kadane's algo
            arr[i] = Math.max(arr[i], arr[i] + arr[i - 1]);
            // Again compare the curr val with the max val
            max = Math.max(max, arr[i]);
        }
        System.out.println("The maximum sum of the subarray is : " + max);
    }

    static void maximumProductOfSubarray(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            
        }
        System.out.println("The maximum sum of the subarray is : " + max);
    }
}
