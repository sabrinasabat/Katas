public class NPrimo {
    public static void main(String[] args) {

        int[] arr = { 1, 2, 3, 4 };
        int nprimo = 0;

        for (int i = 0; i < arr.length; i++) {
            boolean isPrimo = true;

            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isPrimo = false;
                    break;
                }
            }

            if (isPrimo) {
                nprimo += arr[i];
            }
        }

        System.out.println("uno\rdos\t\ttres");

        System.out.println("La suma de los indices primos son: " + nprimo);
    }
}
