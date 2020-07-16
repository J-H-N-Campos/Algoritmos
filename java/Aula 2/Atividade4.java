public class Atividade4
{
  public static void main (String[] args)
  {
    int idade=Entrada.leiaInt("digite a idade");
    int atual=Entrada.leiaInt("digite o ano atual");
    int nascimento=Entrada.leiaInt("digite o ano de nascimento");
    int x=(atual-nascimento);
      if (idade==x){
    System.out.println("idade confere"+" "+x);
    }else{
      System.out.println("idade não confere"+" "+x);
    }
  }
}
      