/*Fazer um programa que recebe uma matriz de n�meros inteiros 10x3 contendo c�digo, quantidade e pre�o de 10 produtos e depois mostre:
a) o valor total do estoque desta loja;
b) o c�digo do produto mais barato e o c�digo do produto mais caro;
c) o total de itens dispon�veis nas prateleiras desta loja;
d) os c�digos de todos os produtos que tem pre�o abaixo do pre�o m�dio;
e) uma lista de pre�os com todos os c�digos, quantidades e pre�os, por�m os produtos com c�digos �mpares ter�o aumento de 10% e os com c�digo par aumento de 5%
f) uma lista de pre�os com todos os c�digos, quantidades, pre�o e pre�o da parcela, sabendo-se que o pre�o da parcela � um ter�o do valor da mercadoria com juros de 8%.*/

public class Atividade2
{
  public static void main (String[] args)
  {
    int[][] vetor= new int [10][3];
    int[][] vetora= new int [10][4];
    int valortotal=0;
    int valortotal1=0;
    for(int i=0; i<10; i++)
    {
      vetor[i][0]=Entrada.leiaInt("digite o codigo");
      vetor[i][1]=Entrada.leiaInt("digite a quantidade");
      vetor[i][2]=Entrada.leiaInt("digite o preco");
    }
    for(int i=0; i<10; i++)
    {
      valortotal=vetor[i][2]+vetor[i][2];
    }
     for(int i=0; i<1; i++)
     {
       if (vetor[i][2]>0)
       {
         System.out.println("codigo do produto mais caro:"+vetor[i][2]);
       }else
         System.out.println("codigo do produto mais barato:"+vetor[i][2]);
     }
      for(int i=0; i<1; i++)
      {
        valortotal1=vetor[i][1]+vetor[i][1];
      }
      for(int i=0; i<10; i++)
      {
       if (vetor[i][2]<1)
       {
         System.out.println("codigo do produto que tem o pre�o abaixo da media:"+vetor[i][2]);
       }else
         System.out.println("codigo do pre�o do produto normal:"+vetor[i][2]);
      }
       for(int i=0; i<1; i++)
       {
            
       if (vetor[i][2]<10)
       {
         if (vetor[i][0]%2==0)
         {
           vetor[i][2]=vetor[i][2]*5/100;
           System.out.println("valores com 5% de aumento:"+vetor[i][2]);
         }else
           vetor[i][2]=vetor[i][2]*10/100;
           System.out.println("valores com 10% de aumento:"+vetor[i][2]);
       }
        for(int x=0; x<10; x++)
        {
          vetora[x][0]=Entrada.leiaInt("digite o codigo");
          vetora[x][1]=Entrada.leiaInt("digite a quantidade");
          vetora[x][2]=Entrada.leiaInt("digite o preco");
          vetora[x][3]=Entrada.leiaInt("digite o pre�o das parcelas");
        }
        for(int x=0; x<1; x++)
        {
          vetora[x][3]=(vetora[x][3]/3);
          vetora[x][3]=(vetora[x][3]*8/100);
       System.out.println("o valor das parcelas:"+vetora[x][3]);
        }
       System.out.println("valor total do estoque:"+valortotal);
       System.out.println("o total de itens disponiveis:"+valortotal1);
       }
  }
}
         
         
      
         
                              
            