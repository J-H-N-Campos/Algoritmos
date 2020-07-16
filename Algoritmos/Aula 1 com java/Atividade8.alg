algoritmo "semnome"
// Função :
// Autor :
// Data : 02/04/2019
// Seção de Declarações 
var
numero1:inteiro
numero2:inteiro
x:inteiro
a:real
inicio
escreval (" Escreva um número. ")
leia(numero1)
escreval (" Escreva outro número. ")
leia(numero2)
escreval (" Entre com o número da opção abaixo ")
escreval (" 1- soma ")
escreval (" 2- subitração")
escreval (" 3- multiplicação ")
escreval (" 4- divisão ")
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
   escreval (" a opção é inválida! ")
   a<-x
fimescolha
escreval (" O resultado é ",a)
// Seção de Comandos 
fimalgoritmo
