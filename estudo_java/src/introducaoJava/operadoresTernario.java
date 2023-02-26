package introducaoJava;
import java.util.Scanner;

public class operadoresTernario {
    
    public static void main(String[] args){
        int a, b;

        Scanner ler = new Scanner(System.in);

        System.out.println("Digite um número: ");
        a = ler.nextInt();          
        System.out.println("Digite outro número: ");
        b = ler.nextInt();

        /*  
         *  Esse operador ternário tem o mesmo resultado do if e else.
         *  Observe no código abaixo que temos a variável resultado. Ela será atribuída pelo retorno da resposta obtida pelo teste condicional.
         *  A primeira instrução, a direita do operador de atribuição, é a condição. Depois temos dois operadores importantes que são ? e o :.
         *  O ? é a instrução que será executada quando o teste condicional for verdadeiro. Já o operador : será executado quando o teste condicional for falso.
         */
        String resultado = a==b ? "Números iguas." : "Números diferentes.";

        ler.close();

        System.out.println("\n\nResultado código simplificado: " + resultado);

        /*Esse código abaixo se resume em uma única linha(15) de código */
        if(a==b)
            resultado = "Números iguais";
        else
            resultado = "Números diferentes";
        
        System.out.println("Resultado do if/else: " + resultado + "\n\n");



    }
}
