import java.util.Arrays;
import java.util.HashMap;

public class FrequencyOfElemets {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 4, 2, 1, 1, 4, 4, 4, 6, 3 };

        System.out.println("Before sorting : " + Arrays.toString(arr));

        // Mapping in hashmap
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            hashMap.put(arr[i], (hashMap.get(arr[i]) == null ? 1 : (hashMap.get(arr[i]) + 1)));
        }

        // Print the frequency of the elements
        System.out.println(hashMap);

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
