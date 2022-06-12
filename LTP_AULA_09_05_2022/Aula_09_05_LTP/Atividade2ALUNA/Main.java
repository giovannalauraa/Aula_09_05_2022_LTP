package Aula_09_05_LTP.Atividade2ALUNA;
public class Main {
    public static void main(String[] args) {
        //private ArrayList<Livraria> livraria2;

        // Definindo o tipo da classe
        Author author2 = new Author("Nome 1", "autor1@gmail.com", "f");
        Book book2 = new Book("Livro 1", "Autor 1", 20.99, 5);
        book2.setQuantidade(2);

        // Criando um item livraria
        ItemLivraria ItemLivraria1 = new ItemLivraria(author2);
        ItemLivraria book = new ItemLivraria(Book);
        
        // Criando um objeto da classe Book
        Livro livro2 = new Livro();

        // Criando um objeto da classe Author
        Autor autor2 = new Autor();

        //Usando os métodos da classe Book + mostrando "Book"
        System.out.println("\nDados do livro: ");
        System.out.println("\nNome: " + book2.getName() + "\nQuantidade: "+book2.getQuantidade() + "\nPreço: R$" + book2.getPrice() + "\nMétodo: " + book2.toString());

        //Classe author
        System.out.println("Dados do autor: ");
        System.out.println("\nNome: " + author2.getName() + "\nEmail: "+author2.getEmail() + "\nGênero: " + author2.getGender() + "\nMétodo: " + author2.toString());



        
        
    }
}
