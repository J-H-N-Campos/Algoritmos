public class Atividade4
{
  public static void main (String[] args)
  {
    int[] vetor=new int[15];
    
    for(int i=0; i<15; i++)
    {
      vetor[i]=Entrada.leiaInt("digite 15 numeros");
    }
     for(int i=0; i<15; i++)
     {
      
      if (vetor[i]==30)
      {
        System.out.println("nessa posicao existe o numero 30:"+i);
      }
      if (vetor[i]<30)
      {
        System.out.println("o numero 30 nao exste no vetor");
      }
    }
  }
}
        
      