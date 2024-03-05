import java.util.Scanner;
public class MeusModulos { 

    public static double lerValor(String mens) // criar uma função ( um módulo ) para ler os devidos valores
    {
        double valor;
        Scanner leitor=new Scanner(System.in);
        do{
            try {

                System.out.println(mens);
                valor = leitor.nextDouble();
            }
            catch(Exception e)
            {
                valor = -1;
                leitor.nextLine(); // esse leitor serve para esvaziar o buffer
            }
        }while(valor == -1);
        return valor;
    }
}
public class Main {

    public static void main(String[] args) {
        String nome;
        int peso;
        double altura , imc;
        Scanner leitor = new Scanner(System.in); // vai ler as variaveis
        System.out.println("Informe seu nome: ");
        nome=leitor.nextLine(); //melhor para ler strings
        peso=(int)MeusModulos.lerValor("Informe seu peso em KG");
        altura=MeusModulos.lerValor("Informe sua altura em metros: ");

        //System.out.println("Informe sua altura em metros: ");
        //altura = leitor.nextDouble(); le normal e converte em double
        imc = peso/Math.pow(altura,2);
        System.out.println("Seu IMC é"+imc);

    }
}
