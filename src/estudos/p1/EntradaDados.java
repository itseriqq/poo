package estudos.p1;

import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int inteiro = lerInteiro(scanner, "Digite um numero inteiro: ");
        System.out.printf("Voce digitou o valor: %d\n", inteiro);

        double racional = lerRacional(scanner, "Digite um numero racional: ");
        System.out.printf("Voce digitou o numero: %.1f\n", racional);
    }

    public static int lerInteiro(Scanner scanner, String mensagem){
        System.out.print(mensagem);
        return scanner.nextInt();
    }

    public static double lerRacional(Scanner scanner, String mensagem){
        System.out.print(mensagem);
        return scanner.nextDouble();
    }
}