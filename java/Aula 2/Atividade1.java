/* Escreva um algoritmo que l� um inteiro. Se for MAIOR que ZERO coloca o valor em uma vari�vel
I se for MENOR que zero coloca o valor em uma vari�vel B. Antes de terminar mostra na tela o
valor contido somente na vari�vel que foi utilizada. */
public class Atividade1
{
  public static void main (String[] args)
  {
    int num=Entrada.leiaInt("digite um numero");
    if (num>0) {
      System.out.println("variavel1");
    }else{
      System.out.println("variavel2");
    }
  }
}

        