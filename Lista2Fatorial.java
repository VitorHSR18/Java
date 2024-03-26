import java.util.Scanner;

public class Main
{
    public static int [][] Matriz(int[][] Mat,int l ,int c) {

        int auxl, auxc, valor, cont = l-1;
        for (auxc = 1; auxc < c; auxc++) {
            for (valor=0,auxl = 1; auxl <= l-1 - cont; auxl++) {
                 valor += auxl * auxc;
                Mat[auxl][auxc] = valor;
            }
            cont--;
        }
        return Mat;
    }


    public static void main(String[] args) {
        int c, l, mat[][], i, j;
        System.out.println("Fale a linha e coluna da matriz");
        Scanner leitor = new Scanner(System.in);
        c = leitor.nextInt();
        l = leitor.nextInt();

        mat = new int[l][c];
        Matriz(mat, c, l);
        int cont= l-1;

        for (j = 1; j < c; j++) {
            for (i = 1; i <= l-1 - cont; i++) {
                System.out.printf("%d ", mat[i][j]);
            }
            System.out.println("\n");
            cont--;
        }
    }
}
