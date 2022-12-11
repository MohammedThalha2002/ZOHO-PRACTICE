import java.util.Arrays;

class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 7, 4, 5 };

        System.out.print("Array values : ");
        System.out.print(Arrays.toString(arr) + "\n");


        boolean isPresent = linearSearch(arr, 5);
        if (isPresent) {
            System.out.println("The element is found");
        } else {
            System.out.println("The element is not found");
        }
    }

    static boolean linearSearch(int[] arr, int val) {
        boolean isFound = false;
        for (int i = 0; i < arr.length; i++) {
            if (val == arr[i]) {
                isFound = true;
            }
        }
        return isFound;
    }
}

// since the for loop runs for n times the time complexity is O(n)