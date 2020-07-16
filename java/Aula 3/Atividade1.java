/*Ler o nome e número de filhos de 8 pessoas, mostrando:
a. Quantas pessoas têm de 1 a 3 filhos.
b. Quantas pessoas têm de 4 a 7 filhos.
c. Quantas pessoas têm 8 filhos ou mais.
d. Quantas pessoas não têm filho*/
public class Atividade1
{
  public static void main (String[] args)
  {
    int cont = 0;
    int nf=0;
    int cont1=0;
    int cont2=0;
      int cont3=0;
      int cont4=0;
    while (cont < 8)
    {
      System.out.println("valor de cont;"+cont);
     nf=Entrada.leiaInt("digite numeros de filhos");
    String nome=Entrada.leiaString("digite o nome");
    if ((nf>=1)&&(nf<=3)) 
    {
      cont1++;
      
    }else
      if((nf>=4) && (nf<=7)) {
      cont2++;
    }else
      if (nf>=8) {
      cont3++;
    }else
      if (nf==0){
      cont4++;
          }
    cont++;
  }
    System.out.println("quantas pessoas tem de 1 a 3 filhos"+" "+cont1);
                         System.out.println("quantas pessoas têm de 4 a 7 filhos"+" "+cont2);
                       System.out.println("Quantas pessoas têm 8 filhos ou mais"+" "+cont3);
                       System.out.println("Quantas pessoas não têm filho"+" "+cont4);
  }
}

    
    
    