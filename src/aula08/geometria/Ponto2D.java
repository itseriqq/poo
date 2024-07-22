package aula08.geometria;

public class Ponto2D {
    private final double x;
    private final double y;

    public Ponto2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    public Ponto2D mover(double dx, double dy) {
        return new Ponto2D(x + dx, y + dy);
    }

    /**
     * Calcula a distancia do ponto atual em relacao ao ponto passado como parametro
     * 
     * @param ponto O ponto passado como parametro
     * @return Retorna a distancia entre os dois pontos
     */

    // Conseguimos acessar os atributos x e y do pontoParametro, pois eles são públicos
    // E também conseguimos usar o x e o y que sao privados porque é uma exceção de encapsulamento.
    // O encapsulamento é uma regra, mas existem exceções. 
    // Já que a classe Ponto2D é uma classe igual para o ponto 'atual' e para o ponto recebido, 
    // É possivel que o usuário possa acessar os atributos x e y do ponto atual que sao privados diretamente.
 
    public double distancia(Ponto2D pontoParametro) {
        double dx = x - pontoParametro.x;
        double dy = y - pontoParametro.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
