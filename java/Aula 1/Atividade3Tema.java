/*Ler dois valores inteiros (vari�veis A e B) e efetuar as opera��es de
adi��o, subtra��o e multiplica��o de A por B, apresentando ao final
os tr�s resultados obtidos.*/
public class Atividade3Tema
{
  public static void main (String[] args)
  {
    int va= Entrada.leiaInt("valor a");
    int vb= Entrada.leiaInt("valor b");
    int soma= (va+vb);
    int sub= (va-vb);
    int multi= (va*vb);
    System.out.print("o valor da soma, �"+" "+soma);
    System.out.print ("o valor da multi, �"+" "+multi);
    System.out.print ("o valor da sub �,"+" "+sub);
  }
}
    