package exercicios.matrix;

public class Main {
    public static void main(String[] args) {
        double[][] cells = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        Matrix m = new Matrix(cells);
        System.out.print(m.toString());
    }
}
