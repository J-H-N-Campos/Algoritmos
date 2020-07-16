public class Atividade9
{
  public static void main (String[] args)
  {
    String[] vetor1=new String[10];
    double[] vetor2=new double[10];
    double[] vetor3=new double[10];
    double x=0;
    double x1=0;
    double x2=0;
    
    for(int i=0; i<10; i++)
    {
      vetor1[i]=Entrada.leiaString("digite o nome do produto");
      vetor2[i]=Entrada.leiaDouble("digite o codigo do produto");
      vetor3[i]=Entrada.leiaDouble("digite o valor do produto");
      if (vetor2[i]%2==0 || vetor2[i]>1000)
      {
        x=(vetor3[i]*20/100);
        System.out.println("esses produtos sofrerao aumento de 20%, ou seja:"+vetor1[i]+vetor2[i]+vetor3[i]+x);
      }
      if (vetor2[i]%2==0)
      {
        x1=(vetor2[i]*15/100);
        System.out.println("esses produtos sofrerao aumento de 15%, ou seja:"+vetor1[i]+vetor2[i]+vetor3[i]+x1);
        {
      if (vetor3[i]>1000)
      {
        x2=(vetor3[i]*10/100);
        {
        System.out.println("esses produtos sofrerao aumento de 10%, ou seja:"+vetor1[i]+vetor2[i]+vetor3[i]+x2);
        }
      }
        }
      }
    }
  }
}
      
      
        