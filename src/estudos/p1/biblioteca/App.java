package estudos.p1.biblioteca;

public class App {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        Livro livro1 = new Livro("O Senhor dos Anéis", "J. R. R. Tolkien", 1954, "123");
        Livro livro2 = new Livro("O Hobbit", "J. R. R. Tolkien", 1937, "456");
        Livro livro3 = new Livro("Dom Quixote", "Miguel de Cervantes", 1605, "789");
        Livro livro4 = new Livro("Guerra e Paz", "Lev Tolstói", 1869, "325");
        Livro livro5 = new Livro("Cem Anos de Solidão", "Gabriel García Márquez", 1967, "961");

        biblioteca.cadastrarLivro(livro1);
        biblioteca.cadastrarLivro(livro2);
        biblioteca.cadastrarLivro(livro3);
        biblioteca.cadastrarLivro(livro4);
        biblioteca.cadastrarLivro(livro5);

        biblioteca.getAcervo();
        System.out.println();

        livro1.emprestar();
        livro3.emprestar();
        livro2.emprestar();
        livro1.devolver();

        System.out.println("Livros emprestados:");
        for (Livro livro : biblioteca.getEmprestados()) {
            System.out.println(livro.getTitulo());
        }

        System.out.println();

        System.out.println("Livros disponíveis:");
        for (Livro livro : biblioteca.getDisponiveis()) {
            System.out.println(livro.getTitulo());
        }
    }
}
