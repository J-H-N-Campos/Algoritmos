algoritmo "semnome"
// Fun��o :
// Autor :
// Data : 01/04/2019
// Se��o de Declara��es
var
numero,fal,cont,verd:inteiro
inicio
cont<-1
enquanto (cont<=100) faca
escreval ("digite um numero")
leia (numero)
     se (numero mod 2=0) entao
     verd<-verd+1
     escreval ("caminho da direita")
     senao
     fal<-fal+1
     escreval ("8")
     fimse
cont<-cont+1
fimenquanto
escreval ("soma dos falsos:",fal)


// Se��o de Comandos 
fimalgoritmo
