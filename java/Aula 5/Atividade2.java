public class Atividade2
{
  public static void main(String args[])
  {
    
int codigo=0;
double valor=0;
double pagamento=0;

System.out.println("tipos de pagamentos");
System.out.println("1-pagamento a vista - 5% do desconto");
System.out.println("2-pagamento a 3 parcelas - nenhuma alteracao");
System.out.println("3-pagamento a 5 parcelas - acrescimo de 2% ");
System.out.println("4-pagamento de 10 parcelas - acrescimo de 8% ");

pagamento=Entrada.leiaDouble("digite o valor");
codigo=Entrada.leiaInt("Digite as suas opcoes;");

if (codigo==1) 
{
   valor=pagamento*0.05;
}else{
  if (codigo==2) 
         valor=pagamento/3;
  }
    if (codigo==3)
    {
      valor=pagamento*0.02;
    }
      if(codigo==4)
      {
                  valor=pagamento*0.08;
      }
System.out.println("seu pagamento;");
System.out.println("suas compras serao;"+valor);
  }
}