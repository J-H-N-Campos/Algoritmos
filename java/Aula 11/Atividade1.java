/*Fazer um programa que recebe uma matriz de n�meros inteiros 10x3 contendo c�digo, quantidade e pre�o de 10 produtos e depois mostre o pre�o m�dio dos produtos desta loja.*/
public class Atividade1
{
  public static void main (String[] args)
  {
    int[][] estoque= new int [10][3];
    int media=0;
    int mediaf=0;
    for(int i=0; i<10; i++)
    {
      estoque[i][0]=Entrada.leiaInt("digite o codigo");
      estoque[i][1]=Entrada.leiaInt("digite o quantidade");
      estoque[i][2]=Entrada.leiaInt("digite o preco");
    }
    for(int i=0; i<10; i++)
    {

    media=media+estoque[i][2];
    }
      mediaf=media/10;
    System.out.println("preco medio dos produtos da loja:"+mediaf);
    }
    }
