import java.util.Arrays;

public class MerginSortedIntArrays {
    public static int[] mergeArrays(int[] first, int[] second) {

        int[] arr3 = new int[first.length + second.length];

        for (int i = 0; i < first.length; i++) {
            arr3[i] = first[i];
        }

        for (int j = first.length, k = 0; j < arr3.length; j++, k++) {
            arr3[j] = second[k];
        }

        Arrays.sort(arr3);

        int tamanho_real = 0;
        for (int i = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1 || arr3[i] != arr3[i + 1]) {
                tamanho_real++;
            }
        }

        int[] result = new int[tamanho_real];

        for (int i = 0, j = 0; i < arr3.length; i++) {
            if (i == arr3.length - 1 || arr3[i] != arr3[i + 1]) {
                result[j] = arr3[i];
                j++;
            }
        }
        return result;
    }
}
