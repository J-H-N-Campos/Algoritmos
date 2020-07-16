public class Atividade4
{
  public static void main (String[] args)
  {
    int[] vetor=new int[50];
    int num=0;
    
    for(int i=0; i<50; i++)
  {
      vetor[i]=Entrada.leiaInt("Digite algum numero");
      num=Entrada.leiaInt("Digite algum numero");
    }
    for(int i=0; i<50; i++)
    {
       if (vetor[i]!=num)
       {
       }
       if (vetor[i]==num)
             {
         System.out.println("Os numeros repetidos foram:"+" "+vetor[i]);
       }
    }
  }
}
   
    