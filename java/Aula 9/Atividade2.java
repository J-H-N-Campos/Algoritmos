/*Fazer um programa que leia dois vetores A e B, de dimensão 8, e realize a troca dos elementos
destes vetores. Ou seja, após a execução do programa o vetor B deverá conter os valores
fornecidos para o vetor A, e vice-versa. */

public class Atividade2
{
  public static void main (String[]args)
  {
    int[] vetor=new int[8];
    int [] vetor1=new int[8];
    int aux=0;
    
    for(int a=0; a<8; a++)
    {
      vetor[a]=Entrada.leiaInt("digite o valor de A");
    }
      for(int a=0; a<8; a++)
      {
    vetor1 [a]=Entrada.leiaInt("digite o valor de B");
    }
  for(int a=0; a<8; a++)
  {
  aux=(vetor[a]);
    vetor[a]=(vetor1[a]);
    vetor1[a]=(aux);
  }
  
  for(int a=0; a<8; a++)
  {
    System.out.println("os valores trocados sao:"+" "+vetor[a]);
    System.out.println("os valores trocados sao:"+" "+vetor1[a]);
  }
}
}
  
  
  
    
  