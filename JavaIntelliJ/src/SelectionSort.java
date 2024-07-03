import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = {6, 4, 8, 3, 1, 9, 7};
        for (int i = 0; i < a.length; i += 1) {
            int min = i;
            for (int j = i + 1; j < a.length; j += 1) {
                if (a[min] > a[j]) {
                    min = j;
                }
            }
            int temp = a[i];
            a[i] = a[min];
            a[min] = temp;
            System.out.println(Arrays.toString(a));
        }
    }
}
