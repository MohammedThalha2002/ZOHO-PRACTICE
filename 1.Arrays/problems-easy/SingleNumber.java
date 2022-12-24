// 136. Single Number
// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.
// 

// Example 1:
// Input: nums = [2,2,1]
// Output: 1

// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4

public class SingleNumber {
    public static void main(String[] args) {
        int arr[] = { 4, 1, 2, 1, 2, 4, 6 };
        singleNumber(arr);
    }

    static void singleNumber(int[] arr) {
        // Since this given array has two repetitive number and we have to find the
        // single repeating number
        // XOR the whole array will give the single number
        // Becoz XOR of two same number is zero
        int val = arr[0];
        for (int i = 1; i < arr.length; i++) {
            val = val ^ arr[i];
        }
        if (val != 0)
            System.out.println("The single number is : " + val);
        else
            System.out.println("No Repeating Number is present");
    }
}
