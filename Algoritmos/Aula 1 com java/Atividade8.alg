algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 02/04/2019
// Se��o de Declara��es 
var
numero1:inteiro
numero2:inteiro
x:inteiro
a:real
inicio
escreval (" Escreva um n�mero. ")
leia(numero1)
escreval (" Escreva outro n�mero. ")
leia(numero2)
escreval (" Entre com o n�mero da op��o abaixo ")
escreval (" 1- soma ")
escreval (" 2- subitra��o")
escreval (" 3- multiplica��o ")
escreval (" 4- divis�o ")
escreval("5-sair")
leia(x)
escolha x
caso 1
   a<-numero1+numero2
caso 2
   a<-numero1-numero2
caso 3
   a<-numero1*numero2
caso 4
   a<-numero1/numero2
outrocaso
   escreval (" a op��o � inv�lida! ")
   a<-x
fimescolha
escreval (" O resultado � ",a)
// Se��o de Comandos 
fimalgoritmo
