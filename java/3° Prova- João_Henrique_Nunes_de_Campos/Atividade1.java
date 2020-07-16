public class Atividade1
{
  public static void main (String[] args)
  {
    int vetor[]=new int[10];
    int x=0;
    
    for (int i=0; i<10; i++)
    {
      System.out.println("------------------------------------------------------------------------------");
      vetor[i]=Entrada.leiaInt("Digite algum numero");
      
      if (vetor[i]%2==0)
      {
        vetor[i]=vetor[i]*5;
        System.out.println("Os valores pares multiplicados por 5, armazenados no vetor, sao:"+" "+vetor[i]);
      }
      if (vetor[i]%2!=0)
      {
        x=vetor[i]+5;
      System.out.println("Os valores impares somados por 5, armazenados no vetor, são:"+" "+x);
      }
    }
  }
}

      