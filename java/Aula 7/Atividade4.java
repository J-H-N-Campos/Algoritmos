/*Fa�a um programa que recebe dois nomes de duas pessoas e exiba este nome de
tr�s para frente, al�m exiba apenas as 5 primeiras letras do nome.*/

public class Atividade4
{
  public static void main(String[] args)
  {
 String n = Entrada.leiaString("Digite algum nome:");

 int limite = Math.min( n.length(), 5 );

 int i = 0;
 while (i < limite)
 {
 System.out.print( n.charAt( i ) );
 i ++;
 }
 System.out.println();
  n = Entrada.leiaString("Digite algum nome novamente:");

 i = 1;
 while (i <= n.length())
 {
 System.out.print( n.charAt( n.length()-i ) );
 i ++;
 }
 System.out.println();
  }
}