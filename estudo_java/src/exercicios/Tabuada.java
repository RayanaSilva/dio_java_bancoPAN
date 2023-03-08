package exercicios;
/** @author: Rayana Silva */
import java.util.Scanner;

/* Tabuada: Desenvolva um gerador de tabuada, capaz de gerar a tabuada 
 * de qualquer número inteiro entre 1 a 10. O usuário deve informar de 
 * qual numero ele deseja ver a tabuada. A saída deve ser conforme o 
 * exemplo abaixo:
 * Tabuada de 5: 5 X 1 = 5 5 X 2 = 10 ... 5 X 10 = 50 
 */

public class Tabuada {
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        int numero, resultado;

        System.out.println("De qual número deseja saber a tabuada: ");
        numero = ler.nextInt();

        for(int i=1; i <=10; i++){
            resultado = numero*i;
            System.out.println(numero + " x " + i + " = " + resultado);
        }
    }
}
