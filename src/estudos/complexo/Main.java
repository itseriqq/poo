package estudos.complexo;

public class Main {
    public static void main(String[] args) {
        Complexo c1 = new Complexo(1,2);

        System.out.println("c1 = " + c1.converteParaString());

        Complexo c2 = new Complexo(3,4);

        System.out.println("c2 = " + c2.converteParaString());
        
        Complexo subtracao = c1.subtrai(c2);

        System.out.println("subtracao = " + subtracao.converteParaString());

        Complexo multiplicacao = c1.multiplica(c2);

        System.out.println("multiplicacao = " + multiplicacao.converteParaString());

        Complexo divisao = c1.divide(c2);

        System.out.println("divisao = " + divisao.converteParaString());
    }
}
