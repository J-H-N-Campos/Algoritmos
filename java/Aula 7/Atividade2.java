/*2) Fa�a um programa que recebe do usu�rio o nome de uma pessoa e exibe este nome de
tr�s para frente. */

public class Atividade2
{
 public static void main(String[] args)
 {
 String n = Entrada.leiaString("Digite o seu nome:");

 int i = 1;
 while (i <= n.length())
 {
 System.out.print( n.charAt( n.length()-i ) );
 i ++;
 }
 System.out.println();
 }
}