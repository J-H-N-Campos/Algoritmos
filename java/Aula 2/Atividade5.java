public class Atividade5
{
  public static void main (String[] args)
  {
    int num=Entrada.leiaInt("digite um numero");
    if (num % 2==0){
      num=(num*2);
    System.out.println("numero par"+num);
  }else{
    System.out.println("numero impar"+num);
  }
}
}