import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = lerNumeroInteiro(scanner, "Digite um número inteiro: ");
        System.out.printf("Você digitou o número %d\n", numero);

        double decimal = lerNumeroReal(scanner, "Digite um número real: ");
        System.out.printf("Você digitou o número %.2f\n", decimal);

        String texto = lerString(scanner, "Digite uma string: ");
        System.out.printf("Você digitou a string \"%s\"\n", texto);

        scanner.close();
    }

    private static int lerNumeroInteiro(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    private static double lerNumeroReal(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        double numero = scanner.nextDouble();
        scanner.nextLine(); // Consumir a quebra de linha
        return numero;
    }

    private static String lerString(Scanner scanner, String mensagem) {
        System.out.print(mensagem);
        return scanner.nextLine();
    }
}