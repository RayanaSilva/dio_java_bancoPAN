package introducaoJava;
import java.util.Scanner; // 1. Importando a classe Scanner

public class tiposVariaveis {
    public static void main(String[] args) {
        int idade;            //Número inteiro
        double altura;        //Número real
        String nome;          //Palavras e frases
        String frase;         //Palavras e frases

        Scanner ler = new Scanner(System.in); // 2. Instanciando e criando um objeto Scanner

        System.out.println("Qual seu nome: ");
        nome = ler.next();           // 3. Entrada de dados (Lendo uma palavra)
        System.out.println("Qual sua idade: ");
        idade = ler.nextInt();       // 3. Entrada de dados (Lendo um valor inteiro)
        System.out.println("Qual sua altura: ");
        altura = ler.nextDouble();   // 3. Entrada de dados (Lendo um valor real)
        ler.nextLine();
        System.out.println("Qual sua frase preferida: ");
        frase = ler.nextLine();      // 3. Entrada de dados (Lendo uma frase)
        ler.close();
        
        System.out.println("\nPrazer " + nome + ", parabéns pelos seus " + idade + "anos e " + altura + " de altura! \nAdorei sua citação: \"" + frase + "\"");
        
    }

}
