package practice;
public class Merge {
    public static void MergeArray(int[] a1, int[] a2, int len1, int len2) {
        int i = 0;
        int j = 0;
        int temp = 0, flag = 0, l = 0;
        while (i < len1 && j < len2) {
            if (a1[i] < a2[j])
                i++;

            else {
                temp = a1[i];
                a1[i] = a2[j];
                a2[j] = temp;
                {
                    for (int k = 1; k < len2; k++) {
                        flag = a2[k];
                        l = k - 1;
                        while (l >= 0 && a2[l] > flag) {
                            a2[l + 1] = a2[l];
                            l--;
                        }
                        a2[l + 1] = flag;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        int len1, len2, i;
        int a1[] = { 5, 9, 10, 15, 20 };
        int a2[] = { 2, 3, 8, 13 };

        len1 = a1.length;
        len2 = a2.length;
        MergeArray(a1, a2, len1, len2);
        for (i = 0; i < len1; i++)
            System.out.print(a1[i] + ", ");
        for (i = 0; i < len2; i++)
            System.out.print(a2[i] + ", ");
    }
}