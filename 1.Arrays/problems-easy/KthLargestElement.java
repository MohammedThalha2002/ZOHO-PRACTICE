// 215. Kth Largest Element in an Array
// Given an integer array nums and an integer k, return the kth largest element in the array.

// Note that it is the kth largest element in the sorted order, not the kth distinct element.

// You must solve it in O(n) time complexity.

// Example 1:

// Input: nums = [3,2,1,5,6,4], k = 2
// Output: 5
// Example 2:

// Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
// Output: 4

public class KthLargestElement {
    public static void main(String[] args) {
        int arr[] = { 3, 2, 1, 5, 6, 4 };
        int k = 4;
        kthLargestElement(arr, k);
    }

    static void kthLargestElement(int arr[], int k) {
        for (int i = 0; i < arr.length - 1; i++) {
            int pivot = arr[arr.length - 1];
            if (arr[i] < pivot) {
                
            }
        }
    }
}
