package Aula_09_05_LTP.Atividade3PEDIDO;
public class ItemPedido {
    //Trazendo as classes para cá
    //Composição: Se usarmos essa regra devemos 
    //chamar as quantidades 
    //no construtor 
   

    // Campos da classe
    private Produto produto; // Produto é do tipo produto, é como se fosse um array list 
    private int quantidade;

    // Contrutor com parametros - chamando as quantidades no construtor

    public ItemPedido(Produto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }
    

    //gets e sets

    public Produto getProduto() {
        return produto;
    }
   /* public void setCodProduto(int codProduto) {
        this.codProduto = codProduto;
    }*/
    public int getQuantidade() {
        return quantidade;
    }
    /*public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }* O set é tirado para não poder se alterar a quantidade do produto/

    */
    
}


