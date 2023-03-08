package exercicios;
/** @author: Rayana Silva */
import java.util.Scanner;

/*
 * Par e Ímpar: Faça um programa que peça N números inteiros. 
 * Calcule e mostre a quantidade de números pares e a quantidade de números impares.
 */
public class ParEImpar {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);
        int cont=1, n, numero, par=0, impar=0;

        System.out.println("Quantos números gostaria de informar? ");
        n = ler.nextInt();
        do {
            System.out.println("Digite um número desejado: ");
            numero = ler.nextInt();
            if (numero % 2 == 0) {
                par++;
            } else {
                impar++;
            }

            cont++;
        } while (cont <= n);

        System.out.println("\nO total de números pares digitados foi: " + par);
        System.out.println("O total de números impares digitados foi: " + impar);
    }
}
