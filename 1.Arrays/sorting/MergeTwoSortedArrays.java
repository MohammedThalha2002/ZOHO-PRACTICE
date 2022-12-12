import java.util.Arrays;

// Merge two individual sorted arrays 

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int[] a1 = { 1, 4, 7, 9 };
        int[] a2 = { 2, 6, 8, 10 };

        // System.out.println("Before sorting : A1 = " + Arrays.toString(a1)
        // + " A2 = " + Arrays.toString(a2));

        // First Method
        firstMethod(a1, a2);
        // Since the above method requires extra space in the memeory we go for another
        // algorithm
        // Comapring each element of the arr 1 with the 1st element of the second array
        // Then swaping and sorting again the arr 2

        secondMethod(a1, a2);
        // https://www.youtube.com/watch?v=hVl2b3bLzBw&t=197s
    }

    static void firstMethod(int[] a1, int[] a2) {
        int[] arr = new int[a1.length + a2.length];

        // One method for adding 2 arrays to a new arrays
        // for (int i = 0; i < newUnsortedArray.length; i++) {
        // if (i < a1.length)
        // newUnsortedArray[i] = a1[i];
        // else
        // newUnsortedArray[i] = a2[i - a1.length];
        // }

        // Another method
        // srcPos - starting index of a1, destPos - starting index of newUnsortedArray
        System.arraycopy(a1, 0, arr, 0, a1.length);
        System.arraycopy(a2, 0, arr, a1.length, a2.length);

        System.out.println("Added to arrays : " + Arrays.toString(arr));

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

        System.out.println("Sorted Array : " + Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (i < a1.length)
                a1[i] = arr[i];
            else
                a2[i - a1.length] = arr[i];
        }

        System.out.println("After sorting and seperating : ");
        System.out.println("Array 1 : " + Arrays.toString(a1));
        System.out.println("Array 2 : " + Arrays.toString(a2));

    }

    static void secondMethod(int[] a1, int[] a2) {
        // linear traversal of the arr 1
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] > a2[0]) {
                // swaping
                int temp = a1[i];
                a1[i] = a2[0];
                a2[0] = temp;
                // sorting second array alone
                sortSecondArray(a2);
            }
        }
        System.out.println("Efficient method ");
        System.out.println("Array 1 : " + Arrays.toString(a1));
        System.out.println("Array 2 : " + Arrays.toString(a2));

    }

    static void sortSecondArray(int[] a2) {
        for (int j = 1; j < a2.length; j++) {
            int val = a2[j];
            int index = j;

            while (index > 0 && a2[index - 1] > val) {
                a2[index] = a2[index - 1];
                index--;
            }
            a2[index] = val;
        }
    }
}
