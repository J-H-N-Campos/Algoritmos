/* [Ci�ncia dos Computadores - Tremblay-Bunt] Dado um vetor A de N n�meros reais, obter a maior
diferen�a entre dois elementos consecutivos deste vetor. */

public class Atividade4
{
  public static void main (String[] args)
  {
    int [] vetor={1,2,3,4,500};
    int maior= vetor[1]-vetor[0];
    for (int i=0; i <vetor.length -1; i++)
    {
      if (maior<(vetor[i+1]-vetor[i]))
      {
        maior=(vetor[i+1]-vetor[i]);
      }
    }
    System.out.println("maior:"+maior);
  }
}
               