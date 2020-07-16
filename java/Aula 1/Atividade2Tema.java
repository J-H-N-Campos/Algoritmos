/*Ler uma temperatura em Fahrenheit e apresentá-la convertida em
graus Celsius. A fórmula de conversão é : C<-(F-32)*(5/9), onde F
é a temperatura em Farenheit e C é a temperatura em
Centígrados*/
public class Atividade2Tema
{
  public static void main (String[] args)
  {
{
  double F= Entrada.leiaInt("digite uma temperatura");
  double C=(F-32.0)*(5.0/9.0);
  System.out.println (" o valor da temperatura em celsius sera"+" "+F+C);
}
  }
}