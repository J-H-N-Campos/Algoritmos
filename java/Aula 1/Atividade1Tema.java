/*Faça um algoritmo que calcule a média aritmética de um aluno,
que possui 3 notas.*/
public class Atividade1Tema
{
  public static void main (String[] args)
  {
    
      int nota1 = Entrada.leiaInt("digite a nota 1");
      int nota2 = Entrada.leiaInt("digite a nota 2");
      int nota3 = Entrada.leiaInt ("digite a nota 3");
      int media = (nota1+nota2+nota3)/3;
      System.out.println("a media sera:"+" "+media);
      
  }
}
                            