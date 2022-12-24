// 217. Contains Duplicate

// Given an integer array nums, return true if any value appears at least twice in the array,
//  and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false
// Example 3:

// Input: nums = [1,1,1,3,3,4,3,2,4,2]
// Output: true
import java.util.HashMap;

public class ContainDuplicates {
    public static void main(String[] args) {
        int[] arr = { 0, 4, 5, 0, 3, 6 };
        containDuplicates(arr);
    }

    static void containDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.get(nums[i]) == null ? 1 : (map.get(nums[i]) + 1));
        }
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) > 1)
                flag = true;
        }
        if (flag)
            System.out.println("Contains duplicates");
        else
            System.out.println("No Duplicates");
    }
}
