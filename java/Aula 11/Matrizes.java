public class Matrizes
{
     public static void main(String[] args)
     {
          int[][] num = new int[4][5];
          
          for (int i=0; i < 4; i ++)
          {
               for (int j=0; j < 5; j++)
               {
                    num[i][j] = Entrada.leiaInt("Linha: "+i+" Coluna: "+j);
               }
          }
          
          for (int i=0; i < 4; i ++)
          {
               for (int j=0; j < 5; j++)
               {
                    System.out.print( num[i][j]+"\t" );
               }
               System.out.println();
          }
          
          
          
     }
}