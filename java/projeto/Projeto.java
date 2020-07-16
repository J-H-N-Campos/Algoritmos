public class Projeto{
  public static void main(String args[]){
    //variavel "opcao" inteiro
    int opcao = 5;
    //abertura de prints para as opcoes e o reconhecimento da calculadora
    System.out.println("programa calculadora");
    System.out.println("   |Projetada por Felipe Fritz Franceschi e Jo�o De Campos 2019|");
    //leitura da variavel "opcao"
    opcao = Entrada.leiaInt("Bem - Vindo ao programa \n digite um numero entre [1-4] para entrar no menu");
    //variaveis double
    double x1, y2 = 0.0d;
    //variaveis com os comandos da calculadora
    double resultado = 0.0d;
    double somar = 0.0d;
    double multiplicar = 0.0d;
    double dividir = 0.0d;
    double subtrair = 0.0d;
    //variavel inteira para sair, no caso, sair do programa
    int Saida = 0;
    //abertura do laco "while", se numero for diferente que 5, ele vai ler a entrada e simular uma calculadora,caso contrario, ele vai sair do programa
    while (opcao!=5){
      opcao = Entrada.leiaInt("Informe Uma Op��o Para Executar � Calculadora [1-5] \n\n|MENU DA CALCULADORA| \n 1� - Somar \n 2� - Multiplicar \n 3� - Dividir \n 4� - Subtrair \n 5� - Sair Do Programa"); 
      //o comando switch verifica uma variavel e age de acordo com seus cases
      switch(opcao){
        //os cases s�o as possibilidades de resultados que s�o obtidos por switch, sendo assim o comando switch vai controlar os resultados obtidos pelo case
        case 1 :
        { 
          //leitura do x1 e y2 com valores para adicoes
          x1 = Entrada.leiaDouble("informar o primeiro valor para a adi��o");
          y2 = Entrada.leiaDouble("informar o segundo valor para a adi��o");
          //print na tela do resultado e a formula da adicao
          resultado = somar + (x1 + y2);
          System.out.println("resultado soma = " +resultado);
          //comando break ele vai parar e determinar uma quebra de estrutura, ou seja, sem necessidade de criar um novo "while" ou "for"
          break;
        }
        case 2 :
        { 
          //leitura do x1 e y2 com valores para multiplicacoes
          x1 = Entrada.leiaDouble("informar o primeiro valor para a multiplica��o");
          y2 = Entrada.leiaDouble("informar o segundo valor para a multiplica��o ");
          resultado = multiplicar + (x1 * y2);
          System.out.println("resultado multiplica��o = " +resultado);
          break;
        }
        case 3 :
        {  
          //leitura dos valores para a divisoes
          x1 = Entrada.leiaDouble("informar o primeiro valor para a divis�o");
          y2 = Entrada.leiaDouble("informar o segundo valor para a divis�o");
          resultado = dividir + (x1 / y2);
          System.out.println("resultado divis�o = " +resultado);
          break;
        }
        case 4 :
        {
          //leitura dos valores para as subtracoes
          x1 = Entrada.leiaDouble("informar o primeiro valor para a subtra��o");
          y2 = Entrada.leiaDouble("informar o segundo valor para a subtra��o");
          resultado = subtrair + (x1 - y2);
          System.out.println("resultado subtra��o = " +resultado);
          break;
        }
        case 5:
        {
          //leitura da opcao numero "5" para sair do programa
          System.out.println(Saida);
          System.out.println();
          break;
        }
      }
    }System.out.println("Obrigado por utilizar a Calculadora");
  }
//aqui esta todo o metodo para as formulas da calculadora
    public static double somar(double x1, double y2){
      return x1 + y2;
    }    
    public static double multiplicar(double x1, double y2){
      return  x1 * y2 ;
    }
    public static double dividir(double x1, double y2){
      return  x1 / y2;
    }
    public static double subtrair(double x1, double y2){
      return x1 - y2 ;
    }
    public static int somar1(int x, int y){
      return x + y;
    }    
    public static int multiplicar1(int x, int y){
      return x * y ;
    }
    public static int dividir1(int x, int y){
      return x / y;
    }
    public static int subtrair1(int x, int y){
      return x - y;
    }
    //saida do public void sempre retornando
    public void Saida(){
      return;
    }
}