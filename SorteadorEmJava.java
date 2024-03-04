
public class Main {
    public static void main(String[] args) throws Exception // Tudo que eu colocar dentro do main eu não preciso tratar a excessão
    {
        System.out.printf("Sorte Grande - Versão 2024!");
        int max=27;
        double sorteado=(int)(Math.random()*27)+1;
        System.out.println("Aguarde estamos escolhendo um aluno..."     );
        Thread.sleep((int)(Math.random()*5+1)*1000);
        System.out.println("O aluno sortudo é o de número: "+sorteado);
    }
}
