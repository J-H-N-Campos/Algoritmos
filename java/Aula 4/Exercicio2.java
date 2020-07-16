public class Exercicio2
{
  public static void main (String[] args)
{
    int num=0;
    int cont=0;
    int cont1=0;
    int cont2=0;
    int cont3=0;
    int cont4=0;
    int media=0;
    int media1=0;
    int media2=0;
    int media3=0;
    int media4=0;
    while (cont<5)
    {
      num=Entrada.leiaInt("digite um numero");
      if (num%2==0)
      {
        cont1++;
      }else{
        cont2++;
    }
      if (num>=0)
      {
        cont3++;
      }
      if (num%2!=0 && num%3==0 && num%4==0)
      {
        cont4++;
      }
      {
      media=num+cont1/5;
      media2=num+cont2/5;
      media3=num+cont3/5;
      media4=num+cont4/5;
      }
      cont++;
      System.out.println("quantidade de numeros inteiros;"+cont1);
      System.out.println("quantidade de numeros pares;"+cont1);
      System.out.println("quantidade de numeros impares;"+cont2);
      System.out.println("quantidade de numeros impares e divisiveis por 3 e 4;"+cont4);
      System.out.println("media;"+media);
      System.out.println("media;"+media2);
      System.out.println("media;"+media3);
      System.out.println("media;"+media4);
    }
  }
}

            
    