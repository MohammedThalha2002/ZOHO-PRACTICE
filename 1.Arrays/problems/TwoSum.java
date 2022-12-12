import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = { 2, 6, 5, 8, 11 };
        int target = 14;

        // brute force approach
        bruteForceApproach(arr, target);

        // efficient approach
        efficientApproach(arr, target);

    }

    // Time complexity --> O(n2)
    static void bruteForceApproach(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] + arr[j] == target && i != j) {
                    System.out.println("Brute force technique");
                    System.out.println("The two sum elements are : " + arr[i] + " " + arr[j]);
                }
            }
        }
    }

    static void efficientApproach(int arr[], int target) {
        // using hashMap --> (value, index)
        HashMap<Integer, Integer> hashMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if(hashMap.containsKey(diff)){
                // return the index of both the elements
                System.out.println("Hashmap technique");
                System.out.println("The two elements are : " + arr[i] + ", " + diff);

            } else {
                hashMap.put(arr[i], i);
            }
        }
    }

}
