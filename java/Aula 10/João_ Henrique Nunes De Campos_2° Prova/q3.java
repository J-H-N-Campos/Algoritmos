public class q3
{
  public static void main (String[] args)
  {
    int[] vetor=new int[10];
    
    for(int i=0; i<10; i++)
    {
      vetor[i]=Entrada.leiaInt("digite dez numeros");
      System.out.println("Vetor original:"+vetor[i]);
    }
    for(int i=0; i<10; i++)
    {
      if (vetor[i]%4==0)
      {
       vetor[i]=333;
       System.out.println("Vetor dos nao multiplos de 4:"+vetor[i]);
      }else
       System.out.println("Vetor dos nao multiplos de 4:"+vetor[i]);

      }
    }
  }
  
      
      
    
    