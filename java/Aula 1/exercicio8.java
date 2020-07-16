/* Escreva um programa que calcule a idade que uma pessoa, solicitando mês e ano do seu
nascimento. Assuma que o dia do seu nascimento já passou caso o mês atual seja igual ao mês do
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