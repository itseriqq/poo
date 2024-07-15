package aula02;

public class Selecao {
    public static void main(String[] args){
        int a = 10;
        int b = 20;

        if(a == b) {
            System.out.println("a == b");
        } else if(a > b) {
            System.out.println("a > b");
        } else {
            System.out.println("a < b");  
        }

        int dia = 4;
        String diaSemana;

        switch (dia) {
            case 1:
                diaSemana = "Domingo";
                break;
            case 2:
                diaSemana = "Segunda";
                break;
            case 3:
                diaSemana = "Terça";
                break;
            case 4:
                diaSemana = "Quarta";
                break;
            case 5:
                diaSemana = "Quinta";
                break;
            case 6:
                diaSemana = "Sexta";
                break;
            case 7:
                diaSemana = "Sábado";
                break;
            default:
                diaSemana = "Dia inválido";
                break;
        }
        System.out.println(diaSemana);
    }
}