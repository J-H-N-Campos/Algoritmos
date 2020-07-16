public class Exercicio3
{
  public static void main (String[] args)
  {
    double num=0;
    double cont=0;
    double cont1=0;
    double cont2=0;
    double cont3=0;
      double cont4=0;
    while (cont<5)
    {
      num=Entrada.leiaDouble("digite um numero");
      if (num>=0 && num<=25.9){
      {
        cont1++;
        if (num>=26 && num<=5.9)
        {
          cont2++;
        }
            if (num>=5.1 && num<=75.9)
        {
              cont3++;
            }
        if (num>=76 && num<=100)
        {
          cont4++;
        }
        cont++;
        }
         System.out.println("Resultado final;"+cont1);
         System.out.println("resultado final;"+cont2);
         System.out.println("resultado final;"+cont3);
         System.out.println("resultado final;"+cont4);
      }
    }
  }
}
            
          