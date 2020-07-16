public class Atividade3 
{
 
    public static void main(String[] args) {
 
        double salario=0;
        double novoSalario=0;
        double diferencaSalario=0;
        int tempo=0;
        int codigo=0;
        System.out.println("digite para as opcoes");
        codigo=Entrada.leiaInt("1-gerente/ 2-engenheiro/3-tecnico/4-outros");
        salario=Entrada.leiaDouble("digite o salario do funcionario");
        tempo=Entrada.leiaInt("digite o tempo do funcionario");
        
        if (codigo==1)
        {
          System.out.println("o cargo e;"+codigo);
        }
            if (tempo>=5)
            {
                novoSalario = salario + (salario*10)/100;
            }
            if (tempo>=3)
            {
              novoSalario = salario + (salario*9)/100;
            }
            if (tempo<3)
            {
              novoSalario = salario + (salario*8)/100;
            }
            if (codigo==2)
            {
               System.out.println("o cargo e;"+codigo);
            }
            if (tempo>=5)
            {
                novoSalario = salario + (salario*11)/100;
            }
            if (tempo>=3)
            {
              novoSalario = salario + (salario*10)/100;
            }
            if (tempo<3)
            {
              novoSalario = salario + (salario*9)/100;
            }
 
           if (codigo==3)
           {
               System.out.println("o cargo e;"+codigo);
           }
               if (tempo>=5)
            {
                novoSalario = salario + (salario*12)/100;
            }
            if (tempo>=3)
            {
              novoSalario = salario + (salario*11)/100;
            }
            if (tempo<3)
            {
              novoSalario = salario + (salario*10)/100;
            }else
              if (codigo==4)
            {
                System.out.println("O cargo é outro;"+codigo);
            }
                novoSalario = salario + ((salario * 7) / 100);
diferencaSalario = novoSalario - salario;
System.out.println("O salario antigo e de " + salario);
System.out.println("O novo salario e de " + novoSalario);
System.out.println("A diferenca do salario e " + diferencaSalario + " Reais");
    }
}


