algoritmo "semnome"
// Função :
// Autor :
// Data : 28/02/2019
// Seção de Declarações 
var
valor: real
qtd: inteiro
inicio
escreva("Informe o valor a vista: ")
leia(valor)
escreva("Informe a quantidade de vezes (1- a vista, ou até 3): ")
leia(qtd)
enquanto ((qtd < 1) OU (qtd > 3)) faca
escreva("Quantidade de vezes inválida. Reinforme a quantidade de vezes (1- a vista, ou até 3): ")
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

// Seção de Comandos 
fimalgoritmo
