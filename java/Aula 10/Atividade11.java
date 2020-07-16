public class Atividade11
{
  public static void main (String[] args)
  {
    int[] vetor=new int[10];
    int x=0;
    
    for(int i=0; i<10; i++)
    {
      vetor[i]=Entrada.leiaInt("Digite um numero");
      
      if (vetor[i]%2==0)
      {
        System.out.println("numeros pares:"+vetor[i]);
      }else
        x=(vetor[i]);
      }
      for(int i=0; i<10; i++)
      {
       x=(vetor[i]);
        System.out.println("numeros impares:"+x);
    }
  }
}
        
      