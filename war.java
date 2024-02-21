import java.util.Scanner;

public class war {
    public static void main(String[] args) {

        Scanner guerra = new Scanner(System.in);
        String input = guerra.next();

        int contl = 0;
        int contr = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'w') {
                contl = contl + 4;
            } else if (input.charAt(i) == 'p') {
                contl = contl + 3;
            } else if (input.charAt(i) == 'b') {
                contl = contl + 2;
            } else if (input.charAt(i) == 's') {
                contl = contl + 1;
            } else if (input.charAt(i) == 'm') {
                contr = contr + 4;
            } else if (input.charAt(i) == 'q') {
                contr = contr + 3;
            } else if (input.charAt(i) == 'd') {
                contr = contr + 2;
            } else if (input.charAt(i) == 'z') {
                contr = contr + 1;
            }
        }

        if (contl > contr) {
            System.out.println("O lado esquerdo ganhou");
        } else if (contr > contl) {
            System.out.println("O lado direito ganhou");
        } else {
            System.out.println("Vamos batalhar de novo");
        }
    }
}