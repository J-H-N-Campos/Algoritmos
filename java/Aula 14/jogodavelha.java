//java entrada
import java.util.Scanner;
public class jogodavelha
  //funcoes e variaveis usado no java
{
  //matriz usada "mesa" como string
    static String[][] mesa = new String[3][3];
    
    public static boolean jogo(String j , int x, int y)
    {
      //variavel para a funcao boolean, como funcao invalida, no caso, numeros com virgulas ou maiores que o proprio limite, sendo ela trada com o comando false
       boolean vence = false;
       //variavel mesa sendo usada como x e y, para criar a primeira condicao
       //metodo equals que esta sendo utilizada para garantir que dois objetosdo do mesmo tipo, possam ser considerados iguais para comparações
       //o comando && e || tambem usados para comparar e afirmar o valor e o vencedor
       if(x==0 && y==0)
       {
           if((mesa[0][1].equals(j) && mesa[0][2].equals(j)) ||
              (mesa[1][0].equals(j) && mesa[2][0].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[2][2].equals(j)))
             //true comando "verdadeiro", sendo assim, esse comando tambem vai tratar a variavel vence
           {
               vence = true;
           }
       }
       //agora o y tem valor 1 para a segunda condicao ser na proxima coluna
       if(x==0 && y==1)
       {
           if((mesa[0][0].equals(j) && mesa[0][2].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[2][1].equals(j))){
               vence = true;
           }
       }
       //terceira condicao com o y tendo valor 2 trocando de coluna
       if(x==0 && y==2)
       {
           if((mesa[0][1].equals(j) && mesa[0][0].equals(j)) ||
              (mesa[1][2].equals(j) && mesa[2][2].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[2][0].equals(j))){
               vence = true;
           }
       }
       //quarta condicao com o x tendo valor 1 e trocando de linha
       if(x==1 && y==0)
       {
           if((mesa[0][0].equals(j) && mesa[2][0].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[1][2].equals(j))){
               vence = true;
           }
       }
       // quinta condicao com o x tendo valor 1 e y valor 1 trocando de linha e coluna
       if(x==1 && y==1)
       {
           if((mesa[0][1].equals(j) && mesa[2][1].equals(j)) ||
              (mesa[1][0].equals(j) && mesa[1][2].equals(j)) ||
              (mesa[0][0].equals(j) && mesa[2][2].equals(j)) ||
              (mesa[0][2].equals(j) && mesa[2][0].equals(j))){
               vence = true;
           }
       }
       //sexta condicao com o x tendo valor 1 e y valor 2
       if(x==1 && y==2)
       {
           if((mesa[0][2].equals(j) && mesa[2][2].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[1][0].equals(j))){
               vence = true;
           }
       }
       //setima condicao com o x tendo valor 2 e o y 0
       if(x==2 && y==0)
       {
           if((mesa[0][0].equals(j) && mesa[1][0].equals(j)) ||
              (mesa[2][1].equals(j) && mesa[2][2].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[0][2].equals(j))){
               vence = true;
           }
       }
       //oitava condicao com o x tendo valor 2 e y 1=valor 1
       if(x==2 && y==1)
       {
           if((mesa[2][0].equals(j) && mesa[2][2].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[0][1].equals(j))){
               vence = true;
           }
       }
       //nona condicao com o x e y tendo os mesmos valores, no caso, o 2
       if(x==2 && y==2)
       {
           if((mesa[2][1].equals(j) && mesa[2][0].equals(j)) ||
              (mesa[1][2].equals(j) && mesa[0][2].equals(j)) ||
              (mesa[1][1].equals(j) && mesa[0][0].equals(j))){
               vence = true;
           }
       }
       //aqui o comando "return" vai retornar para o metodo
       return vence;
    }
    //nova classe aberta
    public static void main(String[] args) 
    {
      //variaveis x,y,jogador,jogadas,vence
        int x = 0;
        int y = 0;
        int jogador = 1;
        boolean vence = false;
        int jogadas = 0;
        //lacos de repeticoes abertos para a matriz
        for (int i = 0; i < 3; i++) 
        {
          //mesa[i][j] para linha e coluna
            for (int j = 0; j < 3; j++) 
            {
                mesa[i][j] = "-";
            }
        }
        //laco de repeticao com o comando && para por mais uma variavel e comparar ela
        //"System" para printar e mostrar na tela a linha x
        //variavel x usada com o comando next, para ver se ainda tem registros do verdadeiro ou falso
        //o operador !, vai inveter o valor para Falso se for falso, ou verdadeiro se for verdadeiro.
        while (!vence && jogadas < 9) 
        {
            java.util.Scanner s = new Scanner(System.in);
            System.out.println("X (Linha): ");
            x = s.nextInt();
            while(x<0 || x>2)
              //novo laco aberto
              //novo "System"
              //variavel s
              //variavel x
            {
                System.out.println("Índice da linha inválido\nX (Linha): ");
                s = new Scanner(System.in);
                x = s.nextInt();
            }
            //aqui o y sera printado na tela
            s = new Scanner(System.in);
            System.out.println("Y (Coluna): ");
            y = s.nextInt();
            //laco novo aberto para o y
            //se o indice for maior que a matriz ou menor que 0 a coluna sera invalida
            while(y<0 || y>2)
            {
                System.out.println("Índice da coluna inválido\nY (Coluna): ");
                s = new Scanner(System.in);
                y = s.nextInt();
            }
            boolean jogada = false;
            //condicao aberta para jogar 1
            if (jogador == 1) 
            {
              //comando "try" que serve para introduzir todas as linhas de código que podem vir, ou seja,tratando excecoes.
                try 
                {
                  //condicao aberta com o operador ! e o metodo equals usando as variaveis x e y
                  //variaveis jogada e vence aberta com o comando true e printando os resultados
                    if (!mesa[x][y].equals("X") && !mesa[x][y].equals("Y")) 
                    {
                        mesa[x][y] = "X";
                        jogada = true;
                        jogadas++;
                        vence = jogo("X", x, y);
                        //caso contrario, a posicao ja foi preenchida, com o comando "/n" para imprimir duas vezes a linha
                    } else {
                        System.out.println("\n Posição já preenchida. \n");
                        jogada = false;
                    }
                    //comando "catch" usado como um bloco com os comandos:"try,false,true, que desviarao para o catch correspondente
                    //"exception,e.printStackTrace" e outros comandos citados acima, funcionam como um bloco para para tratar possiveis erros
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
            } else {
              
                try {
                  //nova condicao aberta repetindo td que a condicao passa faz, mas para o outro jogador que representa "o"
                    if (!mesa[x][y].equals("X") && !mesa[x][y].equals("Y")) 
                    {
                        mesa[x][y] = "O";
                        jogada = true;
                        jogadas++;
                        vence = jogo("O", x, y);
                    } else {
                        System.out.println("\nPosição já preenchida.");
                        jogada = false;
                    }
                } catch (Exception e) 
                {
                    e.printStackTrace();
                }
            }
            //condicao aberta para jogador 1 e 2 sendo comparados
            if (jogada && !vence) {
                if (jogador == 1) {
                    jogador = 2;
                } else {
                    jogador = 1;
                }
            }
            //string matriz para repetir a mesma frase no mesmo lugar
            //lacos de repeticoes abertos para a matriz somar com a varaivel mesa[i][j]
            String matriz = "\n";
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    matriz += mesa[i][j] + " ";
                }
                matriz += "\n";
            }
            //Printara que o "jogador foi vencedor" ou printara que o "jogo terminou empatado"
            System.out.println(matriz);
        }
        if(vence)
        {
            System.out.println("Jogador "+jogador+" foi o vencedor.");
        }else{
          
            System.out.println("Jogo terminou empatado.");
        }
    }
}
//fechada e concluida todas as condicoes e chaves abertas