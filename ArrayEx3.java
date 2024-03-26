import java.util.Scanner;



public class Main {
    public static int[][] preencherVetor(int l,int c,int min,int max){
        int vet[][],i,j;
        vet = new int[l][c];
        for (i=0;i<l;i++) {
            for (j = 0; j < c; j++) {
                vet[i][j] = (int) (Math.random() * (max - min) + min);
            }
        }
        return vet;
    }




    public static void main(String[] args) {
        int l,c,min,max,i,j,cont=0,a,s,valor;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o tamanho , minimo e o maximo do vetor");
        l = leitor.nextInt();
        c = leitor.nextInt();
        min = leitor.nextInt();
        max = leitor.nextInt();
        int vet[][]=preencherVetor(l,c,min,max);

        for(i=0;i<l;i++)
            for(j=0;j<c;j++)
            {
                System.out.printf("%d \n",vet[i][j]);
            }
        for(i=0;i<l;i++)
            for(j=0;j<c;j++) {
                valor = vet[i][j];
                for (a=0;a<l;a++) {
                    for (s = 0; s < c; s++) {

                        if (vet[a][s] == valor)
                            cont++;
                    }
                }
                if(cont<(l*c)/2)
                    System.out.println(false);
                else System.out.println(true);

            }

    }
}
