package exercicios.matrix;

public class Main {
    public static void main(String[] args) {
        double[][] cells = {
            {1, 2, 3},
            {4, 5, 6}
        };
        
        Matrix m = new Matrix(cells);
        System.out.print(m.toString());

        double[][] array = m.toArray();

        // laco para rodar a matriz array 'array'
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Pegando as linhas e colunas da matriz: ");

        System.out.println("linhas: " + m.getRows());
        System.out.println("colunas: " + m.getColumns());

        System.out.println("Verificando valores em diferentes posicoes da matriz:");

        try {
            System.out.println("Valor da posicao (0, 1): " + m.getAt(0, 1));
            System.out.println("Valor da posicao (1, 2): " + m.getAt(1, 2));
            // Posicao invalida:
            System.out.println("Valor da posicao (2, 0): " + m.getAt(2, 0));
        } catch (IllegalArgumentException e) {
            System.err.println(e.getMessage());
        }

        Matrix a = new Matrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0}
        });
        Matrix b = new Matrix(new double[][] {
            {5.0, 6.0},
            {7.0, 8.0}
        });
        Matrix c = a.plus(b);

        System.out.println("Soma das matrizes a e b:");
      
        System.out.print(c.toString());

        Matrix d = a.minus(b);

        System.out.println("Subtracao das matrizes a e b:");

        System.out.print(d.toString());

        System.out.println("Multiplicacao das matrizes a e b com o times que recebe Matrix:");

        // utilizando as definicoes das matrizes a e b dadas no enunciado
        // alocando-as em aM e bM para nao conflitar as variaveis

        Matrix aM = new Matrix(new double[][] {
            {1.0, 2.0, 3.0},
            {3.0, 4.0, 5.0}
          });
          Matrix bM = new Matrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0},
            {5.0, 6.0}
          });

        Matrix e = aM.times(bM);

        System.out.print(e.toString());

        // utilizando as definicoes das matrizes a e b dadas no enunciado
        // alocando-as em aE e bE, de escalar, para nao conflitar as variaveis

        Matrix aE = new Matrix(new double[][] {
            {1.0, 2.0},
            {3.0, 4.0}
          });
          double bE = 5.0;
          Matrix f = aE.times(bE);

          System.out.println("Multiplicacao das matrizes a e b com o times que recebe Double:");
          
          System.out.print(f.toString());

          System.out.println("Transposta da matriz:");

          Matrix aT = new Matrix(new double[][] {
            {1.0, 2.0, 3.0},
            {3.0, 4.0, 5.0}
          });
          Matrix bT = aT.getTranspose();
          
          System.out.print(bT.toString());

        // Utilizando aS (aSquare) e bS para verificar se a matriz eh quadrada

        System.out.println("Verificando se sao matrizes quadradas:");

          Matrix aSquare = new Matrix(new double[][] {
            {1.0, 2.0, 3.0},
            {3.0, 4.0, 5.0}
          });
          Matrix bSquare = new Matrix(new double[][] {
            {5.0, 6.0},
            {7.0, 8.0}
          });
          
          System.out.println(aSquare.isSquare());
          System.out.println(bSquare.isSquare());

        // Verificando se as matrizes aSymmetric e bSymmetric (dadas no enunciado) sao simetricas

        System.out.println("Verificando se sao matrizes assimetricas:");

          Matrix aSymmetric = new Matrix(new double[][] {
            {1, 7, 3},
            {7, 4, 5},
            {3, 5, 0}
          });
          Matrix bSymmetric = new Matrix(new double[][] {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
          });
          
          System.out.println(aSymmetric.isSymmetric());
          System.out.println(bSymmetric.isSymmetric());
    }
    
}
