//esse programa constroi um vetor[7] de numeros inteiros e decimais
//ele calcula a media do vetor digitado por voce
//mostra para voce os resultados da media e acima da media, conforme a formula colocada no programa
public class Ex3 {
  public static  void main (String args[]) {
    //variaveis de numeros inteiros e decimais
    double media,soma; 
    int cont;
    media=0.0;
    soma=0.0;
    double[] temp = new double[7];
    //leitura do vetor armazenando-o em outra variavel
    for (int i=0; i < 7; i++)
          {
               temp[i] = Entrada.leiaDouble();
               soma=soma+temp[i];
          }
    //calculo usando uma formula na variavel (soma), e colocando-a em outra variavel (media)
          media=soma/7;
   //aqui um laco para definir o destino das variaveis
          //se (temp) for maior que a (media) entao esta acima da media
          // se nao, ela nao esta em cima da media
        cont=0; 
    for (int i=0; i < 7; i++)
          {    
    if (temp[i]>media) {
      cont++;
     
    }
    }
    for (int i=0; i < 7; i++)
          {    
    System.out.println(temp[i]);
     // aqui vai printar na tela a media e os acima da media
    }
    System.out.println("Media de temp:"+media);
    System.out.println("num de temp acima da media:"+cont);
    
    }
    }