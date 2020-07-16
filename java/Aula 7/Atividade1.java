/*1) Faça um programa que recebe do usuário o nome de uma pessoa e exibe as 10
primeiras letras do nome. */

public class Atividade1
{
  public static void main(String[] args)
  {
    
     String z = Entrada.leiaString("digite seu nome");
     int x = 0;
     int particao = Math.min(z.length(),10);
    
    
    while (x < particao)
    {
      System.out.print( z.charAt( x ) );
      x ++;
    }
    System.out.println();
  }
}