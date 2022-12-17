// 35. Search Insert Position

// Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
// You must write an algorithm with O(log n) runtime complexity.

// Example 1:

// Input: nums = [1,3,5,6], target = 5
// Output: 2
// Example 2:

// Input: nums = [1,3,5,6], target = 2
// Output: 1

public class SearchInsertPosition {
    public static void main(String[] args) {
        int arr[] = { 1, 3, 5, 6, 8 };
        int target = 100;
        searchInsertPosition(arr, target);
    }

    static int searchInsertPosition(int[] arr, int target) {
        // Binary search
        int search = binarySearch(arr, target, 0, arr.length - 1);
        System.out.println(search);
        return search;
    }

    static int binarySearch(int arr[], int val, int low, int high) {
        if (low > high)
            return low;

        int mid = (low + high) / 2;
        // Val found
        if (arr[mid] == val)
            return mid;

        if (val < arr[mid]) // left traversal
            return binarySearch(arr, val, low, mid - 1);
        else // Right traversal
            return binarySearch(arr, val, mid + 1, high);
    }
}