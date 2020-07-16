  /*Elabore um algoritmo que leia 10 números e mostre a soma dos
números divisíveis por 5.*/
    public class Atividade4
{
      public static void main (String[] args)
      {
      int num=0;
      int x=0;
      int soma=0;
        int x2=0;
      while (x<10)
      {
        System.out.println("valor de x;"+x);
      num=Entrada.leiaInt("digite um numero");
      if (num % 5==0)
      {
        soma=soma+num;
      }
      x++;
      }
      System.out.println("a soma dos numeros diviseis;"+soma);
      }
    }
      
    
      
    
