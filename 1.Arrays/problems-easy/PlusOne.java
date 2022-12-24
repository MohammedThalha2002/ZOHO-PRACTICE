// 66. Plus One
// You are given a large integer represented as an integer array digits,
//  where each digits[i] is the ith digit of the integer. The digits are ordered
//  from most significant to least significant in left-to-right order.
//  The large integer does not contain any leading 0's.
// Increment the large integer by one and return the resulting array of digits.

// Example 1:

// Input: digits = [1,2,3]
// Output: [1,2,4]
// Explanation: The array represents the integer 123.
// Incrementing by one gives 123 + 1 = 124.
// Thus, the result should be [1,2,4].
// Example 2:

// Input: digits = [4,3,2,1]
// Output: [4,3,2,2]
// Explanation: The array represents the integer 4321.
// Incrementing by one gives 4321 + 1 = 4322.
// Thus, the result should be [4,3,2,2].
// Example 3:

// Input: digits = [9]
// Output: [1,0]
// Explanation: The array represents the integer 9.
// Incrementing by one gives 9 + 1 = 10.
// Thus, the result should be [1,0].

import java.util.Arrays;


public class PlusOne {
    public static void main(String[] args) {
        // Condition 1
        int[] arr1 = { 1, 2, 3 };
        // Condition 2
        int[] arr2 = { 4, 3, 2, 9 };
        // Condition 3
        int[] arr3 = { 9, 9, 9 };

        System.out.println("The new output of arr1 is : " + Arrays.toString(plusOne(arr1)));
        System.out.println("The new output of arr1 is : " + Arrays.toString(plusOne(arr2)));
        System.out.println("The new output of arr1 is : " + Arrays.toString(plusOne(arr3)));
    }

    static int[] plusOne(int arr[]) {
        int len = arr.length;

        for (int i = len - 1; i >= 0; i--) {
            // For condition 1 and also 2
            if (arr[i] < 9) {
                arr[i]++;
                return arr;
            } else {
                // Used for condition 2
                // when the last digit 9 then 9 + 1 = 10 hence the zeroth position is made zero
                arr[i] = 0;
            }
        }
        // For all 999 case - condition 3
        int[] newArr = new int[len + 1];
        newArr[0] = 1;
        return newArr;
    }
}
