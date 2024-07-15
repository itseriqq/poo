package aula07.biblioteca;

public class Livro {
    String titulo; 
    String autor;
    int anoPublicacao;
    String isbn;
    boolean emprestado; 
    
    Livro(String titulo, String autor, int anoPublicacao, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        emprestado = false;
    }

    void emprestar() {
        if(estaEmprestado()) {
            throw new IllegalStateException("Livro ja esta emprestado"); //evitar acentuacao nas strings do codigo
        }
        emprestado = true;
    }

    void devolver() {
        if(!estaEmprestado()) {
            throw new IllegalStateException("Livro nao esta emprestado");
        }
        emprestado = false;
    }

    boolean estaEmprestado(){
        return emprestado;
    }

    String converteParaString(){
        return String.format("Titulo: %s. %s. %d. %s", titulo, autor, anoPublicacao, isbn);
    }

}
