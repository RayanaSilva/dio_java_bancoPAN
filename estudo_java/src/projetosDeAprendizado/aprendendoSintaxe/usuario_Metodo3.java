package projetosDeAprendizado.aprendendoSintaxe;

public class usuario_Metodo3 {
    public static void main(String[] args) throws Exception {
        
        smartTv_Metodo3 smartTv_Metodo3 = new smartTv_Metodo3();
   
        System.out.println("TV ligada? " + smartTv_Metodo3.ligada);
        System.out.println("Canal: " + smartTv_Metodo3.canal);
        System.out.println("Volume: " + smartTv_Metodo3.volume);

        smartTv_Metodo3.ligar();
        System.out.println("\nTV foi ligada? " + smartTv_Metodo3.ligada);
        smartTv_Metodo3.diminuirVolume();
        smartTv_Metodo3.diminuirVolume();
        smartTv_Metodo3.diminuirVolume();
        System.out.println("\nVolume: " + smartTv_Metodo3.volume);

        smartTv_Metodo3.mudarCanal(8);
        System.out.println("\nCanal: " + smartTv_Metodo3.canal);
        smartTv_Metodo3.aumentarCanal();
        smartTv_Metodo3.aumentarCanal();
        smartTv_Metodo3.aumentarCanal();
        smartTv_Metodo3.aumentarCanal();

        System.out.println("\nTV ligada? " + smartTv_Metodo3.ligada);
        System.out.println("Canal: " + smartTv_Metodo3.canal);
        System.out.println("Volume: " + smartTv_Metodo3.volume);

    }
    
}
