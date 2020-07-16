//package Aula_14;
import java.util.Scanner;
/**
 *
 * @author guilherme.w
 */
public class Calculadora {
     public static int soma(int x,int y){
        return x+y;
    }
      public static int subtracao(int x,int y){
        return x-y;
    }
       public static int multiplicacao(int x,int y){
        return x*y;
    }
        public static int divisao(int x,int y){
        return x/y;
    }
        public static double potencia(double x,double y){
        return (Math.pow(x, y));
    }
        public static double raiz(double x){
        return (Math.sqrt(x));
    }
////////////////////////////////////////////////////////////////////////////////
    public static void main (String args[]) {
        Scanner s = new Scanner (System.in);
        int a,b;
        double c,d;
        int tipo;
        System.out.print("Digite a operação que você deseja fazer:");
        System.out.print("Soma [1] /");
        System.out.print("Subtração [2] /");
        System.out.print("Multiplicação [3] /");
        System.out.print("Divisão [4] /");
        System.out.print("Potência [5] /");
        System.out.print("Raiz Quadrada [6] ");
        tipo = s.nextInt();
////////////////////////////////////////////////////////////////////////////////
if (tipo==1){
    System.out.println("Informe o primeiro valor");
    a = s.nextInt();
    System.out.println("Informe o segundo valor");
    b = s.nextInt();
    System.out.println(a+" + "+b+" = "+soma(a,b));
}
if (tipo==2){
    System.out.println("Informe o primeiro valor");
    a = s.nextInt();
    System.out.println("Informe o segundo valor");
    b = s.nextInt();
    System.out.println(a+" - "+b+" = "+subtracao(a,b));
}
if (tipo==3){
    System.out.println("Informe o primeiro valor");
    a = s.nextInt();
    System.out.println("Informe o segundo valor");
    b = s.nextInt();
    System.out.println(a+" * "+b+" = "+multiplicacao(a,b));
}
if (tipo==4){
    System.out.println("Informe o primeiro valor");
    a = s.nextInt();
    System.out.println("Informe o segundo valor");
    b = s.nextInt();
    System.out.println(a+" / "+b+" = "+divisao(a,b));
}
if (tipo==5){
    System.out.println("Informe o primeiro valor");
    c = s.nextDouble();
    System.out.println("Informe o valor do expoente");
    d = s.nextDouble();
    System.out.println(c+"^"+d+" = "+potencia(c,d));
}
if (tipo==6){
    System.out.println("Informe o valor");
    c = s.nextDouble();
    System.out.println("Raiz de "+c+" = "+raiz(c));
}
    } 
}
