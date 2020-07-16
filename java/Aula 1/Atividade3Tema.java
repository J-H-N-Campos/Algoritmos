/*Ler dois valores inteiros (variáveis A e B) e efetuar as operações de
adição, subtração e multiplicação de A por B, apresentando ao final
os três resultados obtidos.*/
public class Atividade3Tema
{
  public static void main (String[] args)
  {
    int va= Entrada.leiaInt("valor a");
    int vb= Entrada.leiaInt("valor b");
    int soma= (va+vb);
    int sub= (va-vb);
    int multi= (va*vb);
    System.out.print("o valor da soma, é"+" "+soma);
    System.out.print ("o valor da multi, é"+" "+multi);
    System.out.print ("o valor da sub é,"+" "+sub);
  }
}
    