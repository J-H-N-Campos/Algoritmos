algoritmo "semnome"
// Função :
// Autor :
// Data : 30/04/2019
// Seção de Declarações
 //Fazer um programa que leia dois vetores A e B, de dimensão 8, e realize a troca dos elementos
//destes vetores. Ou seja, após a execução do programa o vetor B deverá conter os valores
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


// Seção de Comandos 
fimalgoritmo
