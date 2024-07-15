package aula07.biblioteca;

public class App {
    public static void main(String[] args){
        Biblioteca biblioteca = new Biblioteca();

        Livro livro1 = new Livro(
            "O senhor dos anéis",
            "J.R.R. Tolkien",
            1954,
            "978-0-395-19395-2"
            );
        Livro livro2 = new Livro(
            "O guia do mochileiro das galáxias",
            "Douglas Adams",
            1979,
            "978-0-330-25864-7"
            );
        Livro livro3 = new Livro(
            "As crônicas de Nárnia",
            "C.S. Lewis",
            1950,
            "978-0-06-623850-0"
            ); 
        Livro livro4 = new Livro(
            "O código da Vinci",
            "Dan Brown",
            2003,
            "978-85-359-0277-0"
            );
        Livro livro5 = new Livro(
            "O apanhador no campo de centeio",
            "J.D. Salinger",
            1951,
            "978-30-319-0244-0"
            );

        biblioteca.adicionarLivro(livro1, livro1.isbn);
        biblioteca.adicionarLivro(livro2, livro2.isbn);
        biblioteca.adicionarLivro(livro3, livro3.isbn);
        biblioteca.adicionarLivro(livro4, livro4.isbn);
        biblioteca.adicionarLivro(livro5, livro5.isbn);

        livro1.emprestar();
        livro2.emprestar();
        livro3.emprestar();
        livro1.devolver();

        System.out.println("Livros disponíveis:");
        for (Livro livro : biblioteca.listaDisponiveis()) {
            System.out.println(livro.converteParaString());
        }

        System.out.println("Livros emprestados:");
        for (Livro livro : biblioteca.listaEmprestados()) {
            System.out.println(livro.converteParaString());
        }

        System.out.println("Todos os livros:");
        for (Livro livro : biblioteca.listaTodos()) {
            System.out.println(livro.converteParaString());
        }
    }
}
