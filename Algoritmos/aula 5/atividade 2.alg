algoritmo "semnome"
// Função :
// Autor :
// Data : 14/03/2019
// Seção de Declarações 
var
cont,idade,qa,qb,qc,qd:inteiro
sexo:caracter
inicio
cont<-1
enquanto (cont<=5) faca
escreval ("digite a idade")
leia (idade)
escreval ("digite o sexo")
leia (sexo)
se (sexo="m") entao
qa<-qa+1
senao
qb<-qb+1
fimse
se (idade <=30) entao
qc<-qc+1
senao
se (idade>=60) entao
qd<-qd+1
fimse
fimse
cont<-cont+1
fimenquanto
escreval ("resultado")
escreval
escreval ("Número de pessoas do sexo masculino:", qa)
escreval ("Número de pessoas do sexo feminino:", qb)
escreval (" Número de pessoas com idade até 30 anos:", qc)
escreval (" Número de pessoas com idade igual ou superior a 60 anos:", qd)
// Seção de Comandos
fimalgoritmo
