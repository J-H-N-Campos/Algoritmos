/*Escrever um programa que lê 10 nomes, os armazena em um vetor, depois os imprime na ordem inversa de leitura.*/

public class Atvidade5
{
  public static void main (String[] args)
  {
    String[] vetor=new String[]{"joao","felipe","antionio","cassio","computador","smite","alcool","oito","nove","dez"};
    int x= vetor.length;
    String[] vetor1= new String[x];
    {for ( int i =  vetor.length - 1 ; i >= 0 ; i-- )
      {
    x--;
    vetor1[i] = vetor[x];
      System.out.println("nomes inversos:"+vetor[x]);
    }
    }
  }
}