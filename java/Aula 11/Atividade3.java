/* Faça um programa que preencha uma matriz M (5x6), calcule e mostre a matriz R, resultante da multiplicação dos elementos de M pelo seu maior elemento. */
public class Atividade3
{
  public static void main (String[] args)
  {
    int m[][]=new int[5][6];
    int r[][]=new int[5][6];
    
    for(int i=0; i<5; i++)
    {
      m[i][0]=Entrada.leiaInt("Digite qualquer numero. No maximo ate 50, sendo o proprio quinto numero, o numero 50:");
      
      if (m[i][0]<51)
      {
        m[i][0]=m[i][0]*50;
      }else
        System.out.println("fim do programa");
    }
    for(int i=0; i<5; i++)
    {
      if (m[i][0]<51)
      {
        m[i][0]=r[i][0];
         System.out.println("resultados das multiplicacoes da matriz m, estar no r, como:"+m[i][0]);
      }else
        System.out.println("fim do programa");
  }
}
}
        
      
      
    
    