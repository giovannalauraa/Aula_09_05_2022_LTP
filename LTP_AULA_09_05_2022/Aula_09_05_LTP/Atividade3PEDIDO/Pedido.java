package Aula_09_05_LTP.Atividade3PEDIDO;

import java.util.ArrayList;

public class Pedido {
    // [] = significa vetor, mas podemos usar ArrayList 
    private ArrayList<ItemPedido> itens;
    private double valorTotal;

    public Pedido(){
        itens = new ArrayList<>();
    }

    /*public Pedido(Produto produto1, int i) {
    } */

    public void adicionarItem(ItemPedido itemNovo){
        // Adiciona o item no ArrayList
        this.itens.add(itemNovo);
        double valorItem;
        valorItem = itemNovo.getQuantidade() * itemNovo.getProduto().getValor();
        atualizarValorTotal(valorItem); // não estava no diagrama, foi adicionado
    
    }
    private void atualizarValorTotal(Double valor) {
    this.valorTotal = this.valorTotal + valor;
}
    public double obterTotal(){

        return this.valorTotal;
        
    }

    
}
