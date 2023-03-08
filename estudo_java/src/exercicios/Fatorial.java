package exercicios;
/** @author: Rayana Silva */
import java.util.Scanner;

/*
 * Fatorial: Faça um programa que calcule o fatorial de um 
 * número inteiro fornecido pelo usuário. 
 * Ex.: 5!=5.4.3.2.1=120
 */

public class Fatorial {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);
        int numero, fatorial=1;

        System.out.print("Digite um número inteiro: ");
        numero = ler.nextInt();
        
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        
        System.out.println("O fatorial de " + numero + " é " + fatorial);
    }
}