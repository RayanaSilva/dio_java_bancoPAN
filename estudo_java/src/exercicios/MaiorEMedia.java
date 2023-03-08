package exercicios;
/** @author: Rayana Silva */
import java.util.Scanner;

/* Maior e Média: Faça um programa que leia 5 números e informe 
 * o maior número e a média desses números. 
 */

public class MaiorEMedia {
    public static void main(String[] args){

        int numero;    
        int i = 0;   
        int maior = 0;
        int soma = 0;

        Scanner ler = new Scanner(System.in);

        do {
            System.out.println("Digite um número: ");
            numero = ler.nextInt();

            soma += numero;

            if(numero>maior) maior = numero;
            
            i++;

        } while (i<5);

        System.out.println("\nO maior número digitado foi: " + maior);
        System.out.println("A média de todos números digitados foi: " + (soma/5));
    }
}
