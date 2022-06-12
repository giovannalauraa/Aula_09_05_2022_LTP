package Aula_09_05_LTP.Atividade3PEDIDO;


public class Produto {

    // Campos da classe
    private int codigo;
    private float valor;
    private String descricao;

    //Construtores com parametros

    public Produto(int codigo, float valor, String descricao) {
    this.codigo = codigo;
    this.valor = valor;
    this.descricao = descricao;
    }
    
    //gets e sets

    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public float getValor() {
        return valor;
    }
    public void setValor(float valor) {
        this.valor = valor;
    }
    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Quando todos atributos são privados devemos colocar gets e sets

    
}
