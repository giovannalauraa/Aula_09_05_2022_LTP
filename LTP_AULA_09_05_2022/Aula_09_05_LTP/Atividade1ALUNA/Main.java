package Aula_09_05_LTP.Atividade1ALUNA;
public class Main {
    public static void main(String[] args) {
     //Definido a variável do tipo da classe
     Livro livro1;

     // Criando um objeto da classe livro e atribuir para a variável livro1
     livro1 = new Livro();

    // Atribuindo valores para o jogador 1 usando os getters e setters
    livro1.setAno(2022);
    livro1.setTitulo("Titulo do livro");
    livro1.setAutor("Autor");

     // Recuperar os valores do jogador 1
    // Usamos os getters
    System.out.println("Nome do livro: " + livro1.getTitulo());
    System.out.println("Autor: " + livro1.getAutor());
    System.out.println("Ano de publicação: " + livro1.getAno());


    }
    
}
