package estudos.p1.biblioteca;

public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private String codigo;
    private boolean disponibilidade;

    public Livro(String titulo, String autor, int ano, String codigo){
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.codigo = codigo;
        this.disponibilidade = true;
    }

    public void emprestar(){
        this.disponibilidade = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public String getCodigo() {
        return codigo;
    }

    public boolean isDisponivel() {
        return disponibilidade;
    }

    public void devolver(){
        this.disponibilidade = true;
    }

    public String toString(){
        return String.format("%s", this.titulo);
    }
}
