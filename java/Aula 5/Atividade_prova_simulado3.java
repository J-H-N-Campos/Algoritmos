/*A professora Ana Paula terminou o semestre e já tem a nota final de todos os alunos
computadas e registradas em sua folha de chamada. Agora ela deseja analisar melhor
o desempenho geral da turma e quer fazer alguns cálculos estatísticos. O primeiro
desejo dela é calcular a média de notas geral da turma. Ajude ela a resolver esse
problema fazendo um sistema onde ela possa digitar cada uma das notas (uma a
uma) e depois (ao final) saber qual é a média geral da turma.*/
public class Atividade_prova_simulado3
{
  public static void main (String[] args)
  {
  
    double nota1=0;
    double nota2=0;
    double nota3=0;
    double media=0;
    int cont=0;
    while (cont>10)
    {
    nota1=Entrada.leiaDouble("digite a nota 1);
    nota2=Entrada.leiaDouble("digite a nota 2);
    nota3=Entrada.leiaDouble("digite a nota 3");
    media=(nota1+nota2+nota3)/3;
    cont++;
                             }
    System.out.println("medida da turma e"+media);
    }
}
 
 
                             
 
          
 
                               
      
    
    
    
    