package exercicios;
/** @author: Rayana Silva */
import java.util.Random;

/* 
 * Array Multidimensional: Gere e imprima uma matriz M 4x4 com 
 * valores aleatórios entre 0-9. Após isso determine o menor número 
 * da matriz e a sua posição(linha, coluna). 
 */

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] M = new int[4][4];

        for(int i = 0; i < M.length; i++){               // Esse for é para poder pecorrer a linha da Matriz
            for(int j = 0; j < M[i].length; j++){        // Esse for é para poder pecorrer a coluna da Matriz
                M[i][j] = random.nextInt(9);      // Armazenar os dados na Matriz
            }
        }

        System.out.println("Matriz: ");
        for (int[] linha : M) {                         // Para ler os dados da linha da Matriz
            for (int coluna : linha) {                  // Para ler os dados da coluna da MAtriz
                System.out.print(coluna + " ");         // Imprimir oa dados da primeira linha
            }  
            System.out.println();                       // Pula uma linha para poder recomeçar a imprimir os dados da próxima linha.
        }
    }
}
