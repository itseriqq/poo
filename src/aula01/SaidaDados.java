import java.util.Locale;

public class SaidaDados {
    public static void main(String[] args) {
        String nome = "Maria";
        String sobrenome = "Silva";
        int idade = 18;
        double aplic = 123.453;

        System.out.printf("Olá %s!%n", nome);
        System.out.printf("Olá %s %s!%n", nome, sobrenome);
        System.out.printf("Olá %s %s. Você tem %d anos.%n", nome,
            sobrenome, idade);
        System.out.printf("Você tem R$ %.2f aplicados na conta.%n",
            aplic);
        System.out.printf(Locale.US, "You have $ %.2f in your savings account.%n", aplic);
    }
}