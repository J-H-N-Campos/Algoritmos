public class Atividade2
{
  public static void main(String[] args)
  {
      char[] vetorA = new char[5];
      Double[] vetorB = new Double[10];
      String[] vetorC = new String[12];
      
   System.out.printf("Digite em ordem as letras vogais do alfabeto: ");
  for (int i=0;i<5;i++){
  vetorA[i] = Entrada.leiaChar();
 }
  for (int i=0;i<10;i++){
 System.out.printf("Digite uma altura: ");
 vetorB[i] = Entrada.leiaDouble();
 }
  for (int i=0;i<12;i++){
 System.out.printf("Digite em ordem o nome dos meses do ano: ");
 vetorC[i] = Entrada.leiaString();
 }
   System.out.println("As letras vogais do alfabeto são:");
for (int i=0;i<5;i++){
 System.out.print(vetorA[i]+" ");
 }
   System.out.println();
for (int i=0;i<10;i++){
 System.out.println("A altura da "+i+"° pessoa é: "+vetorB[i]);
 }
System.out.println();
 System.out.println("Os meses do ano são:");
for (int i=0;i<12;i++){
 System.out.print(vetorC[i]+" ");
 }
    System.out.println();
 }
}
       
     
       
        
        
      
      
      
      
    