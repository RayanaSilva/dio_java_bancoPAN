package exercicios;

import java.util.Scanner;

/* 
 * Nota: Faça um programa que peça uma nota, entre zero e dez.
 * Mostre uma mensagem caso o valor seja inválido e continue pedindo
 * até que o usuário informe um valor válido. 
 */

public class Nota {
    
    public static void main(String[] args){
        int nota;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite uma nota: ");
        nota = ler.nextInt();

        while (nota > 10){
            System.out.println("\nValor inválido! \nDigite outra nota: ");
            nota = ler.nextInt();
        }

        System.out.println("Saindo do programa.. ");
    }

}
