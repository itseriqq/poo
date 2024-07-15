package aula02;
import java.util.Arrays;

public class ComparacaoRef {
    public static void main(String[] args) {
        int[] a = {1,2,3};
        int[] b = {1,2,3};
        int[] c = a;

        System.out.println(a);
        System.out.println(b); 
        System.out.println(c);

        System.out.println(a == b); // o == compara referencias de memoria, nao valores, entao seria false
        System.out.println(a == c); // esse daria true ja que as referencias de memorias sao iguais

        // para comparar dois arrays, tem que criar uma funcao que compara os valores de cada posicao e compara divergencia de tamanho

        System.out.println(Arrays.equals(a, b)); // esse daria true, pq compara os valores de cada posicao
        System.out.println(Arrays.equals(a, c)); // esse tambem daria true, pq compara os valores de cada posicao e sao iguais

    }
}

// [I@7ad041f3, onde o colchete inicial significa q eh um array, o I maiusculo significa que eh
// de inteiros, e o 7ad041f3 eh o endereco de memoria do array
// [I@7ad041f3
// [I@251a69d7