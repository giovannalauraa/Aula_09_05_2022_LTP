package Aula_09_05_LTP.Atividade1ALUNA;
public class Livro {
    private int ano;
    private String titulo, autor;

    public Livro(int ano, String titulo, String autor) {
        this.ano = ano;
        this.titulo = titulo;
        this.autor = autor;
    }
    
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    


    
}


/*ATIVIDADE 1 (ALUNO)
Crie uma classe chamada Livro. Crie três atributos: ano, do tipo int; título, do tipo String; autor do tipo String. Todas devem ser especificadas com o modificador de acesso private. Na classe principal main declare uma variável do tipo da classe e crie uma instância da mesma (ou seja, um objeto). Insira valores em cada um dos campos do objeto e os imprima em seguida. */
