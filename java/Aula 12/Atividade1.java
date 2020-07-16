public class Atividade1{
  public static void main(String[] args){
    int[][] mat = new int[10][20];
    int[][] mat2 = new int[10][20];
    int[] vet = new int[10];
    int i=0;
    int j=0;
    int soma=0;
    
    //ler valores da matriz
    for (i=0; i < 10; i ++){  
      for (j=0; j < 20; j ++){
        mat[i][j] = (int)(Math.random()*2);
      }
    }
    //Soma valores
    for (i=0; i < 10; i ++){
      for (j=0; j < 20; j ++){
        vet[i] = vet[i] + mat[i][j];       
      }
    }
    //Multiplica??o dos valores
    for (i=0; i < 10; i ++){
      for (j=0; j < 20; j ++){
        mat2[i][j] = vet[i] * mat[i][j];
      }
    }
    System.out.println("Impressao da matriz original");  
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    for (i=0; i < 10; i ++){
      for (j=0; j < 20; j ++){
        System.out.print(mat[i][j]+"  |  " );
      }
      System.out.println();   
    }
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    System.out.println(); 
    System.out.println("Impressao a soma dos valores das linhas");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    System.out.println("|  L1  |  L2  |  L3  |  L4  |  L5  |  L6  |  L7  |  L8  |  L9  |  L10 |");
    System.out.println("-----------------------------------------------------------------------");
    System.out.print("|  ");
    for (i=0; i < 10; i ++){
      System.out.print(vet[i]+"  |  ");
    }
    System.out.println();
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    System.out.println(); 
    System.out.println("Impressao da matriz com valores multiplicados");
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
    for (i=0; i < 10; i ++){
      for (j=0; j < 20; j ++){
        System.out.print(mat2[i][j]+" | " );
      }
      System.out.println();        
    }
    System.out.println("-----------------------------------------------------------------------------------------------------------------------");
  }
}
