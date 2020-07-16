public class Atividade2
{
 public static void main(String[] args) {
      char[][] m1= new char[2][5];
      char[][] m2= new char[2][5];
      String[][] m3=new String [2][5];
         int i;
      int a;
      for (i=2; i<5; i++){
        for (a=2; a<5; a++){
        m1[i][a] = Entrada.leiaChar("digite alguma letra:");
        m2[i][a] = Entrada.leiaChar("digite alguma letra:");
        {
          m3[i][a]= (m1[i][a]);
          m3[i][a]=(m2[i][a]);
                    System.out.print( m3[i][a]+"\t" );
               }
               System.out.println("-----------Matriz-----------"+" "+m3);
        }
      }
 }
}

    