public class q1
{
  public static void main (String[] args)
  {
    int[] vetor=new int[20];
    int x=0;
    
    
    for(int i=0; i<20; i++)
    {
      vetor[i]=Entrada.leiaInt("Digite 20 numeros positivos maiores que zero:");
      if (vetor[i]>0 && vetor[i]>-1)
      {
        System.out.print("  os numeros digitados foram:  "+"  "+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]  +"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+ " "+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+ "  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]+"  "+vetor[i]);
      }else
        System.out.print(  "ERRO!!!!!!!!!!!!!!!!!!!!!!");
    }
    {for ( int i =  vetor.length - 1 ; i >= 0 ; i-- )
    {
      System.out.print(  "  primeiro numero da rotacao digitada:  "+  " - #"+ vetor[i]+    "rotacao dos numeros digitados :  "  +" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]+" - #"+vetor[i]);
    }
  }
  }
}
      
    