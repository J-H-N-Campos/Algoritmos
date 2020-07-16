/* Teoria Procedimento: Procedimento � associado ao objeto, ou seja, uma sequ�ncia de 
 instru��es que fazem parte do programa e que podem ser acessadas de outros lugares.
 
  Teoria fun��o: Fun��o ent�o, remete a algo que retorna um valor, de forma an�loga � matem�tica. 
 Seria um conjunto de instru��es que retorna um valor ao final. Uma fun��o � um procedimento, 
 mas com o detalhe do retorno a mais.
 
  Simplificando: � um procedimento associado a um objeto, podendo tamb�m ser chamado de fun��o membro.
 M�todos est�ticos seriam os associados a uma classe.
 
 
 
 QUEST�O:
 
  Fa�a um algoritmo que leia o nome, sobrenome e o sexo da pessoa. Converta as primeiras letras para mai�scula 
 caso necess�rio. Ao final exiba a seguinte frase: Sr. Xxxxx Xxxxx, seu e-mail � xxxxx.xxxxx@universo.univates.br.
 */




public class E_Mail {
  public static void main (String args[]) {
    
    //Declara��o de vari�veis
    String nome;
    String nome1;
    String sobrenome;
    String sobrenome2;
    char sexo;
    String email;
    
    //Leitura do Nome e Sobrenome
    nome = Entrada.leiaString ("Digite seu nome: ");
    sobrenome = Entrada.leiaString ("Digite seu sobrenome: ");
    
    //Converte primeira letra do Nome para mai�scula
    nome1 = nome.substring(0,1).toUpperCase() + nome.substring(1);
    
    //Converte primeira letra do Sobrenome para mai�scula    
    sobrenome2 = sobrenome.substring(0,1).toUpperCase() + sobrenome.substring(1);
    
    //Leitura do Sexo da pessoa
    sexo = Entrada.leiaChar ("Sexo (m ou f): ");
    
    //Vari�vel email recebe fun��o
    email = geraEmail (nome, sobrenome);
    
    //Condi��es que verificam se � M�sculino ou Feminino 
    if (sexo == 'm') {
      System.out.printf ("Sr. "+nome1+" "+sobrenome2+", seu e-mail � "+email);
      System.out.println();
    } else if (sexo == 'f') {
      System.out.printf ("Sra. "+nome1+" "+sobrenome2+", seu e-mail � "+email);
      System.out.println();
    } else {
      System.out.println ("Sexo inv�lido!");
      System.out.println();
    }
  }  
  
  //Iniciando fun��o geraEmail
  public static String geraEmail (String nome, String sobrenome) {
    String e;
    e = (nome+"."+sobrenome+"@universo.univates.br");
    return e;
  }
} 