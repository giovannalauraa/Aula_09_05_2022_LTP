package Aula_09_05_LTP.Atividade2ALUNA;
public class Book {
    private String name;
    private double price;
    private Author author;
    private int quantidade = 0;

    public void Book(String name, Author author, double price){
        this.name = name;
        this.author = author;
        this.price = price;

    }
    public void Book(String name, Author author, double price, int quantidade){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantidade = quantidade;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String toString() {
        return "Book [author=" + author + ", name=" + name + ", price=" + price + ", qty=" + quantidade + "]";
    }

    

    
    
}
