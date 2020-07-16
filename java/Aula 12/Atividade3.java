public class Atividade3{
  public static void main (String args[]){
    
    int [][] A = new int [10][10];
    int [][] B = new int [10][10];
    int i,j,contador,aux,aux2;
    
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        A[i][j] = (int)(Math.random()*10);
        B[i][j] = A[i][j];
      }
    }
    System.out.println("MATRIZ PRIM?RIA");
    //MOSTRAR A MATRIZ
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }
    //-------TROCA A LINHA-------
    for (j=0;j<10; j++){
      A[1][j] = B[7][j];
      A[7][j] = B[1][j];
    }
    System.out.println();
    System.out.println("MATRIZ COM A TROCA DA LINHA");
    //MOSTRAR A MATRIZ
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
      
    }
    // TRANSFORMA A "B" NA PRINCIPAL
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        B[i][j]=A[i][j];
      }
    }
    //------TROCA COLUNA--------
    for (i=0;i<10; i++){
      A[i][3] = B[i][9];
      A[i][9] = B[i][3];
    }
    System.out.println();
    System.out.println("MATRIZ COM A TROCA DA COLUNA");
    //MOSTRAR A MATRIZ
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println();
    // TRANSFORMA A "B" NA PRINCIPAL
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        B[i][j]=A[i][j];
      }
    }
    System.out.println("TROCA DE POSI??ES DA DIAGONAL PRIMARIA COM SECUND?RIA");
    //TROCA DE POSI??ES DA DIAGONAL PRIMARIA COM SECUND?RIA
    contador = 10 - 1;
    for (i = 0; i < 10; i++){
      aux = A[i][i];
      A[i][i] = A[i][contador];
      A[i][contador] = aux;
      contador--;
    }
    //MOSTRA MATRIZ
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }
    // TRANSFORMA A "B" NA PRINCIPAL
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        B[i][j]=A[i][j];
      }
    }
    System.out.println();
    System.out.println("TROCA LINHA 5 COM COLUNA 10");
    for(i = 0; i < 10; i++){
    aux2 = A[4][i];
    A[4][i] = A[10 - i -1][10 - 1];
    A[10 - i -1][10 - 1] = aux2;

    }
    //MOSTRA MATRIZ
    for (i=0;i<10; i++){
      for (j=0;j<10; j++){
        System.out.print(A[i][j]+" ");
      }
      System.out.println();
    }   

  }   
}    

