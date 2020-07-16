public class Atividade5
{
  public static void main (String[] args)
  {
    int[] vetor=new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
    int[] vetora=new int[]{20,21,22,23,24,25,26,27,28,29};
    
    for(int i=0; i<15; i++)
    {
      vetor[i]=Entrada.leiaInt("digite um numero de 1 ate 15 para as matriculas dos alunos que cursam logica da programacao");
        if (vetor[i]>15)
      {
        System.out.println("numero da matricula invalido");
      }
        if (vetor[i]<1)
        {
          System.out.println("numero da matricula invalido");
        }
                           
      System.out.println("Numeros das matriculas dos alunos que cursam logica da programacao:"+vetor[i]);
    }
     for(int i=0; i<10; i++)
    {
      vetora[i]=Entrada.leiaInt("digite um numero de 1 ate 10 para as matriculas dos alunos que cursam logica em um vetor");
        if (vetor[i]>29)
      {
        System.out.println("numero da matricula invalido");
      }
        if (vetor[i]<20)
        {
          System.out.println("numero da matricula invalido");
        }
     System.out.println("Numeros das matriculas dos alunos que cursam logica da programacao:"+vetora[i]);
    }
  }
}
      
      