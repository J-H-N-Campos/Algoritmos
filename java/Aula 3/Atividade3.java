/* Desenvolva um algoritmo que leia 5 n�s e diga se o n�mero est� ou n�o na
faixa de 1200 � 3000 e quantos est�o nesta faixa.*/
public class Atividade3
{
  public static void main (String[] args)
  {
    int num=0;
    int cont=0;
    int cont1=0;
    int cont2=0;
   
    while (cont<5)
    {
      {
      System.out.println("valor de cont;"+cont);
      num=Entrada.leiaInt("digite um numero");
      if ((num>=1200) && (num<=3000))
      {
        cont1++;
      }else
        cont2++;
      }
     cont++;
  }
    
    
        System.out.println("o numero esta na faixa;"+cont1);
          System.out.println("o numero nao esta na faixa;"+cont2);
          System.out.println("quantidade de numeros que estao na faixa;"+cont1);
  }
}



          
        