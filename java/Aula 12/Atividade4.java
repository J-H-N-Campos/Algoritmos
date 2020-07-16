public class Atividade4
{
public static void main(String[] args)
{
int[][] matriz = {{16, 3, 2, 13}, {5, 10, 1, 8}, {9, 6, 7, 12}, {4, 15, 14, 1}};
int[] vetorSomaLinha = new int[matriz.length], vetorSomaColuna = new int[matriz.length];
int diagonal = 0, diagonalSecundaria = 0, diagonais = 0, linhasEdiagonais = 0, linhasColunasEDiagonais = 0;


for (int i = 0; i < matriz.length; i++)
{
for (int j = 0; j < matriz[i].length; j++)
{
vetorSomaLinha[i] += matriz[i][j];
vetorSomaColuna[i] += matriz[j][i];
if (i == j)
{
diagonal += matriz[i][j];
}
if (j == matriz[i].length - j)
{
diagonalSecundaria += matriz[i][j];
}
}
}

for (int i = 0; i < matriz.length; i++)
{
if (diagonal == diagonalSecundaria)
{
diagonais = diagonal;
}
if (vetorSomaLinha[i] == diagonais)
{
linhasEdiagonais = diagonais;
}
if (vetorSomaColuna[i] == linhasEdiagonais)
{
linhasColunasEDiagonais = diagonais;
}
}
if (linhasColunasEDiagonais != 0)
{
System.out.println("Quadrado Perfeito:" + linhasColunasEDiagonais);
}else{
System.out.println("Não é quadrado mágico");
}
}
}

      