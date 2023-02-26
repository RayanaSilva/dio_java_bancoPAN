package introducaoJava;
import java.util.Scanner;

public class operadoresLogicos {
    public static void main (String [] args){
        
        Scanner ler = new Scanner(System.in);
 
        System.out.print("Digite a idade do nadador: ");
        int idade = ler.nextInt();

        if (idade >= 5 && idade <= 7) {
            System.out.println("Categoria: Infantil A");
        } else if (idade >= 8 && idade <= 11) {
            System.out.println("Categoria: Infantil B");
        } else if (idade >= 12 && idade <= 13) {
            System.out.println("Categoria: Juvenil A");
        } else if (idade >= 14 && idade <= 17) {
            System.out.println("Categoria: Juvenil B");
        } else {
            System.out.println("Categoria: Adultos");
        }
        
        ler.close();

    }
    
}
