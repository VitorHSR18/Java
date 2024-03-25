import java.util.Scanner;



public class Main {
public static int[] preencherVetor(int tam,int min,int max){
    int vet[],i;
    vet = new int[tam];
    for (i=0;i<tam;i++)
    {
        vet[i] = (int)(Math.random()*(max-min)+min);
    }
    return vet;
}




    public static void main(String[] args) {
       int tam,min,max,i;
       Scanner leitor = new Scanner(System.in);
       System.out.println("Digite o tamanho , minimo e o maximo do vetor");
       tam = leitor.nextInt();
       min = leitor.nextInt();
       max = leitor.nextInt();
       int vet[]=preencherVetor(tam,min,max);

       for(i=0;i<max;i++)
       {
           System.out.printf("%d\n",vet[i]);
       }
    }
}
