package exercicios;
/** @author: Rayana Silva */
import java.util.Scanner;

/* Ordem Inversa: Faça um Programa que leia um vetor de 
 * 5 números inteiros e mostre-os na ordem inversa. 
 */

public class OrdemInversa {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        int[] vetor = new int[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i+1) + "º número: ");
            vetor[i] = ler.nextInt();
        }

        System.out.print("\nVetor na ordem inversa que foi digitado: ");
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }
    }
}
