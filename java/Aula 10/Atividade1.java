public class Atividade1
{
  public static void main (String[] args)
{
    int[] vetor=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31,32,33,34,35,36,37,38,39,40,41,42,43,44,45,46,47,48,49,50};
  int soma=0;
  int soma1=0;

    for(int i=0; i<6; i++)
    {
      vetor[i]=Entrada.leiaInt("Digite seis numeros");
    }
    for(int i=0; i<6; i++)
     {
       if (vetor[i]%2==0)
       {
         System.out.println("Numeros pares:"+vetor[i]);
     }else
        System.out.println("Numeros impares:"+vetor[i]);
      System.out.println("----------------------");
     }
    for(int i=0; i<6; i++)
    {
     if(vetor[i]%2==0)
     {
       System.out.println("o numero:"+i+" e par");
     }else
       System.out.println("o numero:"+i+" nao e par");
     System.out.println("----------------------");
    }
  }
}
     
       
     
         
    
    
    