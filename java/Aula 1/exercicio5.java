//5) Escreva um programa para calcular a média das 3 notas de um aluno. 
public class exercicio5
{
  public static void main (String[] args)
  {

     int valor1 = Entrada.leiaInt(); 
     int valor2 = Entrada.leiaInt(); 
     int valor3 = Entrada.leiaInt(); 
     int media = (valor1+valor2+valor3)/3;
     System.out.println("a media sera "+media);
     
  }
}