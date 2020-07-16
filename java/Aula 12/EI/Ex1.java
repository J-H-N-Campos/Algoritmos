//esse programa constroi uma matriz [5][5].
//ele fara a leitura de 5 vetores, e dps ira, armazenar em um vetor auxiliar de 25 posicoes.
//ele vai por os numeros em ordem crescente na matriz, armazenando no vetor auxiliar da matriz, depois ele vai printar os resultados na tela.
public class Ex1{
  public static void main (String[] args){
    //variaveis de numeros inteiros
    int v1[] = new int[5];
    int v2[] = new int[5];
    int v3[] = new int[5];
    int v4[] = new int[5];
    int v5[] = new int[5];
    int m[][] = new int[5][5];
    int aux[] = new int[25];
    int x = 0;
    //leitura dos 5 vetores
    for (int i=0;i<5;i++){
      v1[i] = Entrada.leiaInt("Digite um valor para o primeiro vetor:");
      v2[i] = Entrada.leiaInt("Digite um valor para o segundo vetor:");
      v3[i] = Entrada.leiaInt("Digite um valor para o terceiro vetor:");
      v4[i] = Entrada.leiaInt("Digite um valor para o quarto vetor:");
      v5[i] = Entrada.leiaInt("Digite um valor para o quinto vetor:");
    }
    //armazenamento dos vetores no vetor auxiliar de 25 posicoes
    for (int i=0;i<5;i++){
      aux[i] = v1[i];
      aux[i+5] = v2[i];
      aux[i+10] = v3[i];
      aux[i+15] = v4[i];
      aux[i+20] = v5[i];
    }
    //ordem crescente
    for (int i=0;i<24;i++){
      for (int j=i+1;j<25;j++){
        if (aux[i]>aux[j]){
          x = aux[i];
          aux[i] = aux[j];
          aux[j] = x;
        }
      }
    }
    //armazenamento dos valores do vetor auxiliar na matriz
    for (int i=0;i<5;i++){
      m[0][i] = aux[i];
      m[1][i] = aux[i+5];
      m[2][i] = aux[i+10];
      m[3][i] = aux[i+15];
      m[4][i] = aux[i+20];
    }
    //apresenta os dados da matriz
    System.out.println("Matriz:");
    for (int i=0; i<5; i++){
      for (int j=0; j<5; j++){
        System.out.print( m[i][j]+"\t" );
      }
      System.out.println();
    }
  }
}
    