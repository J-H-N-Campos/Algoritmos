/* Faça um programa que leia 50 elementos inteiros de um vetor e determine quantos elementos
não repetidos (diferentes) existem neste vetor.*/
public class Atividade3
{
  public static void main(String args[])
  {
    //Declara e inicializa as vari?veis necess?rias
    int[] vet = new int[5];
    int[] rep = new int[5];
    int ind1 = 0;
    int ind2 = 0;
    int oco;
    //Preenche as cinquenta posi??es do vetor aleatoriamente e imprime o vetor
    while (ind1 < 5){
      /*vet[ind1] = (int)(Math.random()*10)+1;
      System.out.println(vet[ind1]);*/
      vet[ind1] = Entrada.leiaInt ("Digite um elemento para o vetor, posi??o: "+ind1+": ");
      ind1++;
    }
    //apresentando o vetor
      while (ind1 < 5){
     System.out.println(vet[ind1]);
       ind1++;
    }
    //Preenche o vetor "rep" com a quantidade de ocorr?ncias de cada ?ndice do vetor "vet"
    ind1 = 0;
    while (ind1 < 5){
      ind2 = 0;
      oco = 0;
      while (ind2 < 5) {
        if (vet[ind1] == vet[ind2]) {
          oco++;
        }
        ind2++;
      }
      rep[ind1] = oco - 1;
      ind1++;
    }
    //Verifica a quantidade de elementos diferentes e imprime esta informa??o
    ind1 = 0;
    oco = 0;
    while (ind1 < 5){
      if (rep[ind1] == 0){
        oco++;
      }
      ind1++;
    }
    System.out.println("Existem "+oco+" elementos DIFERENTES no vetor.");
  }
}