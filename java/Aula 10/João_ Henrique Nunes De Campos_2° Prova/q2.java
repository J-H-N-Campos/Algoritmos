public class q2
{
  public static void main (String[] args)
  {
    int[] vetor=new int[10];
    int x=0;
    int x1=0;
    
    for(int i=0; i<10; i++)
    {
      vetor[i]=Entrada.leiaInt("digite dez numeros:");
      if (vetor[i]%2==0)
      {
        x=vetor[i]+5;
        System.out.println("indice par somado por 5:"+x);
      }else
        x1=vetor[i]*4;
        System.out.println("indice impar multiplicado por 4:"+x1);
    }
  }
}
        
        
      
    