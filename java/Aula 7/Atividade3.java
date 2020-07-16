/*3) Faça um programa que recebe do usuário uma frase qualquer e depois informe quantas
letras 'a' ou 'A' existem na frase. 
  */
  public class Atividade3
{
 public static void main(String[] args)
 {
 String n = Entrada.leiaString("Digite uma frase:");
 int contaLetras = 0;
 int i = 0;
 while (i < n.length() )
 {
 if ( n.charAt( i ) == 'a' || n.charAt( i ) == 'A'
)
 {
 contaLetras ++;
 }
 i ++;
 }
 System.out.println("Existem "+" letras);
 }
}