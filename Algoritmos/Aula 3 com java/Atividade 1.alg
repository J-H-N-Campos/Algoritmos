algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 30/04/2019
// Se��o de Declara��es 
//1) Seja um vetor inteiro de 9 elementos:
//a) preencher o vetor lendo a entrada do usu�rio (apenas valores maiores do que zero);
//b) imprimir os elementos do vetor em 1 linha, deixando 2 espa�os em branco entre cada
//elemento;
//c) liberar a primeira posi��o do vetor deslocando todos os valores em uma posi��o para a
//direita (o �ltimo valor ser� perdido nesse processo);
//d) somar o �ndice de cada elemento ao conte�do do mesmo;
//e) ler um valor e imprimir o n�mero de ocorr�ncias desse valor no vetor.
var
a:vetor [1..9] de inteiro
i:inteiro
inicio
para i de 1 ate 9 passo 1 faca
escreval ("digite um valor maior que zero")
leia (a[i])
fimpara
para i de 1 ate 1 passo 1 faca
escreval ("os numeros digitados sao:",a[1],"  ",a[2],"  ",a[3], "  ",a[4], "  ",a[5], "  ",a[6], "  ",a[7], "  ",a[8], "  ",a[9],)
fimpara
para i de 1 ate 1 passo 1 faca
escreval ("os numeros digitados sao:"," ", " " ,a[1],"  ",a[2],"  ",a[3], "  ",a[4], "  ",a[5], "  ",a[6], "  ",a[7], "  ",a[8],)
fimpara
para i de 1 ate 9 passo 1 faca
a[i]<-(a[i]*2)
escreval (" o valor:", a[i])
fimpara


// Se��o de Comandos 
fimalgoritmo
