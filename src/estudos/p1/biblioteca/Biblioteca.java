package estudos.p1.biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> acervo;

    public Biblioteca() {
        this.acervo = new ArrayList<Livro>();
    }

    public void cadastrarLivro(Livro livro) {

        for (Livro l : this.acervo) {
            if (l.getCodigo().equals(livro.getCodigo())) {
                throw new IllegalArgumentException("Livro com mesmo codigo ja existe");
            }
        }

        this.acervo.add(livro);
    }

    public ArrayList<Livro> getEmprestados() {
        ArrayList<Livro> emprestados = new ArrayList<Livro>();
        for (Livro livro : this.acervo) {
            if (!livro.isDisponivel()) {
                emprestados.add(livro);
            }
        }

        return emprestados;
    }

    public ArrayList<Livro> getDisponiveis() {
        ArrayList<Livro> disponiveis = new ArrayList<Livro>();

        for (Livro livro : this.acervo) {
            if (livro.isDisponivel()) {
                disponiveis.add(livro);
            }
        }

        return disponiveis;
    }

    public void getAcervo() {

        System.out.println("Os livros atualmente na biblioteca sao:\n");

        for (Livro l : this.acervo) {
            System.out.println(l.toString());
        }

        System.out.println();

        System.out.println("Fim dos livros da biblioteca.");
    }
}
