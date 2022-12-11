import java.util.Arrays;

// Merge two individual sorted arrays 

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1 = { 1, 4, 7, 9 };
        int[] a2 = { 2, 6, 8, 10 };

        System.out.println("Before sorting : A1 = " + Arrays.toString(a1)
                + " A2 = " + Arrays.toString(a2));

        int[] newUnsortedArray = new int[a1.length + a2.length];

        // One method for adding 2 arrays to a new arrays
        // for (int i = 0; i < newUnsortedArray.length; i++) {
        // if (i < a1.length)
        // newUnsortedArray[i] = a1[i];
        // else
        // newUnsortedArray[i] = a2[i - a1.length];
        // }

        // Another method
        // srcPos - starting index of a1, destPos - starting index of newUnsortedArray
        System.arraycopy(a1, 0, newUnsortedArray, 0, a1.length);
        System.arraycopy(a2, 0, newUnsortedArray, a1.length, a2.length);

        System.out.println("Added to arrays : " + Arrays.toString(newUnsortedArray));

        System.out.println("Sorted Array : " + Arrays.toString(sortArray(newUnsortedArray)));

    }

    static int[] sortArray(int[] arr) {
        // Insertion sort
        for (int i = 1; i < arr.length; i++) {
            int val = arr[i];
            int index = i;
            // checking both the conditions whether the index is greate than 0 and also
            // And also the previous value is grater than the value
            while (index > 0 && arr[index - 1] > val) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = val;
        }

        return arr;
    }
}
