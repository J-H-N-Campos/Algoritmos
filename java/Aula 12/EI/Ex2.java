//o programa constroi uma matriz [10][3]
//a leitura dos 3 vetores para a matriz ser criada
//depois ele coloca o final com a primeira e terceira coluna em ordem crescente e a segunda em ordem decrescente
public class Ex2{
  public static void main(String args[]){
   
    //variaveis de numeros inteiros
    int a[] = new int[10];
     int b[] = new int[10];
      int c[] = new int[10];
    int [][] m = new int[10][3];
      int x = 0;
      //leitura de 3 vetores
      for (int i = 0; i<10; i++){
     
      a[i] = Entrada.leiaInt("Digite um valor inteiro para o vetor A de posicao: "+i);
      m[i][0] = a[i];
      b[i] = Entrada.leiaInt("Digite um valor inteiro para o vetor B de posicao: "+i);
      m[i][1] = b[i];
      c[i] = Entrada.leiaInt("Digite um valor inteiro para o vetor C de posicao: "+i);
      m[i][2] = c[i];
      
      }
       //troca o final da primeira coluna em ordem crescente
    for (int i = 0; i<10; i++){
       for (int j = 0; j<10; j++){
         if (m[i][0] < m[j][0]){
          x = m[i][0];
          m[i][0] = m[j][0];
          m[j][0] = x ;
         } 
         }
    }
       //troca o final da terceira coluna em ordem crescente
         for (int i = 0; i<10; i++){
       for (int j = 0; j<10; j++){
         if (m[i][2] < m[j][2]){
          x = m[i][2];
          m[i][2] = m[j][2];
          m[j][2] = x ;
         } 
         }
         }
         //troca o final da segunda coluna em ordem decrescente
         for (int i = 0; i<10; i++){
       for (int j = 0; j<10; j++){
         if (m[i][1] > m[j][1]){
          x = m[i][1];
          m[i][1] = m[j][1];
          m[j][1] = x ;
         } 
         }
         }
         //apresenta os dados da matriz
       System.out.print("A matriz 10x3 final com a primeira e terceira coluna em ordem crescente e a segunda em ordem decrescente e: ");
        System.out.println(); 
       
        for (int i = 0; i<10; i++){
       for (int j = 0; j<3; j++){  
      System.out.print(m[i][j]+"\t ");
      
  }
       System.out.println();
}
       
  }
}