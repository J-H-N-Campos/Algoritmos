/*Ler uma temperatura em Fahrenheit e apresent�-la convertida em
graus Celsius. A f�rmula de convers�o � : C<-(F-32)*(5/9), onde F
� a temperatura em Farenheit e C � a temperatura em
Cent�grados*/
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