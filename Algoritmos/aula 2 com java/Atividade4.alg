algoritmo "semnome"
// Função :
// Autor :
// Data : 25/04/2019
// Seção de Declarações 
var
A:vetor [1..20] de real
B:vetor [1..30] de real
C:vetor [1..50] de real
I:inteiro
inicio
para I de 1 ate 20 passo 1 faca
escreval ("digite um num para A:")
leia (A[I])
C[I]<-(A[I])
fimpara
para I de 1 ate 30 passo 1 faca
escreval ("o valor do vetor A é da posição C:",C[I])
fimpara
para I de 1 ate  30 passo 1 faca
escreval ("digite um num para B:",I)
leia (B[I])
C[I+2]<-(B[I])
fimpara
para I de 1 ate 50 passo 1 faca
escreval (C[I])
fimpara
// Seção de Comandos 
fimalgoritmo
