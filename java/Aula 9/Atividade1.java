/* Seja um vetor inteiro de 9 elementos:
a) preencher o vetor lendo a entrada do usu�rio (apenas valores maiores do que zero);
b) imprimir os elementos do vetor em 1 linha, deixando 2 espa�os em branco entre cada
elemento;
c) liberar a primeira posi��o do vetor deslocando todos os valores em uma posi��o para a
direita (o �ltimo valor ser� perdido nesse processo);
d) somar o �ndice de cada elemento ao conte�do do mesmo;
e) ler um valor e imprimir o n�mero de ocorr�ncias desse valor no vetor. */

public class Atividade1
{
  public static void main (String[] args)
  {
    int[] vetor=new int[9];
    int a=0;
      
      while (a<vetor.length)
    {
      vetor[a]=Entrada.leiaInt("digite um valor maior que zero");
      a++;
    }
    for(int a1=0; a1<9; a1++)
    {
      System.out.print(vetor[a1]+"o valor e  ");
    }
     for(int a1=0; a1<8; a1++)
    {
     System.out.print(vetor[a1]+"o valor e  ");
    }
   for(int a1=0; a1<9; a1++)
    {
      vetor[a1]=(vetor[a1]*2);
      System.out.println("o valor �:"+vetor[a1]);
    }
  }
}

    