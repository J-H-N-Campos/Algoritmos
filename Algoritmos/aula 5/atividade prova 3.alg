algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 14/03/2019
// Se��o de Declara��es 
var
cont,idade,qa,qb,qc,qd:inteiro
nome,sexo:caracter
inicio
Para cont de 1 ate 10 passo 1 faca
escreval ("digite o nome")
leia (nome)
escreval (" digite a idade")
leia (idade)
escreval (" digite o sexo")
leia (sexo)
se (sexo="M") entao
qa<-qa+1
senao
qb<-qb+1
fimse
se (idade=18) entao
qd<-qd+1
senao
qc<-qc+1
fimse

escreval ("resultado")
escreval
escreval ("Mostrar quantas pessoas s�o do sexo masculino:",qa)
escreval ("mostrar quantas pessoas s�o do sexo feminino:", qb)
escreval ("mostrar quantas pessoas s�o menores de 18 anos:", qc)
escreval ("mostar quantas pessoas sao maiores de 18 anos:", qd)

// Se��o de Comandos 
fimenquanto
fimalgoritmo
