
import java.util.Calendar;
import java.util.Scanner;

public class PostoDeGasolina {

    public static int litrosAbastecer() {
      int litros;
        Scanner litrosAbastecer = new Scanner(System.in);

        System.out.println("Digite quantos litros de gasolina deseja abastecer:");
        litros = litrosAbastecer.nextInt();

        return litros;
    }

    public static double definePreco() {
        int tipoGasolina;
        double preco = 0;

        Scanner precoGasolina = new Scanner(System.in);

        System.out.println("Escolha o tipo de gasolina que desejas (pelo número):\n");
        System.out.println("1 - comum - R$ 4,90");
        System.out.println("2 - aditivada - R$ 5,20");
        System.out.println("3 - premium R$ 5,75\n");
        tipoGasolina = precoGasolina.nextInt();
        while (tipoGasolina < 1 && tipoGasolina > 3) {
            tipoGasolina = precoGasolina.nextInt();
        }

        switch (tipoGasolina) {
            case 1:
                preco = 4.9;
                break;
            case 2:
                preco = 5.2;
                break;
            case 3:
                preco = 5.75;
                break;
            default:
                preco = 0;
        }

        return preco;
    }

    public static double abastecerCarro(int litrosGasolina, double precoGasolina) {
        double precoFinal = litrosGasolina * precoGasolina;

        System.out.println("Veiculo abastecido!\n"
                + "\nValor a pagar: " + precoFinal);

        return precoFinal;
    }

    public static void contarEntradaDinheiro(int abastecidas) {
        double entrada = 0;
        for (int i = 0; i < abastecidas; i++) {
            entrada += abastecerCarro(litrosAbastecer(), definePreco());
        }

        System.out.println ("\nValor total a pagar " + entrada);
    }

    public static void main(String[] args) {
        int abastecidas = 0;
        Scanner abastecer = new Scanner(System.in);
        
        System.out.println("Digite quantas abastecidas necessita:");
        abastecidas = abastecer.nextInt();
        
        contarEntradaDinheiro(abastecidas);
    }
}
