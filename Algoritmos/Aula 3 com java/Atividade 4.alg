algoritmo "semnome"
// Função :
// Autor :
// Data : 30/04/2019
// Seção de Declarações 
 //Dado um vetor A de N números reais, obter a maior
//diferença entre dois elementos consecutivos deste vetor
var
a,b:vetor[1..5] de real
r:inteiro
inicio
para r de 1 ate 5 passo 1 faca
escreval ("digite um numero")
leia (a[r])
fimpara
para r de 1 ate 5 passo 1 faca
escreval ("digite o segundo numero")
leia (b[r])
fimpara
para r de 1 ate 5 passo 1 faca
se (a[r])>(b[r]) entao
escreval ("diferencas")
escreval ("os  numeros maiores:",a[1],",",a[2],",",a[3],",",a[4],",",a[5])
escreval ("os  numeros menores:",b[1],",",b[2],",",b[3],",",b[4],",",b[5])
senao
se (a[r])<(b[r]) entao
escreval ("os  numeros menores:",b[1],",",b[2],",",b[3],",",b[4],",",b[5])
escreval ("os  numeros menores:",a[1],",",a[2],",",a[3],",",a[4],",",a[5])
fimse
fimse
fimpara

// Seção de Comandos 
fimalgoritmo
