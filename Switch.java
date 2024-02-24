import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num1, num2;

        System.out.print("Ingressa o número 1: ");
        num1 = Integer.parseInt(input.nextLine());

        System.out.print("Ingresse o número 2: ");
        num2 = Integer.parseInt(input.nextLine());

        System.out.println("Elige la opción: ");
        System.out.println("[+] para ADIÇÃO\n[-] para SUBTRAÇÃO\n[x] para MULTIPLICAÇÃO\n[/] para DIVISÃO");
        char operadores = input.nextLine().charAt(0);

        switch (operadores) {
            case '+':
                System.out.println("Resultado: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Resultado: " + (num1 - num2));
                ;
                break;
            case 'x':
                System.out.println("Result: " + (num1 * num2));
                break;
            case '/':
                if (num2 != 0) {
                    System.out.println("Result: " + (num1 / num2));
                } else {
                    System.out.println("Não pode dividir por zero");
                }
                break;
            default: // operador colocado por default, ou seja, se nenhuma das opçoes acontecerem,
                     // esse acontece
                System.out.println("Operador INVÁLIDO!");
        }
    }
}