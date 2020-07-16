public class Exercicio1
{
  public static void main (String[] args)
  {
    char sexo=0;
    double altura=0;
    double peso=0;
    int cont=0;
    int cont1=0;
    int cont2=0;
    double pih=0;
    double pim=0;
        while (cont<5)
      {
          peso=Entrada.leiaDouble("digite o peso");
        altura=Entrada.leiaDouble("Digite a altura");
        sexo=Entrada.leiaChar("digite o sexo");
        if (sexo=='m')
        {
          cont1++;
        }else{
          cont2++;
        }
        pih=72.7*altura-58;
        pim=62.1*altura-44.7;
        {
          cont++;
        }
        System.out.println("peso ideal para homens;"+pih);
        System.out.println("peso ideal para mulheres;"+pim);
        }
  }
}
          
        
          
    