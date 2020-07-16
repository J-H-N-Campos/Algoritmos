algoritmo "semnome"
// Função :
// Autor :
// Data : 30/04/2019
// Seção de Declarações 
 //Faça um programa que leia 50 elementos inteiros de um vetor e determine quantos elementos
//não repetidos (diferentes) existem neste vetor
var
a,b:vetor [1..50] de inteiro
i:inteiro
inicio
para i de 1 ate 50 passo 1 faca
escreval ("digite um numero")
leia (a[i])
fimpara
para i de 1 ate 50 passo 1 faca
escreval ("digite outro numero")
leia (b[i])
fimpara
para i de 1 ate 1 passo 1 faca
se (a[i])<>(b[i]) entao
escreval ("quantos numeros sao diferentes:",a[i],b[i])
fimse
fimpara


// Seção de Comandos 
fimalgoritmo
