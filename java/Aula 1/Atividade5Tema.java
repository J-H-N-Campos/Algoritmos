/*Ler dois valores A e B, efetuar a troca dos valores de forma que a
vari�vel A passe a possuir o valor da vari�vel B e que a vari�vel B
passe a possuir o valor de A. Apresentar os valores trocados*/
public class Atividade5Tema
{
  public static void main (String[] args)
  {
    int a=Entrada.leiaInt("digite o valor A");
    int b=Entrada.leiaInt("digite o valor B");
    int aux=a;
    a=b;
    b=aux;
     
      System.out.println("resposta"+" "+a);
      System.out.println("resposta"+" "+b);
    
    
  }
}