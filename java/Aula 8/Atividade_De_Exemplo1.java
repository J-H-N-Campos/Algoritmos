public class Atividade_De_Exemplo1{
 public static void main(String args[]){

 double soma;
 double temp;
 int contador;

 temp = 0;
 soma = 0;
 contador = 0;

 while(contador < 5){
temp = Entrada.leiaDouble ("Digite uma nota: ");
soma = soma + temp;
contador++;
 }

 temp = soma/5;

 System.out.println("A média é "+temp);
 }
} 