/*2) Ler idade e sexo de 15 pessoas e ap�s mostrar:
a) N�mero de pessoas do sexo masculino.
b) N�mero de pessoas do sexo feminino.
c) N�mero de pessoas com idade at� 30 anos.
d) N�mero de pessoas com idade igual ou superior a 60 anos. */
public class Atividade2
{
  public static void main (String[] args)
  {
    int x=0;
    int x1=0;
    int x2=0;
    int x3=0;
    int x4=0;
    while (x < 8)
    {
      System.out.println("valor de x;"+x);
      int id=Entrada.leiaInt("digite a idade");
    char sexo=Entrada.leiaChar("digite o sexo");
    if (sexo=='m')
    {
    
      x1++;
    }
      if (sexo=='f')
      {
      x2++;
    }
    
    
    if (id<=30) {
      x3++; 
      
    }else
      if (id>=60) {  
        x4++;
    }
    x++;
    }
    System.out.println("quantidade de sexo masculino;"+" "+x1);
    System.out.println("quantidade de sexo feminino;"+" "+x2);
    System.out.println("quantidade de pessoas com at� 30 anos;"+" "+x3);
    System.out.println("quantidade de pessoas com 60 anos ou mais;"+" "+x4);
  }
}
        
      
      