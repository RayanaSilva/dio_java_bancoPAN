package exercicios;

import java.util.Scanner;

/* Nome e Idade: Faça um programa que leia conjuntos de dois valores, 
 * o primeiro representando o nome do aluno e o segundo representando a sua idade.
 * (Pare o programa inserindo o valor 0 no campo nome) 
 */

public class NomeIdade {

    public static void main(String[] args) {
        int contador = 1;

        Scanner ler = new Scanner(System.in);

        while (contador != 0) {
            System.out.println("\nInsira seu nome: ");
            String nome = ler.next();
            System.out.println("Insira sua idade: ");
            int idade = ler.nextInt();

            System.out.println("\nNome digitado: " + nome);
            System.out.println("Idade digitada: " + idade);
            contador++;
            System.out.println("\nDigite 0 para sair ou 1 para continuar: ");
            contador = ler.nextInt();

        }
    }
}
