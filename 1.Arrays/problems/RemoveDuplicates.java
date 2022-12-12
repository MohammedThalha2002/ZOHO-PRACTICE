import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 3, 2, 4, 5, 6, 6, 6, 6, 6, 8, 8, 9 };

        // sorting
        sortArray(arr);
        System.out.println("Sorted array : " + Arrays.toString(arr));
        //
        // Initializing two variables for pointing the index
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[j] != arr[i]) {
                j++;
                arr[j] = arr[i];
            }
        }

        // Printing the removed duplicate array
        System.out.println("Removed duplicates array : ");
        for (int i = 0; i < j + 1; i++) {
            System.out.print(arr[i] + ", ");
        }

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
