package practice;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = { 1, 2, 3, 0, 0, 0 };
        int[] nums2 = { 2, 5, 6 };
        int m = 3;
        int n = 3;
        merge(nums1, m, nums2, n);
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }
        // sorting
        for (int i = 1; i < nums1.length; i++) {
            int val = nums1[i];
            int index = i;

            while (index > 0 && nums1[index - 1] > val) {
                nums1[index] = nums1[index - 1];
                index--;
            }
            nums1[index] = val;
        }

        // Printing
        System.out.println("The merge Sorted array is : " + Arrays.toString(nums1));
    }
}
