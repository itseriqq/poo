package exercicios.matrix;


public class Matrix {
    private double[][] cells;

    public Matrix(double[][] c) {
        cells = new double[c.length][];
        for (int i = 0; i < c.length; i++) {
            cells[i] = new double[c[i].length];
            for (int j = 0; j < c[i].length; j++) {
                cells[i][j] = c[i][j];
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < cells.length; i++) {
            for (int j = 0; j < cells[i].length; j++) {
                sb.append(String.format("%10.6f", cells[i][j]));
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}