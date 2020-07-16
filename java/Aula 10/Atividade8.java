public class Atividade8
{
  public static void main (String[] args)
  {
    double[] vetor=new double[7];
    double[] vetora=new double[7];
    double[] vetorb=new double[7];
    double media=0;
    double exame=0;
    double mediafinal=0;
    
    for(int i=0; i<=0; i++)
    {
    
    vetor[i]=Entrada.leiaDouble("digite uma nota");
    vetora[i]=Entrada.leiaDouble("digite a segunda nota");
    vetorb[i]=Entrada.leiaDouble("digite a terceira nota");
    media=(vetor[i]+vetora[i]+vetorb[i])/3;
    {
    if (media>=7.0)
    {
      System.out.println("aprovado;"+media);
    }
      exame=Entrada.leiaDouble("digite o valor do exame");
      mediafinal=(media+exame)/2;
      {
        if (mediafinal>=5.0)
        {
          System.out.println("aprovado;"+mediafinal);
        }
        if (mediafinal<5.0)
            System.out.println("reprovado;"+mediafinal);
      }
    }
  }
}
}



        
        
      