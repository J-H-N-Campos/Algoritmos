public class Atividade1C {
 public static void main(String args[]){
   double [][] num = new double[10][3];
   int[] vetorA = new int[10];
   int[] vetorB = new int[10];
   int soma=0,media=0,qnt=0;
   
   vetorA[0] = 15;
   vetorA[1] = 44;
   vetorA[2] = 23;
   vetorA[3] = 1;
   vetorA[4] = 0;
   vetorA[5] = 18;
   vetorA[6] = 17;
   vetorA[7] = 37;
   vetorA[8] = 35;
   vetorA[9] = 54;
   vetorB[0] = 32;
   vetorB[1] = 115;
   vetorB[2] = 48;
   vetorB[3] = 55;
   vetorB[4] = 51;
   vetorB[5] = 0;
   vetorB[6] = -48;
   vetorA[7] = 85;
   vetorA[8] = 15;
   vetorA[9] = 99;
   
   for (int i=0;i<10;i++){
   num[i][0]= (vetorA[i] * vetorB[i]);
   }
   for (int i=0;i<10;i++){
   num[i][1]= (vetorA[i] + vetorB[i]);
   }
   for (int i=0;i<10;i++){
   num[i][2]= (vetorA[i]-vetorB[i]);
   }
   
  for (int i=0;i<10;i++){
    for (int j=0;j<3;j++){
      System.out.print(num[i][j]+"\t");
    }
    System.out.println();
  }
   
 }
}