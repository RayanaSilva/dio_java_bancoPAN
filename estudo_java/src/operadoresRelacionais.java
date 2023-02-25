import java.util.Scanner;

public class operadoresRelacionais {
    public static void main(String[] args){
        int numero1, numero2;
        String nomeUm, nomeDois;

        Scanner ler = new Scanner(System.in);

        /* 
         * Comparando palavras.
         * Para compara nomes ou objetos é necessário utilizar o .equals 
         * */
        System.out.println("Digite um nome: ");
        nomeUm = ler.next();
        System.out.println("Digite outro nome: ");
        nomeDois = ler.next();

        System.out.println("Os nomes digitados são iguais? " + nomeUm.equals(nomeDois));

        /* Comparando números. */
        System.out.println("\n\nDigite o primeiro número 1: ");
        numero1 = ler.nextInt();
        System.out.println("Digite o segundo número 2: ");
        numero2 = ler.nextInt();

        boolean simNao = numero1 == numero2;

        System.out.println("Número 1 é igual ao Número 2? " +simNao);

        ler.close();

    }
}
