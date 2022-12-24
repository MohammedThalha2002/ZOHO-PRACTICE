// 204. Count Primes
// Given an integer n, return the number of prime numbers that are strictly less than n.

// Example 1:

// Input: n = 10
// Output: 4
// Explanation: There are 4 prime numbers less than 10, they are 2, 3, 5, 7.
// Example 2:

// Input: n = 0
// Output: 0
// Example 3:

// Input: n = 1
// Output: 0

public class CountPrimes {
    public static void main(String[] args) {
        // SOlving the probelm using
        // Sieve of eratosthenes algorithm
        int n = 10;
        int val = countPrimes(n);
        System.out.println("The total number of prime number is : " + val);
    }

    static int countPrimes(int n) {
        if (n == 0 || n == 1)
            return 0;
        else {
            // initial val of all the val in the arr is false
            boolean[] sieve = new boolean[n];
            // The loop should run max for sqrt of n
            // coz more the condition only start at i*i
            for (int i = 2; i < Math.sqrt(n); i++) {
                if (sieve[i] == false) {
                    // The first index that need to be changed to TRUE is i*i
                    for (int j = i * i; j < n; j += i) {
                        // make it false
                        sieve[j] = true;
                    }
                }
            }
            int count = 0;
            for (int i = 2; i < sieve.length; i++) {
                if (sieve[i] == false)
                    count++;
            }
            return count;
        }
    }
}
