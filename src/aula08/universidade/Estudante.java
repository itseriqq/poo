package aula08.universidade;

import java.util.ArrayList;



/** 
 *  Modelo de Estudante de graduação da UFABC.
*/
public class Estudante {
    private String nome;
    private String ra;
    private ArrayList<Double> notas;

    /**
     * Construtor de um novo Estudante.
     * 
     * @param nome O nome completo do esstudante
     * @param ra O ra no formato da UFABC (11 dígitos)
     * @param notas As notas obtidas de [0, 10] em cada disciplina
     */

    public Estudante(String nome, String ra, ArrayList<Double> notas) {
        validaRa(ra);
        this.nome = nome;
        this.ra = ra;
        this.notas = notas;
    }
    /**
     * Valida o RA do estudante, para averiguar se está no formato da UFABC.
     * 
     * @param ra
     */
    private void validaRa(String ra) {
        if (ra.matches("\\d(11)")){
            throw new IllegalArgumentException("RA fora do formato da UFABC");
        }
    }

    /**
     * Consulta o nome completo do estudante.
     * 
     * @return O nome completo
     */
    public String getNome() {
        return nome;
    }

    /**
     * Atualiza o nome do estudante.
     * 
     * @param nome
     */

    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Consulta o RA do estudante.
     * 
     * @return O RA atual
     */

    public String getRa() {
        return ra;
    }

    /**
     * Atualiza o RA do estudante.
     * 
     * @param ra O novo RA atualizado
     * @throws IllegalArgumentException Se o RA não estiver no formato da UFABC
     */

    public void setRa(String ra) {
        validaRa(ra);
        this.ra = ra;
    }

    /**
     * Consulta as notas do estudante.
     * 
     * @return As notas do estudante
     */

    public ArrayList<Double> getNotas() {
        return notas;
    }

    /**
     * Atualiza as notas do estudante.
     * 
     * @param notas As novas notas do estudante
     */
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
    /**
     * Soma as notas do estudante.
     * @return A soma das notas
     */

    private double somaNotas(){
        double soma = 0.0;
        for (var nota : notas){
            soma += nota;
        }
        return soma;
    }

    /**
     * Calcula a média das notas do estudante.
     * @return A media das notas atualizada
     */
    public double getMedia(){
        if(notas.isEmpty()){
            return 0.0;
        }

        return somaNotas() / notas.size();   
    }
}
