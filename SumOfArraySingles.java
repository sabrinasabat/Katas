import java.util.Arrays;

public class SumOfArraySingles {
    public static void main(String[] args) {
        int[] arr1 = { 4, 5, 7, 5, 4, 8 };
        Arrays.sort(arr1);
        int tot = 0;
        int i;
        for (i = 0; i < arr1.length - 1; i++) {
            if (arr1[i] != arr1[i + 1]) {
                tot = tot + arr1[i];
            }
        }
        if (i == arr1.length - 1 || arr1[i] != arr1[i - 1]) {
            tot = tot + arr1[i];
        }
        System.out.println(tot);
    }
}
