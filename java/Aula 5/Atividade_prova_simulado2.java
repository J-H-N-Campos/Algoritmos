/*A professora Ana Paula quer calcular a nota final de um aluno de sua turma. Ela
aplicou 3 provas com notas de 1 até 10, mas a segunda e terceira tem peso 2.
Construa um software para ajudar a Ana Paula nesta tarefa. O programa deve solicitar
as 3 notas, calcular a média (considerando os pesos), exibir a média final e um a frase
“Parabéns, você está aprovado.” ou “Você precisa estudar mais. Sua nota não foi
suficiente para aprovação.”.*/
public class Atividade_prova_simulado2
                {
  public static void main (String[] args)
  {
    double nota1=0;
    double nota2=0;
    double nota3=0;
    double mediafinal=0;
    double median1e2=0;
    nota1=Entrada.leiaDouble("digite a nota1");
    nota2=Entrada.leiaDouble("digite a nota2");
    nota3=Entrada.leiaDouble("digite a nota3");
    
    median1e2=(nota1+nota2*2);
    mediafinal=(median1e2+nota3)/3;
    if (mediafinal>=6)
    {
      System.out.println("parabens voce esta aprovado");
    }
    if (mediafinal<6)
    {
      System.out.println("vc precisa estudar mais");
    }
  }
}
    