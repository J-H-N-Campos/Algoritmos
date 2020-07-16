public class Atividade1
{
  public static void main (String[] args)
  {
    double nota1=0;
    double nota2=0;
    double nota3=0;
    double media=0;
    double exame=0;
    double mediafinal=0;
    
    nota1=Entrada.leiaDouble("digite uma nota");
    nota2=Entrada.leiaDouble("digite a segunda nota");
    nota3=Entrada.leiaDouble("digite a terceira nota");
    media=(nota1+nota2+nota3)/3;
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



        
        
      