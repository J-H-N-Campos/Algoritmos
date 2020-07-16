public class Atividade2
{
  public static void main (String[] args)
  {
    int[] vetor=new int[7];
    int x=0;
    int x1=0;
    int x2=0;
    
    
    for(int i=0; i<7; i++)
    {
      vetor[i]=Entrada.leiaInt("Digite setes numeros");
    {
      if (vetor[i]%2==0)
      {
        x=vetor[i];
      }
       if (vetor[i]%3==0)
      {
        x1=vetor[i];
      }
       if (vetor[i]%2==0 && vetor[i]%3==0)
      {
         x2=vetor[i];
       }
       System.out.println("os numeros multiplos de dois sao:"+x);
       System.out.println("os numeros multiplos de tres sao:"+x1);
       System.out.println("os numeros multiplos de dois e tres sao:"+x2);
       System.out.println("-----------------------------------------");
    }
  }
}
}
       
       
       