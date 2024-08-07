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

    public double[][] toArray() {
        double[][] copy = new double[cells.length][];
        for (int i = 0; i < cells.length; i++) {
            copy[i] = new double[cells[i].length];
            for (int j = 0; j < cells[i].length; j++) {
                copy[i][j] = cells[i][j];
            }
        }
        return copy;
    }

    public int getRows() {
        return cells.length;
    }

    public int getColumns() {
        return cells.length > 0 ? cells[0].length : 0;
    }

    public double getAt(int row, int col) {
        if (row < 0 || row >= getRows() || col < 0 || col >= getColumns()) {
            throw new IllegalArgumentException("Parametros de linha ou coluna invalidos.");
        }
        return cells[row][col];
    }

    public Matrix plus(Matrix somada) {
        if (this.getRows() != somada.getRows() || this.getColumns() != somada.getColumns()) {
            throw new IllegalArgumentException("Dimensoes das matrizes nao podem ser diferentes.");
        }

        double[][] resultado = new double[this.getRows()][this.getColumns()];

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultado[i][j] = this.cells[i][j] + somada.cells[i][j];
            }
        }

        return new Matrix(resultado);
    }

    public Matrix minus(Matrix other) {
        if (this.getRows() != other.getRows() || this.getColumns() != other.getColumns()) {
            throw new IllegalArgumentException("Dimensoes das matrizes nao coincidem para realizar a subtracao.");
        }

        double[][] resultado = new double[this.getRows()][this.getColumns()];

        for (int i = 0; i < this.getRows(); i++) {
            for (int j = 0; j < this.getColumns(); j++) {
                resultado[i][j] = this.cells[i][j] - other.cells[i][j];
            }
        }

        return new Matrix(resultado);
    }

    public Matrix times(Matrix multiplicada) {
        if (this.getColumns() != multiplicada.getRows()) {
            throw new IllegalArgumentException("Dimensoes das matrizes nao coincidem para realizar a multiplicacao.");
        }
    
        int rows = this.getRows();
        int cols = multiplicada.getColumns();
        int dimensaoComum = this.getColumns();
        double[][] resultado = new double[rows][cols];
    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                for (int k = 0; k < dimensaoComum; k++) {
                    resultado[i][j] += this.cells[i][k] * multiplicada.cells[k][j];
                }
            }
        }
    
        return new Matrix(resultado);
    }

    public Matrix times(double escalar) {
        int rows = this.getRows();
        int cols = this.getColumns();
        double[][] resultado = new double[rows][cols];
    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                resultado[i][j] = this.cells[i][j] * escalar;
            }
        }
    
        return new Matrix(resultado);
    }

    public Matrix getTranspose() {
        int rows = this.getRows();
        int cols = this.getColumns();
        double[][] transposta = new double[cols][rows];
    
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transposta[j][i] = this.cells[i][j];
            }
        }
    
        return new Matrix(transposta);
    }

    public boolean isSquare() {
        return this.getRows() == this.getColumns();
    }

    public boolean isSymmetric() {
        if (!this.isSquare()) {
            return false;
        }
        
        int rows = this.getRows();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows; j++) {
                if (this.cells[i][j] != this.cells[j][i]) {
                    return false; 
                }
            }
        }
        return true; 
    }
}