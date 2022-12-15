import java.util.Arrays;

public class MinAndMax {
    public static void main(String[] args) {
        int[] arr = { 2, 4, 1, 6, 8, 3, 9, 0, 23, 45, 12 };

        // find max and min of an array

        // 1) sorting
        sortArray(arr);
        System.out.println("Sorted Array : " + Arrays.toString(arr));

        // Find max and min of the array
        System.out.println("The minimum of the array is : " + arr[0]);
        System.out.println("The maximum of the array is : " + arr[arr.length - 1]);
    }

    static void sortArray(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int index = i;

            while (index > 0 && arr[index - 1] > val) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = val;
        }
    }
}
