/* Escreva um programa que calcule a idade que uma pessoa, solicitando m�s e ano do seu
nascimento. Assuma que o dia do seu nascimento j� passou caso o m�s atual seja igual ao m�s do
nascimento.*/
public class exercicio8{
  public static void main (String[] args){
    int mes=Entrada.leiaInt("mes:");
      int ano=Entrada.leiaInt("ano");
     int anoatual=2019;
     int idade= anoatual-ano;
     if (mes>3) {
       idade=idade-1;
     }
     System.out.println(idade);
      
  }
}