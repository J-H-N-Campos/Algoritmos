public class Atividade2C {
    public static void main(String[] args) {
      int[][] num= new int[10][3];
         int i;
      int j;
      for (i=0; i < 10; i ++){
        for (j=0; j < 3; j ++){
        num[i][j] = Entrada.leiaInt("digite um número:");
      }
      }
        for (i=9; i >= 0 ; i --)
          {
               for (j=2; j >= 0; j--)
               {
                    System.out.print( num[i][j]+"\t" );
               }
               System.out.println();
          }
      }
}
    