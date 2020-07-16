algoritmo "semnome"
// Função :
// Autor :
// Data : 14/03/2019
// Seção de Declarações 
var
cont,qa,qb,qc,qd,nf:inteiro
nome:caracter
inicio
para cont de 1 ate 8 passo 1 faca
escreval ("digite seu nome:")
leia(nome)
escreval ("digite o numero de filhos")
leia(nf)
se (nf>=1) e (nf<=3) entao
qa<-qa+1
senao
se (nf>=4) e (nf<=7) entao
qb<-qb+1
se (nf>=8) entao
qc<-qc+1
senao
qd<-qd+1
fimse
fimse
fimse
fimpara
escreval ("o numero de pessoas com 1 a 3 filhos:", a)
escreval ("o numero de pessoas com 4 a 7 filhos:", b)
escreval ("o numero de pessoas com 8 ou mais:", c)
escreval ("o numero de pessoas que n tem", d)

// Seção de Comandos 
fimalgoritmo
