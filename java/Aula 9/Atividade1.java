/* Seja um vetor inteiro de 9 elementos:
a) preencher o vetor lendo a entrada do usuário (apenas valores maiores do que zero);
b) imprimir os elementos do vetor em 1 linha, deixando 2 espaços em branco entre cada
elemento;
c) liberar a primeira posição do vetor deslocando todos os valores em uma posição para a
direita (o último valor será perdido nesse processo);
d) somar o índice de cada elemento ao conteúdo do mesmo;
e) ler um valor e imprimir o número de ocorrências desse valor no vetor. */

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
      System.out.println("o valor é:"+vetor[a1]);
    }
  }
}

    