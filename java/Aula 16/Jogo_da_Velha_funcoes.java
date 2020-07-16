
public class Jogo_da_Velha_funcoes {

    static int linha, coluna;
    static char[][] matrizVelha;

    public static void main(String args[]) {
        linha = coluna = 0;
        matrizVelha = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizVelha[i][j] = '-';
            }
        }
        System.out.println("    0     1     2");
        System.out.println("0  [ ]   [ ]   [ ]");
        System.out.println("1  [ ]   [ ]   [ ]");
        System.out.println("2  [ ]   [ ]   [ ]");

        for (int i = 0; i < 9; i++) {
            if (i % 2 == 0) {
                Jogar(1, 'O');
                i = VerificaVitoria(1, 'O', i);

            } else {
                Jogar(2, 'X');
                i = VerificaVitoria(2, 'X', i);
            }
        }
        System.out.println();
        System.out.println("###############################");
        System.out.println("          GAME OVER!!!         ");
        System.out.println("###############################");

    }

    public static void Jogar(int jogador, char xo) {
        System.out.println("JOGADOR " + jogador);
        System.out.println("Escolha a linha: ");
        linha = Entrada.leiaInt();
        System.out.println("Escolha a coluna: ");
        coluna = Entrada.leiaInt();
        matrizVelha[linha][coluna] = xo;
        for (int a = 0; a < 3; a++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizVelha[a][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int VerificaVitoria(int jogador, char xo, int i) {
        if ((matrizVelha[0][0] == xo && matrizVelha[1][0] == xo && matrizVelha[2][0] == xo)
                || (matrizVelha[0][1] == xo && matrizVelha[1][1] == xo && matrizVelha[2][1] == xo)
                || (matrizVelha[0][2] == xo && matrizVelha[1][2] == xo && matrizVelha[2][2] == xo)
                || (matrizVelha[0][0] == xo && matrizVelha[0][1] == xo && matrizVelha[0][2] == xo)
                || (matrizVelha[1][0] == xo && matrizVelha[1][1] == xo && matrizVelha[1][2] == xo)
                || (matrizVelha[2][0] == xo && matrizVelha[2][1] == xo && matrizVelha[2][2] == xo)
                || (matrizVelha[0][0] == xo && matrizVelha[1][0] == xo && matrizVelha[2][0] == xo)
                || (matrizVelha[0][1] == xo && matrizVelha[1][1] == xo && matrizVelha[2][1] == xo)
                || (matrizVelha[0][0] == xo && matrizVelha[1][1] == xo && matrizVelha[2][2] == xo)
                || (matrizVelha[0][0] == xo && matrizVelha[1][0] == xo && matrizVelha[2][0] == xo)
                || (matrizVelha[0][1] == xo && matrizVelha[1][1] == xo && matrizVelha[2][1] == xo)
                || (matrizVelha[2][0] == xo && matrizVelha[1][1] == xo && matrizVelha[0][2] == xo)) {
            System.out.println("    GANHOU O JOGADOR " + jogador + "!!!");
            return 9;
        }
        return i;
    }

}
