public class Atividade1
{
  public static void main (String[] args)
  {
  int[] A = new int [7];
    String B[] = {"segunda","ter�a","quarta","quinta","sexta","s�bado","domingo"};
    int i,cont=0;
    double aux=0;
    String dia="a";
    
    for (i=0;i<7;i++){
      A[i] = Entrada.leiaInt("Digite a temperatura da "+B[i]);
      aux = A[i]+aux;
    }
    aux = aux/7;
    System.out.println("A m�dia da temperatura � "+aux);
    for (i=0;i<7;i++){
      if (A[i]>aux){
        cont = cont+1;
        //dia = B[i];
      }
          
    }
     System.out.println("As temperaturas maiores do que a m�dia � "+cont);
  }
}
      
    
    