import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a2 = { 1, 5, 2, 8, 4, 5, 1, 66, 33 };
        int len2 = a2.length;
        int flag, l;

        for (int k = 1; k < len2; k++) {
            flag = a2[k];
            l = k - 1;
            while (l >= 0 && a2[l] > flag) {
                a2[l + 1] = a2[l];
                l--;
            }
            a2[l + 1] = flag;
        }

        System.out.println("Array : " + Arrays.toString(a2));
    }
}
