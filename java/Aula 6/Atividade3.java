public class Atividade3
{
 public static void main (String args[])
 {
   
  double a=0;
  // variavel a de numeros quebrados
  double b=0;
  // variavel b de numeros quebrados
  double c=0;
  // variavel c de numeros quebrados
  double delta=0;
  // variavel delta de numeros quebrados
  double delta1=0;
  // variavel delta1 de numeros quebrados

    a=Entrada.leiaDouble("Digite o valor de a");
    //variavel a esta sendo lida
    b=Entrada.leiaDouble("Digite o valor de b"); 
    //variavel b esta sendo lida
    c=Entrada.leiaDouble("Digite o valor de c"); 
    //variavel c esta sendo lida
    delta=Entrada.leiaDouble("digite o valor do delta");
    //variavel delta esta sendo lida
    if (delta==0)
      // se delta for igual a 0 entao
    {
        delta=(b*b)-(4*a*c);
        //formula do delta
    }
    if (delta<0)
      // se delta for menor que 0 entao
    {
       System.out.println("raiz nao existe ");
       //aqui mostrara que a raiz nao existe
    }
    if (delta==0)
      //se delta for igual a 0 entao
    {
      System.out.println("existe uma raiz");
      //mostrara que existe uma raiz aqui
        delta1=(-b)/(2*a);
        //formula do delta1
       }
          if (delta>0)
            //se delta for maior que 0 entao
          {
      System.out.println("existem duas raizes");
      // mostrara aqui duas raizes
        delta1=(-b)/(2*a);
        //formula do delta1
        delta=(b*b)-(4*a*c);
        //formula do delta
        System.out.println("Primeira raiz = " + delta1);
        //primeira raiz
        System.out.println("Segunda raiz = " + delta);
        //segunda raiz
       }
      }
 }