algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 28/02/2019
// Se��o de Declara��es 
var
valor: real
qtd: inteiro
inicio
escreva("Informe o valor a vista: ")
leia(valor)
escreva("Informe a quantidade de vezes (1- a vista, ou at� 3): ")
leia(qtd)
enquanto ((qtd < 1) OU (qtd > 3)) faca
escreva("Quantidade de vezes inv�lida. Reinforme a quantidade de vezes (1- a vista, ou at� 3): ")
leia(qtd)
fimenquanto
se (qtd = 2) entao
valor <- valor * 1.1
senao
se (qtd = 3) entao
valor <- valor * 1.2
fimse
fimse
escreval("Valor a pagar: ", valor, " em ", qtd, " vezes")

// Se��o de Comandos 
fimalgoritmo
