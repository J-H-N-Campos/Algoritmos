import java.util.Scanner;
public class Atividade2 {
     public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
         int i=4,j=2,dif=0,igual=0,maior=0,a=0;
         int vet[][] = new int[i][j];
         int vet2[][] = new int[i][j];
         for (int c = 0;c<i;c++){
            for (int d = 0;d<j;d++){
                System.out.println("Linha: "+(c+1)+", Coluna: "+(d+1));
                System.out.println("Informe um valor");
                vet[c][d] = s.nextInt();
                if(vet[c][d] > 30){
                    maior++;
                }if(vet[c][d] == 30){
                    igual++;
                }else{
                    dif++;
                }
            }
        }
         System.out.println("Matriz principal:");
         for (int c = 0;c<i;c++){
            for (int d = 0;d<j;d++){
            System.out.print(vet[c][d]+"\t");
            if(vet[c][d]!=30){
                vet2[c][d] = vet[c][d];
            }else{
                vet2[c][d] = 0;
            }
            }
             System.out.println();
            }
         System.out.println();
         System.out.println("Valores maiores do que 30: "+maior);
         System.out.println();
         System.out.println("Matriz com os elementos diferentes de 30 :");
         for (int c = 0;c<i;c++){
            for (int d = 0;d<j;d++){
                System.out.print(vet2[c][d]+"\t");
            }
             System.out.println();
         }
     }   
}
