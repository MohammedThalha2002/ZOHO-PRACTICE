import java.util.HashMap;

// 1. Find first repeating character in a String

// Going to solve using HASHMAP in java
// HASHMAP Basics --> https://www.youtube.com/watch?v=H62Jfv1DJlU

public class RepeatingCharacter {
    public static void main(String[] args) {
        HashMap<Character, Integer> charMap = new HashMap<>();
        String str = "abccde";
        int val = 1;

        // Add all the characters in the hashMap
        for (int i = 0; i < str.length(); i++) {
            charMap.put(str.charAt(i), val + (charMap.get(str.charAt(i)) == null ? 0 : 1));
        }
        System.out.println(charMap);
        // Output of the above codes
        // {a=1, b=1, c=2, d=1, e=1}

        for (int i = 0; i < str.length(); i++) {
            if (charMap.get(str.charAt(i)) > 1)
                System.out.println("The repeating character is : " + str.charAt(i));
        }
    }

}

// Time complexity ---> O(N + N) == O(n)