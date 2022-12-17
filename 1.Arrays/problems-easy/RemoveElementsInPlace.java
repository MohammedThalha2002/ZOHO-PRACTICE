// 27. Remove Element

// Do not allocate extra space for another array. 
// You must do this by modifying the input array in-place with O(1) extra memory.

// EXAMPLE
// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5, nums = [0,1,4,0,3,_,_,_]
// Explanation: Your function should return k = 5, with the first five elements of nums containing 0, 0, 1, 3, and 4.
// Note that the five elements can be returned in any order.
// It does not matter what you leave beyond the returned k (hence they are underscores).

public class RemoveElementsInPlace {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 2, 3, 0, 4, 2 };
        int val = 2;
        int index = removeElementsInPlace(arr, val);

        System.out.println("The length of the element free from the val " + val + " is " + index);
        System.out.println("The correct array is : ");
        for (int i = 0; i < index; i++) {
            System.out.print(arr[i] + " ");
        }

    }

    static int removeElementsInPlace(int[] arr, int val) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != val) {
                arr[j] = arr[i];
                j++;
            }
        }
        return j;
    }
}
