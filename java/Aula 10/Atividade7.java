public class Atividade7
{
  public static void main (String[] args)
  {
    int[] vetor=new int[]{0,1,2,3,4,5,6,7,8,9};
    int x=0;
    int somap=0;
    
    
    for(int i=0; i<10; i++)
    {
      if (vetor[i]<0)
      {
        x=vetor[i]+1;
      }else
        somap=somap+vetor[i];
    
    System.out.println("quantidade de numeros negativos:"+x);
    System.out.println("quantidade de numeros positivos:"+somap);
    }
  }
}