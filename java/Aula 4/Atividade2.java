public class Atividade2
{
  public static void main (String[] args)
  {
    double media=0;
    char sexo=0;
    int na=0;
    int idade=0;
    double altura=0;
    int cont=0;
    int cont1=0;
    int cont2=0;
    int cont3=0;
    int cont4=0;
    while (cont>4)
    {
      idade=Entrada.leiaInt("digite a idade");
      sexo=Entrada.leiaChar("digite o sexo");
      altura=Entrada.leiaDouble("digite a altura");
      if (idade<18)
      {
        cont1++;
      }else 
      if (idade>25)
      {
        cont2++;
      }
        if (sexo=='m' && sexo=='M')
        {
          cont3++;
        }else{
          cont4++;
            }
        media=cont3+altura;
        {
          cont++;
    System.out.println("media da altura do sexo masculino;"+media);
    System.out.println("numero de alunos com mais de 25 anos;"+cont2);
    System.out.println("alunos com idade inferior a 18 anos:"+cont1);
        }
    }
  }
}