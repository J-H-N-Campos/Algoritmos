public class Atividade3
{
  public static void main (String [] args)
  {
    double nota1=0;
    double nota2=0;
    double nota3=0;
    String nome;
    double media=0;
    int ordem=0;
    
    System.out.println("Lembrando que a primeira nota possui peso 3, a segunda peso 4 e a terceira peso3, se a nota for maior que 10 em cada nota, o programa dara erro!!!!!!!!!!!");
    for(int i=0; i<10; i++)
    {
      nome=Entrada.leiaString("Digite o nome do aluno");
      ordem=Entrada.leiaInt("Digite a ordem de chamada do aluno");
      nota1=Entrada.leiaDouble("Digite a primeira nota do aluno");
      if (nota1>3)
      {
        System.out.println("Erro, limite de peso por prova");
      }
      nota2=Entrada.leiaDouble("Digite a segunda nota do aluno");
      if (nota2>4)
      {
        System.out.println("Erro, limite de peso por prova");
      }    
      nota3=Entrada.leiaDouble("Digite a terceira nota do aluno");
      if (nota3>3)
      {
        System.out.println("Erro, limite de peso por prova");
      }
       media=nota1+nota2+nota3;
      System.out.println("Aluno:"+ordem+" "+nome);
      System.out.println("Nota 1:"+" "+nota1);
      System.out.println("Nota 2:"+" "+nota2);
      System.out.println("Nota 3:"+" "+nota3);
      System.out.println("Media:"+" "+media);
      System.out.println("----------------------------------------");
      
    }
  }
}

      
    
      
      
    