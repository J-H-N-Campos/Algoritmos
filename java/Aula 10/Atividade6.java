public class Atividade6
{
  public static void main (String [] args)
  {
    double[] vetor=new double[10];
    double[] vetora=new double[10];
    String[] vetorb=new String [10];
    double x=0;
    double x1=0;

    
    
    for(int i=0; i<10; i++)
    {
      vetor[i]=Entrada.leiaDouble("Digite o valor do total de vendas dos vendedores");
      vetora[i]=Entrada.leiaDouble("Digite o percentual do valor dos vendedores");
      vetorb[i]=Entrada.leiaString("digite os nomes dos vendedores");
      
      x1=((vetor[i]*vetora[i]/100));

      System.out.println("os nomes e os valores das comissoes dos vendedores:"+vetorb[i]+"  "+x1);
    }
      
        for(int i=0; i<10; i++)
        {
          x=vetor[i]+vetor[i];
          
            System.out.println("total de vendas dos vendedores:"+x);
        }
        
        
         for(int i=0; i<10; i++)
        {
           if (vetor[i]>x)
           {
             System.out.println("o maior valor a receber e o seu nome:"+vetor[i]+"  "+vetorb[i]);
           }
           if
             (vetor[i]<x)
           {
            System.out.println("o menor valor a receber e o seu nome:"+vetor[i]+"  "+vetorb[i]);
           }
         }
  }
}
             
        
        
    
       
         
      
      
      
      
   
        
      
      
      
      