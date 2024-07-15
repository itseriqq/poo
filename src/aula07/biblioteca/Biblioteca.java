package aula07.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo; // array dinamico

    Biblioteca() {
        acervo = new ArrayList<Livro>();
    }

    void adicionarLivro(Livro livro, String isbn) {
        for(Livro livro2 : acervo) {
            if(isbn.equals(livro2.isbn)) {
                throw new IllegalArgumentException("Livro ja cadastrado");
            }
        }
        acervo.add(livro);
    }

    boolean removerLivro(String isbn) {
        for (Livro livro : acervo) { //para cada livro do acervo
            if (isbn.equals(livro.isbn)) {
                acervo.remove(livro);
                return true;
            }

        }
        return false;
    }

    ArrayList<Livro> listaTodos() {
        return acervo;
    }

    ArrayList<Livro> listaEmprestados(){
        ArrayList<Livro> emprestados = new ArrayList<Livro>(); //inicializando um arraylist (array dinamico) para receber os livros emprestados
        for (Livro livro : acervo) { //para cada livro do acervo
            if (livro.estaEmprestado()) { //se o livro estiver emprestado
                emprestados.add(livro); //adiciona-o no array de livros que estao emprestados
            }
        }
        return emprestados;
    }

    ArrayList<Livro> listaDisponiveis(){
        ArrayList<Livro> disponiveis = new ArrayList<Livro>(); //inicializando um arraylist (array dinamico) para receber os livros disponiveis
        for (Livro livro : acervo) { //para cada livro do acervo
            if (!livro.estaEmprestado()) { //se o livro nao estiver emprestado
                disponiveis.add(livro); //adiciona-o no array de livros que estao disponiveis
            }
        }
        return disponiveis;
    }
}
