public class Atividade1
{
  public static void main (String[] args) 
  {
    double a=0;
    //variavelde a de numeros quebrados
    double b=0;
    //variavelde b de numeros quebrados
    int quantidade=0;
    //variavel que representa quantidade
    int codigo=0;
    //variavel que representa o codigo

    quantidade=Entrada.leiaInt("digite a quantidade de livros que deseja comprar");
    //a variavel quantidade esta sendo lida aqui
    a=(0.25+quantidade+7.50);
    //formula para variavel a
    b=(0.50+quantidade+2.50);
    //formula para variavel b
 
    System.out.println("na escolha a voce tem;"+a+codigo+"reais de desconto");
    // aqui aparecera uma opcao de desconto
    System.out.println("na escolha b voce tem;"+b+codigo+"reais de desconto");
    // aqui aparecera outra opcao de desconto
      
    codigo=Entrada.leiaInt("Digite 1 para opção A ou 2 para opçao B");
    //aqui a variavel codigo estao sendo lida

  if(codigo==1)
    //se codigo for igual a 1 entao
    {
     System.out.println("voce tem R$"+a+" Reais de desconto");
     //aqui vai mostrar o valor de a
    }
  if(codigo==2) 
    // se codigo for igual a 2 entao
  {
   System.out.println("voce tem R$"+b+" Reais de desconto");
   //aqui vai mostrar o valor de b
  }else{
    //senao
   System.out.println("Nao existe essa opção");
   //aqui mostrara que nao existe opcao
  }
  }
}
    

 
    
    
    
    
    