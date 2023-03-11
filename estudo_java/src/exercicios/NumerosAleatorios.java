package exercicios;

import java.util.Random;

/* 
 * Números Aleatórios: Faça um Programa que leia 20 números inteiros 
 * aleatórios (entre 0 e 100) armazene-os num vetor. Ao final, mostre 
 * os números e seus sucessores. 
 */

public class NumerosAleatorios {
    public static void main (String[] args){
        Random random = new Random();
        int [] numerosAleatorios = new int[20];
        int numeros;

        for(int i = 0; i < numerosAleatorios.length ; i++){
            numeros = random.nextInt(100);
            numerosAleatorios[i] = numeros;
        }

        System.out.print("Numeros aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.print(numero + ", ");

        }

        System.out.print("\nNumeros sucessores: ");
        for (int numero : numerosAleatorios) {
            System.out.print((numero + 1) + ", ");
        }

    }
}
