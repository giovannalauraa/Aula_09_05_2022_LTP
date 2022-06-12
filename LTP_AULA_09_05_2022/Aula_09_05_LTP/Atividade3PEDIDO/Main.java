package Aula_09_05_LTP.Atividade3PEDIDO;

public class Main {
    public static void main(String[] args) {

      // Criando a variável para a classe produto, (Criando um objeto).
    
       Produto produto1 = new Produto (00001, (float) 500.00, "Notebook");
       Produto produto2 = new Produto (00001, (float) 500.00, "Notebook");
       

       // Criando um item pedido
       ItemPedido itemPedido1 = new ItemPedido(produto1, 1);
       ItemPedido itemPedido2 = new ItemPedido(produto2, 1);



       // Criamos um objeto da classe pedido
       Pedido meuPedido = new Pedido();

       // Usando os métodos do objeto da classe Pedido
       meuPedido.adicionarItem(itemPedido1);
       meuPedido.adicionarItem(itemPedido2);
       System.out.println("Total do pedido: " + meuPedido.obterTotal() );

   
      

      
    }
}


/*ATIVIDADE 2 (PROFESSOR)
  Uma composição entre classes ocorre quando um 
objeto de uma delas só pode ser criado se o objeto 
da outra já existir. Para fazer isso acontecer faz-se
necessário criar um campo do tipo de uma delas na outra,
além de solicitar no construtor um objeto daquela classe
que compõe, ou seja, que está como campo. Vamos revisitar 
a aula Aula 4 (LTPI3) - Revisão POO - Relacionamento entre 
classes e Polimorfismo e implementar o modelo do slide 15, 
o qual representa uma composição de classes.
*/
