algoritmo "semnome"
// Função :
// Autor :
// Data : 07/03/2019
// Seção de Declarações 
var
nome,tipos_de_aposentos: caracter
valor,val_consumo,val_diarias,valor_total,valor_taxa,total_geral,num_diarias,servico,valor_total_dias,subt: real
inicio
escreva("Informe o nome do hóspede")
escreval(" o tipo de aposentos")
escreval (" a quantidade de diárias")
escreval ("valor do consumo interno")
   leia(nome)
   leia(tipo_de_aposentos)
   leia(num_diarias)
   leia(val_consumo)
   escreval ("A-R$150,00 B-R$ 120,00 C-R$80,00 D-R$50,00
escreval ("escolha (tipo_de_aposentos")
      se (ta "A") entao
      valor_diarias <-150
      senao
      (ta"B") entao
      valor_diarias <-120
      senao
      se (ta "C") entao
      valor_diarias <-80
      senao
      se (ta"D") entao
      valor_diarias <-50
      
         escreval("Tipo_de aposentos")
         val <- 0
   fimescolha
   val_diarias <- val * num_diarias
   val_total <- val_diarias + val_consumo
   val_taxa <- val_total * 0.1
   total_geral <- val_total + val_taxa
   escreval("Conta Final")
   escreval(nome)
   escreval ("qual de apartamento: ", "tipo_de_aposentos", " - Quantidade_de_diárias: ", "num_diarias, " - "Valor da diária: ", val)
   escreval(". Valor total das diárias: ", val_diarias)
   escreval(". Valor do consumo interno: ", val_consumo)
   escreval(". subtotal: ", val_total)
   escreval("qual o valor da taxa de serviço:", valor_de_taxas")
   escreval(". Total geral: ", total_geral)
// Seção de Comandos 
fimalgoritmo
