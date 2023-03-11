package exercicios;

/** @author: Rayana Silva */
import java.util.Scanner;

/* 
 * Consoantes: Faça um Programa que leia um vetor de 6 caracteres, 
 * e diga quantas consoantes foram lidas. Imprima as consoantes. 
 */
public class Consoante {
    public static void main (String[] args){
        Scanner ler = new Scanner(System.in);

        String[] consoantes = new String[6];
        int qntConsoante = 0;
        String letra;

        for (int i = 0; i < consoantes.length; i++) {
            System.out.print("Digite a " + (i+1) + "º letra: ");
            letra = ler.next();

            if ( !(letra.equalsIgnoreCase("a") | 
                letra.equalsIgnoreCase("e") | 
                letra.equalsIgnoreCase("i") | 
                letra.equalsIgnoreCase("o") |
                letra.equalsIgnoreCase("u"))){
                    consoantes[i] = letra;
                    qntConsoante++;
                }
        }

        System.out.print("\nConsoantes: ");
        for ( String consoante : consoantes) {
            if (consoante != null)
                System.out.print(consoante + ", ");
        }

        System.out.println("\n\nTotal de " + consoantes.length + " letras digitadas.");
        System.out.println("Total de " + qntConsoante + " consoantes digitadas." );
    }
}
