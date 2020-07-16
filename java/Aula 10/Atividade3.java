public class Atividade3
{
  public static void main (String[] args)
  {
    int[] vetor=new int[10];
    int[] vetora=new int[10];
    
    
    for(int i=0; i<10; i++)
    {
      System.out.println("digite para as opcoes");
      vetor[i]=Entrada.leiaInt("1-Amaciante/2-Detergente/3-Desinfetante/4-Agua sanitaria/5-sabao em po");
      vetora[i]=Entrada.leiaInt("Digite a quantidade:");
    }
      for(int i=0; i<1; i++)
      {
      
      
      if (vetor[i]==1)
      {
        System.out.println("Tentar atender o pedido");
        System.out.println("pedido atendido. Obrigado e volte sempre");
      }
      if (vetora[i]==2)
      {
        System.out.println("Nao temos estoque suficiente dessa mercadoria");
        System.out.println("produtos atualizados");
      }
        
      if (vetor[i]==2)
      {
        System.out.println("Tentar atender o pedido");
        System.out.println("pedido atendido. Obrigado e volte sempre");
      }
       if (vetora[i]==2)
      {
        System.out.println("Nao temos estoque suficiente dessa mercadoria");
        System.out.println("produtos atualizados");
      }
         
      if (vetor[i]==3)
      {
        System.out.println("Tentar atender o pedido");
        System.out.println("pedido atendido. Obrigado e volte sempre");
      }
       if (vetora[i]==2)
      {
        System.out.println("Nao temos estoque suficiente dessa mercadoria");
        System.out.println("produtos atualizados");
      }
        
      if (vetor[i]==4)
      { System.out.println("Tentar atender o pedido");
        System.out.println("pedido atendido. Obrigado e volte sempre");
      }
      if (vetora[i]==2)
      {
        System.out.println("Nao temos estoque suficiente dessa mercadoria");
        System.out.println("produtos atualizados");
      }
        
     
      if (vetor[i]==5)
      {
        System.out.println("Tentar atender o pedido");
        System.out.println("pedido atendido. Obrigado e volte sempre");
      }
      if (vetora[i]==2)
      {
        System.out.println("Nao temos estoque suficiente dessa mercadoria");
        System.out.println("produtos atualizados");
      }
        
      
      if (vetor[i]>5)
      {
        System.out.println("Tentar atender o pedido");
        System.out.println("codigo inexistente");
        System.out.println("produtos atualizados");
      }
        if (vetor[i]==0)
      {
        System.out.println("Tentar atender o pedido");
        System.out.println("codigo inexistente");
        System.out.println("produtos atualizados");
      }
        System.out.println("produtos atualizados:"+vetor[i]);
           System.out.println("--------------------------");
    }
  }
}
      
      
      
      