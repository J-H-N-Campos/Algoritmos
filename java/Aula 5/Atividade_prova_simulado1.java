/*Jo�o � dono de uma pequena padaria e deseja calcular o pre�o de custo dos
p�ezinhos que produz. Para fazer um lote (uma fornada) ele usa sempre uma hora do
servi�o do padeiro e uma hora de forno. O que varia o pre�o de custo � a quantidade
de p�es que produz por lote. Para cada unidade s�o consumidos 50g de farinha pronta
(um preparado especial) e �gua. O custo da �gua � desprez�vel. Fa�a um programa
para ajudar o Jo�o a calcular o custo de um p�o. O programa deve solicitar o valor da
hora do padeiro, o valor de uma hora de forno, o valor de 1 kg de farinha e quantos
p�es ele deseja fazer naquele lote (considere um lote razo�vel e vi�vel, mas �
desprez�vel o tamanho m�ximo do lote). */
public class Atividade_prova_simulado1
{
  public static void main (String[] args)
  {
    double hpadeiro=0;
    double vforno=0;
    double vfarinha=0;
    double qpaes=0;
    double custo=0;
    double custoFinal=0;
      hpadeiro=Entrada.leiaDouble("digite o valor da hora de 1 hora do padeiro");
      vforno=Entrada.leiaDouble("digite o valor da hora de 1 hora de forno");
      vfarinha=Entrada.leiaDouble("digite o valor de farinha");
      qpaes=Entrada.leiaDouble("digite a quantidade de paes");
      
      custo=(hpadeiro+vforno+vfarinha*qpaes);
      custoFinal=(custo/50);
      
      
    System.out.println("o custo de td e;"+custoFinal);
  }
}




      
      
      
    
    