public class Atividade10
{
  public static void main (String[] args)
  {
    int[] vetor=new int[]{1,2,3,4,5,6,7,8,9,10};
    int[] vetora=new int[]{12,13,15,14,18};
    int x=0;
    int x1=0;
    
    for(int i=0; i<10; i++)
    {
      if (vetor[i]%2==0)
      {
        vetor[i]=(vetor[i]+vetor[i]);
      }else
        x1=(vetor[i]);
              System.out.println("soma dos numeros impares:"+x1);
    }
    for(int i=0; i<5; i++)
    {
      x=(vetor[i]+vetora[i]);
        System.out.println("soma dos numeros pares:"+x);
    }
  }
}
      
        
    
                             