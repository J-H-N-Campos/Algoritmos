public class atividade8{
  public static void main (String args[]){
    double num1,num2;
    String opr;
    
    opr = Entrada.leiaString ("escolha a opera��o: +, -, *, /");
    if (opr.equals("+")){
      num1 = Entrada.leiaDouble ("digite o primeiro num");
      num2 = Entrada.leiaDouble ("digite o seg num");
      System.out.println ("o resultado �"+ (num1+num2));
    }else  if (opr.equals("-")){
      num1 = Entrada.leiaDouble ("digite o primeiro num");
      num2 = Entrada.leiaDouble ("digite o seg num");
      System.out.println ("o resultado �"+ (num1-num2));
    }else  if (opr.equals("*")){
      num1 = Entrada.leiaDouble ("digite o primeiro num");
      num2 = Entrada.leiaDouble ("digite o seg num");
      System.out.println ("o resultado �"+ (num1*num2));
    }else  if (opr.equals("/")){
      num1 = Entrada.leiaDouble ("digite o primeiro num");
      num2 = Entrada.leiaDouble ("digite o seg num");
      System.out.println ("o resultado �"+ (num1/num2));
      }
  }
}