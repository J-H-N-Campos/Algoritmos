/*A professora Ana Paula terminou o semestre e j� tem a nota final de todos os alunos
computadas e registradas em sua folha de chamada. O que ela deseja saber agora �
qual o nome do aluno que obteve a maior e a menor nota final. Para auxiliar a
professora nessa tarefa, desenvolva um sistema que receba o nome e a nota final
todos os alunos e, no final, exiba o nome do aluno que tem a maior e a menor nota
final.*/
public class Atividade_prova_simulado4
{
  public static void main (String[] args)
  {
    double nf=0;
    int cont=0;
    int cont1=0;
    int cont2=0;
    while (cont>10)
    {
     String nome=Entrada.leiaString("digite o nome do aluno");
      nf=Entrada.leiaDouble("digite a nota do aluno");
      if (nf==10)
      {
        cont1++;
      }
      if (nf==0)
      {
        cont2++;
      }
      cont++;
    }
      System.out.println("aluno (a) com maior nota;"+cont1);
      System.out.println("aluno (a) com menor nota;"+cont2);
  }
}


      
