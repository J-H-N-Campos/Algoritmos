/* Escreva um programa que solicite ao usuário a largura e a altura de uma parede em metros e
informe a quantidade de tijolos necessários para construir a parede.
Obs.: considerar medidas do tijolo 23 x 11 cm.*/
public class exercicio7{
  public static void main (String[] args){
      int altura=Entrada.leiaInt();
      int largura=Entrada.leiaInt();
      int area = altura*largura;
      int quantidade=area/23*11;
      System.out.println(quantidade);
      
    
  }
}
  
  