algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 30/04/2019
// Se��o de Declara��es
 //Fazer um programa que leia dois vetores A e B, de dimens�o 8, e realize a troca dos elementos
//destes vetores. Ou seja, ap�s a execu��o do programa o vetor B dever� conter os valores
//fornecidos para o vetor A, e vice-versa.
var
a,b:vetor [1..2] de inteiro
i,aux:inteiro
inicio
para i de 1 ate 2 passo 1 faca
escreval ("digite o valor de A")
leia (a[i])
escreval ("digite o valor de B")
leia (b[i])
fimpara
para i de 1 ate 2 passo 1 faca
aux<-(a[i])
a[i]<-(b[i])
b[i]<-(aux)
fimpara
para i de 1 ate 2 passo 1 faca
escreval ("os valores trocados sao:" ,a[i])
escreval ("os valores trocados sao:" ,b[i])
fimpara


// Se��o de Comandos 
fimalgoritmo
