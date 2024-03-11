/*
public class main {
    public static void main(String[] args) {
        // Exercicio 1 lista 2
    double graus;
    Scanner leitor=new Scanner(System.in);
    graus = leitor.nextDouble();
    System.out.printf("Graus em Fahrenheit é: %.2f\n",graus*1.8+32);
    System.out.printf("Graus em Rankine é: %.2f\n",graus*1.8+491.67);
    }
}*/

/*

public class Ex2 {
    public static void main(String[] args) {
        System.out.println("Exercicio 2");
        int numero, b = 0;
        Scanner leitor = new Scanner(System.in);
        numero = leitor.nextInt();
        int unidade = numero % 10; // 4
        numero /= 10; // 123
        int dezena = numero % 10; // 3
        numero /= 10; // 12
        int centena = numero % 10; // 2
        numero /= 10; // 1
        int miliar = numero;
        b= unidade+dezena+centena+miliar;
        System.out.printf("%d",b);

    }
}
*/
/*
import java.util.Scanner;
import java.time.LocalDate;//para usar LocalDate tem que importar!
public class ex3
{
    public static void main(String[] args)
    {
      Exercicio 3
        LocalDate hoje=LocalDate.now();//LocalDate.now é para pegar a data de hoje!
        String data;

        Scanner leitor=new Scanner(System.in);
        System.out.println("Dia de hoje " + hoje);

        System.out.println("Digite o ano, mes e dia como o exemplo a Seguir(2023-05-01): ");
        data=leitor.next();

        LocalDate data1 =LocalDate.parse(data);

        System.out.println("Idade:: "+hoje.compareTo(data1));//compareTo é para comparar duas datas!
    }

}*/
