/* Teoria Procedimento: Procedimento é associado ao objeto, ou seja, uma sequência de 
 instruções que fazem parte do programa e que podem ser acessadas de outros lugares.
 
  Teoria função: Função então, remete a algo que retorna um valor, de forma análoga à matemática. 
 Seria um conjunto de instruções que retorna um valor ao final. Uma função é um procedimento, 
 mas com o detalhe do retorno a mais.
 
  Simplificando: É um procedimento associado a um objeto, podendo também ser chamado de função membro.
 Métodos estáticos seriam os associados a uma classe.
 
 
 
 QUESTÃO:
 
  Faça um algoritmo que leia o nome, sobrenome e o sexo da pessoa. Converta as primeiras letras para maiúscula 
 caso necessário. Ao final exiba a seguinte frase: Sr. Xxxxx Xxxxx, seu e-mail é xxxxx.xxxxx@universo.univates.br.
 */




public class E_Mail {
  public static void main (String args[]) {
    
    //Declaração de variáveis
    String nome;
    String nome1;
    String sobrenome;
    String sobrenome2;
    char sexo;
    String email;
    
    //Leitura do Nome e Sobrenome
    nome = Entrada.leiaString ("Digite seu nome: ");
    sobrenome = Entrada.leiaString ("Digite seu sobrenome: ");
    
    //Converte primeira letra do Nome para maiúscula
    nome1 = nome.substring(0,1).toUpperCase() + nome.substring(1);
    
    //Converte primeira letra do Sobrenome para maiúscula    
    sobrenome2 = sobrenome.substring(0,1).toUpperCase() + sobrenome.substring(1);
    
    //Leitura do Sexo da pessoa
    sexo = Entrada.leiaChar ("Sexo (m ou f): ");
    
    //Variável email recebe função
    email = geraEmail (nome, sobrenome);
    
    //Condições que verificam se é Másculino ou Feminino 
    if (sexo == 'm') {
      System.out.printf ("Sr. "+nome1+" "+sobrenome2+", seu e-mail é "+email);
      System.out.println();
    } else if (sexo == 'f') {
      System.out.printf ("Sra. "+nome1+" "+sobrenome2+", seu e-mail é "+email);
      System.out.println();
    } else {
      System.out.println ("Sexo inválido!");
      System.out.println();
    }
  }  
  
  //Iniciando função geraEmail
  public static String geraEmail (String nome, String sobrenome) {
    String e;
    e = (nome+"."+sobrenome+"@universo.univates.br");
    return e;
  }
} 