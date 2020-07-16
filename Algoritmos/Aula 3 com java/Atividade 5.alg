algoritmo "semnome"
// Função :
// Autor :
// Data : 01/05/2019
// Seção de Declarações 
//Escrever um programa que lê 10 nomes, os
//armazena em um vetor, depois os imprime na ordem inversa de leitura.
var
a:vetor [1..10] de caracter
i:inteiro
inicio
para i de 1 ate 10 passo 1 faca
escreval ("digite um nome")
leia (a[i])
fimpara
para i de 1 ate 10 passo 1 faca
escreval ("nomes inversos:", a[10],",",a[9],",",a[8],",",a[7],",",(a[6]),a[5],",",a[4],",",a[3],",",a[2],",",a[1])
fimpara


// Seção de Comandos 
fimalgoritmo
